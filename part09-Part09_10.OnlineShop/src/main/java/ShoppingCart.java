
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

public class ShoppingCart {

    private Map<String, Item> mapItem;

    public ShoppingCart() {
        mapItem = new HashMap<>();
    }

    public void add(String product, int price) {
        /* adds an item to the cart that matches the product given as a parameter, 
        with the price given as a parameter.*/
        for (String x : this.mapItem.keySet()) {
            if (this.mapItem.containsKey(product)) {
                this.mapItem.get(product).increaseQuantity();
                return;
            }
        }

        Item newItem = new Item(product, 1, price);
        mapItem.put(product, newItem);

    }

    public int price() {
        /* returns the total price of the shopping cart. */
        int finalPrice = 0;
        for (Item x : mapItem.values()) {
            finalPrice += x.price();
        }
        return finalPrice;
    }

    public void print() {
        for (Item x : mapItem.values()) {
            System.out.println(x.toString());
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.mapItem);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ShoppingCart other = (ShoppingCart) obj;
        if (!Objects.equals(this.mapItem, other.mapItem)) {
            return false;
        }
        return true;
    }

}
