package cloneable;

public class Person implements Cloneable {
  private String name;
  private int age;
  private String gender;

  public void introduce(){
    System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender);
  }
  public void getGoal(){
    System.out.println("My goal is: Live for the moment!");
  }
  Person(String name, int age, String gender){
    this.name= name;
    this.age= age;
    this.gender= gender;
  }
  Person(){
    name= "Jane Doe";
    age = 30;
    gender = "female";
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
