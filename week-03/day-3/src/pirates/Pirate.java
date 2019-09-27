package pirates;

public class Pirate {
  int levelOfAlcohol;
  boolean passedOut;
  boolean dead;
  public Pirate(){
    this.levelOfAlcohol=0;
    this.passedOut=false;
    this.dead=false;
  }
  public void drinkSomeRum(){
    if (passedOut==false && dead==false) {
      levelOfAlcohol++;
    }
  }
  public void howsItGoingMate(){
    if (levelOfAlcohol<=4){
      System.out.println("Pour me anudder!");
    }
    else{
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      levelOfAlcohol=0;
      passedOut=true;
    }
  }
  public boolean die(){
    System.out.println("he's dead");
    return true;
  }
  public void brawl(Pirate pirate1, Pirate pirate2){
    int max=3;
    int min=1;
    int range=max-min+1;
    int chance = (int) (Math.random()*range+min);
    if (passedOut==false && dead==false) {
      if (chance == 1) {
        pirate1.dead = true;
      } else if (chance == 2) {
        pirate2.dead = true;
      } else {
        pirate1.passedOut = true;
        pirate2.passedOut = true;
      }
    }
  }
}
