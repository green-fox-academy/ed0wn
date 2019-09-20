import java.util.Arrays;
import java.util.List;

public class ShoppingList1 {
    public static void main(String[] args) {
//        We are going to represent a shopping list in a list containing strings.
//
//            Create a list with the following items.
//        Eggs, milk, fish, apples, bread and chicken
//        Create an application which solves the following problems.
//                  Do we have milk on the list?
//                  Do we have bananas on the list?
        List<String> shoppingList = Arrays.asList("eggs", "milk","fish", "apples", "bread", "chicken");
        String bananas="";
        for (int i = 0; i < shoppingList.size(); i++) {
            if (shoppingList.get(i)=="milk"){
                System.out.println("Milk is on the list");
            }
            if (shoppingList.get(i)=="bananas"){
                bananas=shoppingList.get(i);
            }
        }
        if (bananas=="bananas"){
            System.out.println("Bananas is on the list");
        }
        else{
            System.out.println("No bananas");
        }
    }
}
