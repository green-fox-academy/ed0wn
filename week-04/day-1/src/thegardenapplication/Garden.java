package thegardenapplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
 private List<Plants> garden = new ArrayList<>();

 Garden(){
 }

 public void watering(double water){
   System.out.println("Watering with "+ (int)water);
   int needsWater= garden.size();
   for (Plants plant :garden) {
     if (!plant.getNeedWater()){
       needsWater--;
     }
   }
   water= water/needsWater;
   for (int i=0;i < garden.size(); i++) {
    if (garden.get(i).getNeedWater()){
      double currentLevel=garden.get(i).getWaterLevel();
      garden.get(i).setWaterLevel(water*garden.get(i).getAbsorbPercentage()+currentLevel);
    }
   }
   for (int i = 0; i < garden.size(); i++) {
     if (garden.get(i).getName()=="Flower" && garden.get(i).getWaterLevel()>= garden.get(i).getNeededAmount()){
       garden.get(i).setNeedWater(false);
     } else if(garden.get(i).getName()=="Tree" && garden.get(i).getWaterLevel()>= garden.get(i).getNeededAmount()){
       garden.get(i).setNeedWater(false);
     }
   }
 }
 public void addFlower(Flower flower, String color){
   flower = new Flower(color);
   garden.add(flower);
 }
 public void addTree(Tree tree, String color){
   tree= new Tree(color);
   garden.add(tree);
 }
  public void statusCheck(){
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i).getNeedWater()){
        System.out.println("The " + garden.get(i).getColor() + " " + garden.get(i).getName() + " needs water");
      } else{
        System.out.println("The " + garden.get(i).getColor() + " " + garden.get(i).getName() + " doesnt need water");
      }
    }
    System.out.println();
  }
}
