package greenfoxinheritance;

public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }
  public void hire(){
    hiredStudents++;
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
  Sponsor(String name, int age, String gender, String company){
    setAge(age);
    setGender(gender);
    setName(name);
    hiredStudents=0;
    this.company= company;
  }
  Sponsor(){
    super();
    company="google";
    hiredStudents=0;
  }

}
