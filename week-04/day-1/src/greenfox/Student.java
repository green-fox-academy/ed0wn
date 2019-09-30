package greenfox;

public class Student {
  String name;
  int age;
  String gender;
  String previousOrganization;
  int skippedDays;

  public void getGoal(){
    System.out.println("Be a junior software developer.");
  }
  public void introduce(){
    System.out.println("Hi, I'm " +name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }
  public void skipDays(int numberOfDays){
    skippedDays+=numberOfDays;
  }
  Student(String name, int age, String gender, String previousOrganization){
    skippedDays=0;
    this.name= name;
    this.age= age;
    this.gender= gender;
    this.previousOrganization= previousOrganization;
  }
  Student(){
    name = "Jane Doe";
    age = 30;
    gender = "female";
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

}
