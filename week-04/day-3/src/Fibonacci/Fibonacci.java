package Fibonacci;

public class Fibonacci {
  public int fibonacciCalculator(int index){
    if (index==0){
      return 0;
    } else if (index == 1){
      return 1;
    } else {
      return fibonacciCalculator(index-1)+fibonacciCalculator(index-2);
    }
  }
}
