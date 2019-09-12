import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner myObj = new Scanner(System.in);
        System.out.println("Write two numbers!");
        int a = myObj.nextInt();
        int b = myObj.nextInt();

        if (a == b){

        }
        else if (a > b) {
            System.out.println(a);
        }
        else if (a < b) {
            System.out.println(b);
        }

    }
}
