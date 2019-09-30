package greenfox;

public class Mentor {
  String name;
  int age;
  String gender;
  String level;

  public void getGoal(){
    System.out.println("Educate brilliant junior software developers.");
  }
  public void introduce(){
    System.out.println("Hi, I'm " +name + ", a " + age + " year old " + gender + " "+ level + " mentor");
  }
  Mentor(String name, int age, String gender, String level){
    this.name= name;
    this.age= age;
    this.gender= gender;
    this.level=level;
  }
  Mentor(){
    name= "Jane Doe";
    age = 30;
    gender = "female";
    level = "intermediate";
  }
}
