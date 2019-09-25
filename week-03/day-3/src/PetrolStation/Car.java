package PetrolStation;

public class Car {
  int gasAmount;
  int capacity;
  public Car() {
    gasAmount=0;
    capacity=100;
  }
  public void refill(Station station){
    Station.gasAmount-=capacity;
    gasAmount=capacity;
  }
}
