package Zoo;

public class Bird extends Animal {
  @Override
  public String breed() {
    return "laying eggs.";
  }
  Bird(String name){
    setName(name);
  }
}

