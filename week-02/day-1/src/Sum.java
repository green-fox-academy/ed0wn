import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        // Create the usual class wrapper and main method on your own.

        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter


        sum();
    }

    public static int sum() {
        System.out.println("Give a number");
        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();
        int value[] = new int[a];
        int result= 0 ;
        for (int sum = value) {
            result += sum;
        }
        return result;


    }
}
