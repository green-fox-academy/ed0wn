package Zoo;

import flyable.Flyable;

public class Bird extends Animal implements Flyable {
  @Override
  public String breed() {
    return "laying eggs.";
  }
  Bird(String name){
    setName(name);
  }

  @Override
  public void land() {

  }

  @Override
  public void fly() {

  }

  @Override
  public void takeOff() {

  }
}

