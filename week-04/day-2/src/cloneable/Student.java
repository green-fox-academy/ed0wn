package cloneable;

public class Student extends Person {
  private String previousOrganization;
  private int skippedDays;

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from " + this.previousOrganization + " who skipped " + this.skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

  Student(String name, int age, String gender, String previousOrganization) {
    setAge(age);
    setName(name);
    setGender(gender);
    skippedDays = 0;
    this.previousOrganization= previousOrganization;
  }

  Student() {
    super();
    previousOrganization = "The School of Life";
    skippedDays = 0;

  }
  protected Student clone(){
    return this;
  }
}