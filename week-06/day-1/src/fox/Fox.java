package fox;

public class Fox {
  private String name;
  private String color;
  private int age;

  @Override
  public String toString() {
    return this.name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Fox(String name, String color, int age) {
    this.name = name;
    this.color = color;
    this.age = age;
  }
}
