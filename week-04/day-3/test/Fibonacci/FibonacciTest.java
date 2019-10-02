package Fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
  Fibonacci test = new Fibonacci();

  @Test
  public void fibonacciCalculatorHasValue() {
    int result=test.fibonacciCalculator(8);
    assertEquals(21,result);
  }
  @Test
  public void fibonacciCalculatorZero() {
    int result=test.fibonacciCalculator(0);
    assertEquals(0,result);
  }
  @Test
  public void fibonacciCalculatorOne() {
    int result=test.fibonacciCalculator(1);
    assertEquals(1,result);
  }
}