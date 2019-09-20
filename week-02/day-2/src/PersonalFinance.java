import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonalFinance {
    public static void main(String[] args) {
//        We are going to represent our expenses in a list containing integers.
//
//        Create a list with the following items.
//        500, 1000, 1250, 175, 800 and 120
//        Create an application which solves the following problems.
//                How much did we spend?
//                Which was our greatest expense?
//                Which was our cheapest spending?
//                What was the average amount of our spendings

        List<Integer> moneySpent = Arrays.asList(500, 1000,1250,175,800,120);
        int sum =0;
        for (int i = 0; i < moneySpent.size(); i++) {
            sum+=moneySpent.get(i);

        }
        System.out.println("How much did we spent? " + sum);
        int a, b=0;
        for (int i = 0; i < moneySpent.size(); i++) {
            a=moneySpent.get(i);
            if (a>b){
                b=a;
            }

        }
        System.out.println("Which was our greatest expense? " + b);
        b=1000000000;
        a=0;
        for (int i = 0; i < moneySpent.size(); i++) {
            a=moneySpent.get(i);
            if (a<b){
                b=a;
            }

        }
        System.out.println("Which was our cheapest spending? " + b);
        sum =0;
        for (int i = 0; i < moneySpent.size(); i++) {
            sum+=moneySpent.get(i);
            int avr= sum/moneySpent.size();
            a=avr;
        }
        System.out.println("What was the average amount of our spendings? " + a);
    }
}
