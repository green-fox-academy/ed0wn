package main.java.music;

public class BassGuitar extends StringedInstrument {
  @Override
  public void sound() {
    System.out.println("Duum-duum-duum");
  }

  BassGuitar(){
    numberOfStrings=4;
    name ="Bass Guitar";
  }
  BassGuitar(int numberOfStrings){
    this.numberOfStrings=numberOfStrings;
    name = "Bass Guitar";
  }
}
