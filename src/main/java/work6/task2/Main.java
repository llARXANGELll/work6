package work6.task2;

import work6.task3.SearchForDuplicateNames;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        BasketShop basketShop = new BasketShop();
        SearchForDuplicateNames mapEqualsName = new SearchForDuplicateNames();

//        Map<String, String> map = new HashMap<>();
//        map.put("122", "00");
//        map.put("123", "0");
//        map.put("12", "Sss");
        basketShop.addProduct("kola", 5);
        basketShop.updateProductQuantity("kola", 3);
//        basketShop.clear();
        basketShop.updateProductQuantity("koa", 6);
        basketShop.getProducts();
    }
}
