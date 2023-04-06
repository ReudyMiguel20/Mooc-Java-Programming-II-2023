
public class Hideout<T> {

    private T inHiding;

    public void putIntoHideout(T toHide) {
        this.inHiding = toHide;
    }

    public boolean isInHideout() {
        return this.inHiding != null;
    }

    public T takeFromHideout() {
        T previouslyInHiding = this.inHiding;
        this.inHiding = null;
        return previouslyInHiding;
    }
}

//
//import java.util.List;
//import java.util.ArrayList;
//import java.util.Random;
//
//public class Hideout<T> {
//
//    private List<T> list;
//
//    public Hideout() {
//        this.list = new ArrayList<>();
//    }
//
//    public void putIntoHideout(T toHide) {
//        this.list.add(toHide);
//    }
//
//    public T takeFromHideout() {
//        T thingToReturn;
//        if (this.list.isEmpty()) {
//            return thingToReturn = null;
//        }
//        thingToReturn = this.list.get(0);
//        this.list.remove(this.list.get(0));
//        return thingToReturn;
//    }
//
//    public boolean isInHideout() {
//        if (this.list.isEmpty()) {
//            return false;
//        }
//        return true;
//    }
//}
