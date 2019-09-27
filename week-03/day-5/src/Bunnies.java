public class Bunnies {
  public static void main(String[] args) {
    int numberOfBunnies=8;
    System.out.println(bunnies(numberOfBunnies));
  }
  public static int bunnies(int numberOfBunnies){
    if (numberOfBunnies == 0){
      return 0;
    }
    else {
      return 2+bunnies(numberOfBunnies-1);
    }
  }
}
