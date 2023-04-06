
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> listEmployees;

    public Employees() {
        this.listEmployees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.listEmployees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(person -> this.listEmployees.add(person));
    }

    public void print() {
        Iterator<Person> iterator = this.listEmployees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        //this does the same things as the iterator but with stream().
        //        this.listEmployees.stream()
        //                .filter(s -> s.getEducation() == education)
        //                .forEach(s -> System.out.println(s));
        Iterator<Person> iterator = this.listEmployees.iterator();
        
        while (iterator.hasNext()){
            Person personInLine = iterator.next();
            if (personInLine.getEducation() == education){
                System.out.println(personInLine);
            }
        }

    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.listEmployees.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }

}
