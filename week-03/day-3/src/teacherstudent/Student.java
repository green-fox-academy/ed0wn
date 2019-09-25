package teacherstudent;

public class Student {

  public Student(){
  }

  public static void learn(){
    System.out.println("The student is learning something new");
  }
  public void question(){
    Teacher.answer();
  }
}
