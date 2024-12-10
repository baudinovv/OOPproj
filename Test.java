import Users.*;
import UsersCapabilities.*;
import EnumsAndComparators.*;
import Education.*;
import Communications.*;
import java.util.*;

// public class Test {
//   public static void main(String[] args) {
//     Admin admin = new Admin("Alisher", "Baudinov", 1, null, null, null, null, null, 0);

//     Student student = (Student) admin.Factory("student", "Sonya", "Marmaladova", 0, null, null, null, null, null, 0);
//     Student student2 = (Student) admin.Factory("student", "Sonya", "Marmaladova", 0, null, null, null, null, null, 0);
//     Student student3 = (Student) admin.Factory("student", "Sonya", "Marmaladova", 0, null, null, null, null, null, 0);
//     Student student4 = (Student) admin.Factory("student", "Sonya", "Marmaladova", 0, null, null, null, null, null, 0);
//     Student student5 = (Student) admin.Factory("student", "Sonya", "Marmaladova", 0, null, null, null, null, null, 0);
//     Student student6 = (Student) admin.Factory("student", "Sonya", "Marmaladova", 0, null, null, null, null, null, 0);
//     Student student7 = (Student) admin.Factory("student", "Sonya", "Marmaladova", 0, null, null, null, null, null, 0);

//     Teacher teacher = (Teacher) admin.Factory("teacher", "Assylzhan", "Isbassar", 0, null, null, null, null, null, 0);

//     ArrayList<Student> group = new ArrayList<>();
//     group.add(student);
//     group.add(student2);
//     group.add(student3);
//     group.add(student4);
//     group.add(student5);
//     group.add(student6);
//     group.add(student7);
//     Course course = new Course("1", "Calculus 1", 5, "Minor", teacher, new ArrayList<>(), group);

//     Lesson lesson = new Lesson("Calculus 1", teacher, course, null, null);
//     course.addLesson(lesson);

//     student.addCourse(course);
//     student2.addCourse(course);
//     student3.addCourse(course);
//     student4.addCourse(course);
//     student5.addCourse(course);
//     student6.addCourse(course);
//     student7.addCourse(course);
//     teacher.addCourse(course);
//     teacher.journalMark();

//   }
// }

public class Test {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Admin admin = new Admin("Alisher", "Baudinov", 1, null, null, null, null, null, 0);

    while (true) {
      System.out.println("\n=== University Management System ===");
      System.out.println("1. Student Operations");
      System.out.println("2. Teacher Operations");
      System.out.println("3. Exit");
      System.out.print("Choose an option: ");

      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          handleStudentOperations(admin);
          break;

        case 2:
          handleTeacherOperations(admin);
          break;

        case 3:
          System.out.println("Exiting system...");
          return;

        default:
          System.out.println("Invalid option. Please try again.");
      }
    }
  }

  private static void handleStudentOperations(Admin admin) {
    Scanner scanner = new Scanner(System.in);
    Student student = (Student) admin.Factory("Student", "Birzhan", null, 0, null, null, null, null, null, 0);

    System.out.println("\n=== Student Operations ===");
    System.out.println("1. View Schedule");
    System.out.println("2. View Transcript");
    System.out.println("3. View Attestation");
    System.out.println("4. View Attendance");
    System.out.print("Choose an option: ");

    int choice = scanner.nextInt();

    switch (choice) {
      case 1:
        // student.viewSchedule();
        break;
      case 2:
        student.viewTranscript();
        break;
      case 3:
        student.viewAttestation();
        break;
      case 4:
        // student.viewAttendanceMark();
        break;
      default:
        System.out.println("Invalid option.");
    }
  }

  private static void handleTeacherOperations(Admin admin) {
    Scanner scanner = new Scanner(System.in);

    Student student = (Student) admin.Factory("student", "Sonya", "Marmaladova", 0, null, null, null, null, null, 0);
    Student student2 = (Student) admin.Factory("student", "Sonya", "Marmaladova", 0, null, null, null, null, null, 0);
    Student student3 = (Student) admin.Factory("student", "Sonya", "Marmaladova", 0, null, null, null, null, null, 0);
    Student student4 = (Student) admin.Factory("student", "Sonya", "Marmaladova", 0, null, null, null, null, null, 0);
    Student student5 = (Student) admin.Factory("student", "Sonya", "Marmaladova", 0, null, null, null, null, null, 0);
    Student student6 = (Student) admin.Factory("student", "Sonya", "Marmaladova", 0, null, null, null, null, null, 0);
    Student student7 = (Student) admin.Factory("student", "Sonya", "Marmaladova", 0, null, null, null, null, null, 0);

    Teacher teacher = (Teacher) admin.Factory("teacher", "Assylzhan", "Isbassar", 0, null, null, null, null, null, 0);

    ArrayList<Student> group = new ArrayList<>();
    group.add(student);
    group.add(student2);
    group.add(student3);
    group.add(student4);
    group.add(student5);
    group.add(student6);
    group.add(student7);
    Course course = new Course("1", "Calculus 1", 5, "Minor", teacher, new ArrayList<>(), group);

    Lesson lesson = new Lesson("Calculus 1", teacher, course, null, null);
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
    System.out.println("3. Add Attestation Mark");
    System.out.print("Choose an option: ");

    int choice = scanner.nextInt();

    switch (choice) {
      case 1:
        System.out.println("1. Put marks");
        System.out.println("2. Press Escape to back main menu");
        teacher.journalMark();
        break;
      case 2:
        // Implement attendance recording logic
        System.out.println("Attendance recording functionality");
        break;
      case 3:
        // Implement attestation mark logic
        System.out.println("Attestation mark functionality");
        break;
      default:
        System.out.println("Invalid option.");
    }
  }
}