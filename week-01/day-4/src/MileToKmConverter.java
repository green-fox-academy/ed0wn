import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter miles");
        double miles = myObj.nextDouble();
        double milesToKm = 1.609344;
        System.out.println(miles + " miles = " + miles*milesToKm + " km");
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
    }
}