package main.java.music;

public class Violin extends StringedInstrument {

  @Override
  public void sound() {
    System.out.println("Screech");
  }

  Violin(){
    numberOfStrings=4;
    name="Violin";
  }
}
