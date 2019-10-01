package comparable;

public class Thing implements Comparable<Thing>{
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }


//  @Override
//  public int compareTo(Thing that) {
//    if (this.completed == that.completed){
//      return 0;
//    } else {
//      return -1;
//    }
//  }
  public int compareTo(Thing that) {
    return this.name.compareTo(that.name);
  }

}