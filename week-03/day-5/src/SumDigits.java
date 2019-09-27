public class SumDigits {
  public static void main(String[] args) {
    int number=127;
    System.out.println(sumDigits(number));
  }
  public static int sumDigits(int number){
    if (number==0){
      return 0;
    }
    else{
      return number%10+sumDigits(((number-1)/10));
    }

  }
}
