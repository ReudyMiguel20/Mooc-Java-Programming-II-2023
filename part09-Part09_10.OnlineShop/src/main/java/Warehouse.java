
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> quantities;

    public Warehouse() {

        prices = new HashMap<>();
        quantities = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.quantities.put(product, stock);
    }

    public int price(String product) {
        for (String x : this.prices.keySet()) {
            if (x.equals(product)) {
                return this.prices.get(x);
            }
        }
        return -99;

    }

    public int stock(String product) {
        for (String x : this.quantities.keySet()) {
            if (x.equals(product)) {
                return this.quantities.get(x);
            }
        }
        return 0;
    }

    public boolean take(String product) {
        for (String x : this.quantities.keySet()) {
            if (x.equals(product) && this.quantities.get(x) >= 1) {
                int quantityProduct = this.quantities.get(x);
                quantityProduct -= 1;
                this.quantities.put(x, quantityProduct);
                return true;
            }
        }
        return false;

    }

    public Set<String> products() {
        Set setProducts = new HashSet<>();
        setProducts = this.prices.keySet();

        return setProducts;

    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.prices);
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
        final Warehouse other = (Warehouse) obj;
        if (!Objects.equals(this.prices, other.prices)) {
            return false;
        }
        return true;
    }

}
