import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Write 5 numbers!");
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        int c = myObj.nextInt();
        int d = myObj.nextInt();
        int e = myObj.nextInt();
        int sum = a+b+c+d+e;
        double average = (double) sum /5;

        System.out.println("Sum: " + sum + ", Average: " + average);

        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
    }
}
