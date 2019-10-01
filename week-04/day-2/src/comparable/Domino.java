package comparable;

import java.util.Arrays;

public class Domino implements Comparable<Domino> {
  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }


  public int compareTo(Domino that) {

    if (this.left == that.right) {
      return 0;
    } else if (this.left < that.right) {
      return -1;
    } else {
      return 1;
    }
  }
}