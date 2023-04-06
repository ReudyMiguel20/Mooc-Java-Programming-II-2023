package mooc;
import mooc.logic.ApplicationLogic;
import mooc.ui.UserInterface;
import mooc.ui.TextInterface;

public class Main {

    public static void main(String[] args) {
        TextInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
