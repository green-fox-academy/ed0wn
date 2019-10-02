package countletters;

import java.util.HashMap;

public class CountLetters {
  public HashMap<String, Integer> countLetters(String word) {
    HashMap<String, Integer> countLetters = new HashMap<>();
    for (int i = 0; i < word.length(); i++) {
      int caseOfChars = 1;
      for (int j = 0; j < word.length(); j++) {
        if (i != j && word.charAt(i) == word.charAt(j)) {
          caseOfChars++;
        }
        countLetters.put(word.substring(i, i + 1), caseOfChars);
      }
    }
    return countLetters;
  }
}
