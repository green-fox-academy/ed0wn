public class FizzBuzz {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print “Fizz” instead of the number
        // and for the multiples of five print “Buzz”.
        // For numbers which are multiples of both three and five print “FizzBuzz”.
        int a = 1;
        while (a <= 100){
            if (a%3 == 0 && a%5 == 0){
                System.out.println("FizzBuzz");
                a++;
            }
            else if (a%3 == 0) {
                System.out.println("Fizz");
                a++;
            }
            else if (a%5 == 0) {
                System.out.println("Buzz");
                a++;
            }
            else{
                System.out.println(a);
                a++;
            }

        }
    }
}
