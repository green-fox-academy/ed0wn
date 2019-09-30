package greenfoxinheritance;


public class Mentor extends Person {
  private String level;

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " " + level + " mentor.");
  }

  Mentor(String name, int age, String gender, String level) {
    setName(name);
    setAge(age);
    setGender(gender);
    this.level = level;
  }

  Mentor() {
    super();
    level = "intermediate";
  }
}
