package thegardenapplication;

public class Main {
  public static void main(String[] args) {
    Flower flower1 = new Flower("yellow");
    Flower flower2 = new Flower("blue");
    Tree tree1 = new Tree("purple");
    Tree tree2 = new Tree("orange");
    Garden garden = new Garden();
    garden.addFlower(flower1, "yellow");
    garden.addFlower(flower2, "blue");
    garden.addTree(tree1,"purple");
    garden.addTree(tree2, "orange");
    garden.statusCheck();
    garden.watering(40);
    garden.statusCheck();
    garden.watering(70);
    garden.statusCheck();
  }
}
