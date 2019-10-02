package anagram;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  Anagram test =new Anagram();
  @Test
  public void isAnagramTrue() {
    String word= "listen";
    String word2= "silent";
    boolean result=test.isAnagram(word,word2);
    assertEquals(true, result);
  }
  @Test
  public void isAnagramFalse() {
    String word= "listenasdas";
    String word2= "silent";
    boolean result=test.isAnagram(word,word2);
    assertEquals(false, result);
  }
  @Test
  public void isAnagramSameWords() {
    String word="asd";
    String word2="asd";
    boolean result=test.isAnagram(word,word2);
    assertEquals(true, result);
  }
}