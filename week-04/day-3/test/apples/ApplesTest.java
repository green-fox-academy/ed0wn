package apples;

import static org.junit.Assert.*;

public class ApplesTest {
  Apples test = new Apples();

  @org.junit.Test
  public void getApple() {
    String result =test.getApple();
    assertEquals("apple", result);
  }
}