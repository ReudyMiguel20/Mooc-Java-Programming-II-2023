
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> thingsToDo;

    public TodoList() {
        thingsToDo = new ArrayList<>();
    }

    public void add(String task) {
        thingsToDo.add(task);
    }

    public void print() {
        for (int i = 0; i < thingsToDo.size(); i++) {
            System.out.println((i + 1) + ": " + thingsToDo.get(i));
        }


    }

    public void remove(int number) {
        if (thingsToDo.size() == 1){
            thingsToDo.clear();
        } else if (thingsToDo.size() >= 2){
            thingsToDo.remove(number - 1);
        }
    }
}
