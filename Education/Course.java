package Education;

import Users.*;
import java.util.*;

public class Course {

  private String courseId;

  private String name;

  private int credits;

  private String type;

  private Teacher teachers;

  private ArrayList<Student> students;

  private ArrayList<Lesson> lessons;

  public Course(String courseId, String name, int credits, String type, Teacher teachers, ArrayList<Lesson> lessons) {
    this.courseId = courseId;
    this.name = name;
    this.credits = credits;
    this.type = type;
    this.teachers = teachers;
    this.lessons = lessons;
  }

  public Course(String courseId, String name, int credits, String type, Teacher teachers, ArrayList<Lesson> lessons, ArrayList<Student> students) {
    this.courseId = courseId;
    this.name = name;
    this.credits = credits;
    this.type = type;
    this.teachers = teachers;
    this.lessons = lessons;
    this.students = students;
  }

  public void addStudent(Student student) {
    if (student != null) {
      students.add(student);
    }
  }

  public void setStudents(ArrayList<Student> students){
    this.students = students;
  }

  public void removeStudent(Student student) {
    if (student != null) {
      students.remove(student);
    }
  }

  public String getCourseName() {
    return name;
  }

  public ArrayList<Lesson> getLesson() {
    return this.lessons;
  }

  public void addLesson(Lesson e){
    this.lessons.add(e);
  }

  public ArrayList<Student> getStudents(){
    return this.students;
  }

  public int getCredits() {
    return credits;
  }

  public String toString() {
    return "Course{" +
        "courseId='" + courseId + '\'' +
        ", name='" + name + '\'' +
        ", credits=" + credits +
        ", type='" + type + '\'' +
        ", teacher=" + teachers.getFirstName() + " " + teachers.getLastName() +
        ", students=[" + (students.isEmpty() ? "No students enrolled" : students.toString()) + "]" +
        ", lessons=" + lessons +
        '}';

  }

}
