package countletters;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {
  CountLetters test=new CountLetters();

  @Test
  public void countLettersEmpty() {
    HashMap<String,Integer> empty= new HashMap<>();
    HashMap<String,Integer >testList=test.countLetters("");
    assertEquals(testList, empty);
  }
  @Test
  public void countLettersHasKeys() {
    HashMap<String,Integer> empty= new HashMap<>();
    HashMap<String,Integer> testList=test.countLetters("alma");
    empty.put("a",2);
    empty.put("l",1);
    empty.put("m",1);
    assertEquals(testList, empty);
  }
}