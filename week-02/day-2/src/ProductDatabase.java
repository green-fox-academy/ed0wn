import java.util.HashMap;
import java.util.Iterator;
import java.util.SplittableRandom;

public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();
        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        System.out.println("The price of the fish is: " + products.get("Fish"));
//        Iterator<String> itrKeys = products.keySet().iterator();
//        Iterator<Integer> itrValues = products.values().iterator();
        int expensive = 0;
        String prod = "";


        for (Integer price : products.values()) {
            if (price > expensive) {
                expensive = price;
            }
        }
        for (String productName : products.keySet()) {
            if (products.get(productName).equals(expensive)) {
                prod = productName;
            }
        }

        System.out.println(prod + " is the most expensive product with the price of: " + expensive);
        expensive = 0;
        for (Integer price : products.values()) {
            expensive += price;
        }
        System.out.println("The average price is: " + expensive / products.size());
        int below = 0;
        for (Integer price : products.values()) {
            if (price < 300) {
                below += 1;
            }
        }
        System.out.println("There are " + below + " products under 300");
        boolean exact125 = false;
        for (Integer price : products.values()) {
            if (price == 125) {
                exact125 = true;
            }
        }
        if (exact125 == true) {
            System.out.println("There are some products for 125");
        } else {
            System.out.println("There are no products for 125");
        }
        expensive = 1111111111;
        prod = "";
        for (Integer price : products.values()) {
            if (price < expensive) {
                expensive = price;
            }
        }
        for (String productName : products.keySet()) {
            if (products.get(productName).equals(expensive)) {
                prod = productName;
            }
        }
        System.out.println(prod + " is the cheapest product with the price of: " + expensive);
    }
}
