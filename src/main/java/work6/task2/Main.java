package work6.task2;

import work6.task3.MapEqualsName;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        BasketShop basketShop = new BasketShop();
        MapEqualsName mapEqualsName = new MapEqualsName();

        Map<String, String> map = new HashMap<>();
        map.put("122", "00");
        map.put("123", "0");
        map.put("12", "Sss");
        System.out.println(mapEqualsName.isUnique(map));
//        basketShop.addProduct("kola", 5);
//        basketShop.removeProduct("kola");
//        basketShop.clear();
//        basketShop.updateProductQuantity("koa", 6);
//        basketShop.getProducts();
//        System.out.println(basketShop.getProducts());
    }
}
