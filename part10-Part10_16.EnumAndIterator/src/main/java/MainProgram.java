
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        Employees university = new Employees();
        university.add(new Person("Petrus", Education.BA));
        university.add(new Person("Maria", Education.PHD));
        university.add(new Person("Service", Education.HS));

        university.print();

        university.print(Education.BA);
    }
}
