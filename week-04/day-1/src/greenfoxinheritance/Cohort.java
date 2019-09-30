package greenfoxinheritance;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
  private String name;
  private List<Student> students = new ArrayList<>();
  private List<Mentor> mentors = new ArrayList<>();

  public void addStudent(Student student){
    student= new Student();
    students.add(student);
  }
  public void addMentor(Mentor mentor){
    mentor = new Mentor();
    mentors.add(mentor);
  }
  public void info(){
    System.out.println("The " + name + " cohort has "  + students.size() + " students " + mentors.size() + " mentors.");
  }
  Cohort (String name){
    this.name=name;
  }
}
