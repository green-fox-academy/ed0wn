package Zoo;

public class Reptile extends Animal {

  @Override
  public String breed() {
    return "laying eggs.";
  }

  Reptile(String name){
    setName(name);
  }
}
