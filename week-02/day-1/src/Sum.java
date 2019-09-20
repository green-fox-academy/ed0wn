import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        // Create the usual class wrapper and main method on your own.

        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter
        System.out.println("Give a number");
        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();

        System.out.println(sum(a));
    }

    public static int sum(int a) {

        int result= 0 ;
        for (int i=0; i <= a ; i++) {
            result+=i;
        }
        return result;


    }
}
