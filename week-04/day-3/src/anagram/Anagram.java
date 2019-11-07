package anagram;

import java.util.ArrayList;
import java.util.Collections;

public class Anagram {
  public boolean isAnagram(String word, String word2) {
    ArrayList<Character> first = new ArrayList<>();
    ArrayList<Character> second = new ArrayList<>();

    for (int i = 0; i < word.length(); i++) {
      first.add(word.charAt(i));
    }
    for (int i = 0; i < word2.length(); i++) {
      second.add(word2.charAt(i));
    }
    Collections.sort(first);
    Collections.sort(second);
    return first.equals(second);
  }
}
