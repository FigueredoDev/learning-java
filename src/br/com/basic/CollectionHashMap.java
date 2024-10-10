package src.br.com.basic;

import java.util.HashMap;
import java.util.Map;

public class CollectionHashMap {
    public static void main(String[] args) {
        Map<String, Integer> productPrices = new HashMap<>();

        productPrices.put("apple", 10);

        var applePrice = productPrices.get("apple");
        System.out.println(applePrice);

        productPrices.forEach((key, value) -> System.out.println(key + " : " + value));

        for (Map.Entry<String, Integer> entry : productPrices.entrySet()) {
            String productName = entry.getKey();
            Integer productPrice = entry.getValue();

            System.out.println("The product name is: " + productName + " and the price is: " + productPrice);
        }
    }
}