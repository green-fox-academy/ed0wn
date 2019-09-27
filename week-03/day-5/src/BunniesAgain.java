public class BunniesAgain {
  public static void main(String[] args) {
    int numberOfBunnies = 8;
    System.out.println(bunnies(numberOfBunnies));
  }

  public static int bunnies(int numberOfBunnies) {
    if (numberOfBunnies == 0) {
      return 0;
    } else if (numberOfBunnies%2 ==0){
      return 2 + bunnies(numberOfBunnies - 1);
    } else {
      return 3 + bunnies(numberOfBunnies-1);
    }
  }
}
