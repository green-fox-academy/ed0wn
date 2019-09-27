public class NumberAdder {
  public static void main(String[] args) {
    int number =8;
    System.out.println(numberAdder(number));
  }

  public static int numberAdder(int number) {
    if (number == 0) {
      return 0;
    } else {
      return number + numberAdder(number-1);
    }

  }
}
