package work6.task2;

import java.util.*;

public class BasketShop implements Basket {

    private Map<String, Integer> map = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        map.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        map.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        map.put(product, quantity);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public List<String> getProducts() {
        Set<String> strings = map.keySet();
        return new ArrayList<>(strings);
    }

    @Override
    public int getProductQuantity(String product) {
        return map.get(product);
    }
}

