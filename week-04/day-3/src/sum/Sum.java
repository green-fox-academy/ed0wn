package sum;

import java.util.ArrayList;

public class Sum {
  ArrayList<Integer> numbers = new ArrayList<>();

  public int sum(ArrayList<Integer>numbers){
    int sum=0;
    for (int i = 0; i < numbers.size(); i++) {
      sum+=numbers.get(i);
    }
    return sum;
  }
}
