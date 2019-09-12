import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Write a number!");
        int number = myObj.nextInt();

        if (number%2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.
    }
}
