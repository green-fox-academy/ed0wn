package sum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {
  Sum test = new Sum();

  @Test
  public void sumEmptyList() {
    ArrayList<Integer> testList = new ArrayList<>(Arrays.asList());
    int result = test.sum(testList);
    assertEquals(0,result);
  }
  @Test
  public void sumMultipleElements() {
    ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(4,6,100));
    int result = test.sum(testList);
    assertEquals(110,result);
  }
  @Test
  public void sumSingleElement() {
    ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(4));
    int result = test.sum(testList);
    assertEquals(4,result);
  }
  @Test
  public void sumNull() {
    ArrayList<Integer> testList = null;
    int result = test.sum(testList);
    assertEquals(0,result);
  }
}