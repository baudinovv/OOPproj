package Controllers;
import java.util.ArrayList;
import java.util.Scanner;

import Education.Course;
import Education.Lesson;
import Users.Admin;
import Users.Student;
import Users.Teacher;

public class UserController {

  private final String version;

  public UserController(){
    version = "v1.0";
  }

  private void handleStudentOperations(String username) {
    Scanner scanner = new Scanner(System.in);
    Admin admin = new Admin("Alisher", "Baudinov", 1, null, null, null, null, null, 0);
    Student student = (Student) admin.Factory("Student", "Birzhan","Artykbay", 0, null, null, null, null, null, 0);
    
    System.out.println("\n=== Student Operations ===");
    System.out.println("Success login.");
    System.out.println("");
    System.out.println("1. View Schedule");
    System.out.println("2. View Transcript");
    System.out.println("3. View Attestation");
    System.out.println("4. View Attendance");
    System.out.print("Choose an option: ");
    
    int choice = scanner.nextInt();
    
    switch (choice) {
      case 1:
      student.viewSchedule();
      break;
      case 2:
      student.viewTranscript();
      break;
      case 3:
      student.viewAttestation();
      break;
      case 4:
    	
      student.viewAttendanceMark();
      break;
      default:
      System.out.println("Invalid option.");
    }
  }
  
  private void handleTeacherOperations(String username) {
    Scanner scanner = new Scanner(System.in);
    
    Admin admin = new Admin("Alisher", "Baudinov", 1, null, null, null, null, null, 0);
    Student student = (Student) admin.Factory("student", "Sonya", "Marmaladova", 0, null, null, null, null, null, 0);
    Student student2 = (Student) admin.Factory("student", "Sonya2", "Marmaladova", 0, null, null, null, null, null, 0);
    Student student3 = (Student) admin.Factory("student", "Sonya3", "Marmaladova", 0, null, null, null, null, null, 0);
    Student student4 = (Student) admin.Factory("student", "Sonya4", "Marmaladova", 0, null, null, null, null, null, 0);
    Student student5 = (Student) admin.Factory("student", "Sonya5", "Marmaladova", 0, null, null, null, null, null, 0);
    Student student6 = (Student) admin.Factory("student", "Sonya6", "Marmaladova", 0, null, null, null, null, null, 0);
    Student student7 = (Student) admin.Factory("student", "Sonya7", "Marmaladova", 0, null, null, null, null, null, 0);

    Teacher teacher = (Teacher) admin.Factory("teacher", "Assylzhan", "Isbassar", 0, null, null, null, null, null, 0);

    ArrayList<Student> group = new ArrayList<>();
    group.add(student);
    group.add(student2);
    group.add(student3);
    group.add(student4);
    group.add(student5);
    group.add(student6);
    group.add(student7);
    Course course = new Course("1", "OOP", 5, "Minor", teacher, new ArrayList<>(), group);
    
    Lesson lesson = new Lesson("OOP", teacher, course, null, null);
    course.addLesson(lesson);

    student.addCourse(course);
    student2.addCourse(course);
    student3.addCourse(course);
    student4.addCourse(course);
    student5.addCourse(course);
    student6.addCourse(course);
    student7.addCourse(course);
    teacher.addCourse(course);


    System.out.println("\n=== Teacher Operations ===");
    System.out.println("1. Put marks");
    System.out.println("2. Record Attendance");
    System.out.println("3. view Student Info");
    System.out.print("Choose an option: ");

    int choice = scanner.nextInt();

    switch (choice) {
      case 1:
        System.out.println("1. Put marks");
        System.out.println("2. Press Escape to back main menu");
        teacher.journalMark();
        break;
      case 2:
        teacher.recordAttendance(course, group);
        student.getAttendanceForCourse(course);
        System.out.println("Attendance recording functionality");
        break;
      case 3:
        teacher.viewStudentInfo();
        System.out.println("View student information");
        break;
      default:
        System.out.println("Invalid option.");
    }
  }
}