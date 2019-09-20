import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial
        System.out.println("write a number");
        Scanner myObj = new Scanner(System.in);
        int number = myObj.nextInt();
        System.out.println(factorial(number));
    }
    public static int factorial(int a){
        int fact=1;
        for (int i = 1; i <= a; i++) {
            fact=fact*i;
        }
        return fact;
    }
}
