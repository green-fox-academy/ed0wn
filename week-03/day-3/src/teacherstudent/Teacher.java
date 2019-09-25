package teacherstudent;

public class Teacher {

  public Teacher(){
  }
  public void teach(){
    Student.learn();
  }
  public static void answer(){
    System.out.println("The teacher is answering a question");
  }

}
