package Zoo;

public class Mammal extends Animal {

  @Override
  public String breed() {
    return "pushing miniature versions out.";
  }

  Mammal(String name){
    setName(name);
  }
}
