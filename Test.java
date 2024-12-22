import Users.*;
import UsersCapabilities.*;
import EnumsAndComparators.*;
import Education.*;
import Communications.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.sql.Array;

import javax.sql.DataSource;

import org.postgresql.ds.PGSimpleDataSource;

import Data.*;
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

  private static DataSource createDataSource(){
    final String url =
     "jdbc:postgresql://localhost:5432/wsp?user=postgres&password=postgres";
    final PGSimpleDataSource dataSource = new PGSimpleDataSource();
    dataSource.setURL(url);
    return dataSource;
  }

  public static void getUsers(Connection conn ) throws SQLException {
    PreparedStatement stat = conn.prepareStatement("select * from users");
    ResultSet rs = stat.executeQuery();
    
    while (rs.next()) {
      System.out.println(rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
    }
    
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        
    System.out.println("\n=== University Management System ===");
    System.out.println("1. Please log in");
    System.out.println("2. Exit");
    
    DataSource dataSource = createDataSource();
    try {
      Connection conn = dataSource.getConnection(); 
      Data data = new Data();
      // System.out.println(data.hashPassword("alisher"));
      // System.out.println(data.hashPassword("password"));
      System.out.print("Enter username: ");
      String userInput = scanner.nextLine();
      
      System.out.print("Enter password: ");
      String passwordInput = scanner.nextLine();
      

      while (true) {
        if(data.checkPassword(conn, userInput, passwordInput)) {
        // if(true) {
            switch (Data.checkRole(conn , userInput)) {
              case "teacher":
                handleTeacherOperations(userInput, conn);
                break;
              case "student":
                handleStudentOperations(userInput, conn);
              default:
                break;
            }
          } else {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Wrong password, please try again");
            System.out.println("\n=== University Management System ===");
            System.out.println("1. Please log in");
            System.out.println("2. Exit");
            System.out.print("Enter username: ");
            userInput = scanner.nextLine();

            System.out.print("Enter password: ");
            passwordInput = scanner.nextLine();
          }
        }

      // int choice = scanner.nextInt();

      // switch (choice) {
      //   case 1:
      //     handleStudentOperations(admin);
      //     break;

      //   case 2:
      //     handleTeacherOperations(admin);
      //     break;

      //   case 3:
      //     System.out.println("Exiting system...");
      //     return;
      //   case 4:
          


      //     return;

      //   default:
      //     System.out.println("Invalid option. Please try again.");
      // }
      // scanner.close();
    } catch (Exception e) {
      System.out.println("Connection to database failed: " + e);
      e.printStackTrace();
    }
  }

  private static void handleStudentOperations(String username, Connection conn) {
    Scanner scanner = new Scanner(System.in);
    Admin admin = new Admin("Alisher", "Baudinov", 1, null, null, null, null, null, 0);
    Student student = (Student) admin.Factory("Student", "Birzhan","Artykbay", 0, null, null, null, null, null, 0);
    
    System.out.println("\n=== Student Operations ===");
    System.out.println("Success login.");
    System.out.println("");
    System.out.println("1. View Journal");
    System.out.println("2. View Transcript");
    System.out.println("3. View Attestation");
    System.out.println("4. View Attendance");
    System.out.print("Choose an option: ");

    int choice = scanner.nextInt();
    try {
      
      switch (choice) {
        case 1:
          System.out.println("");
          System.out.println("");
          System.out.println("");
          System.out.println("");
          System.out.println("");
          System.out.println("");
          System.out.println("");
          PreparedStatement stat = conn.prepareStatement("select id from users where username=?");
          stat.setString(1, username);
          ResultSet rs = stat.executeQuery();
          if(rs.next()){
            int studentId = rs.getInt(1);
            stat = conn.prepareStatement("select id from students where user_id=?");
            stat.setInt(1, studentId);
            ResultSet res = stat.executeQuery();
            if(res.next()){
              int markId = res.getInt(1);
              stat = conn.prepareStatement("select * from marks where student_id=?");
              stat.setInt(1, markId);
              ResultSet markRes = stat.executeQuery();
              
              System.out.println("course_id   time              date                 mark student_id");
              while(markRes.next()){
                System.out.println(markRes.getString(2) + "           "
                 + markRes.getString(3) +"          "
                 + markRes.getString(4) +"            "
                 + markRes.getString(5)+"    "+ markRes.getString(6));
              }
            }
          }
          System.out.println("");
          System.out.println("");
          System.out.println("");
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
      
    } catch (Exception e) {
      // TODO: handle exception
    }
    
  }
  
  private static void handleTeacherOperations(String username, Connection conn) {
    Scanner scanner = new Scanner(System.in);
    Admin admin = new Admin("Alisher", "Baudinov", 1, null, null, null, null, null, 0);

    System.out.println("\n=== Teacher Operations ===");
    System.out.println("1. Put marks");
    System.out.println("2. Record Attendance");
    System.out.println("3. view Student Info");
    System.out.print("Choose an option: ");

    // teacher.journalMark(conn);
    int choice = scanner.nextInt();
    
    try {
    switch (choice) {
      case 1:
        System.out.println("1. Put marks");
        System.out.println("2. Press Escape to back main menu");
        // teacher.journalMark(conn);
          PreparedStatement stat = conn.prepareStatement("select id from users where username=?");
          stat.setString(1, username);
          ResultSet rs = stat.executeQuery();

          int teacherId = 0;
          while(rs.next()){
            teacherId = rs.getInt(1);
          }

          stat = conn.prepareStatement("select * from teachers, users where teacher_id=id AND id=?");
          stat.setInt(1, teacherId);
          rs = stat.executeQuery();

          while(rs.next()){
            // System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7));
            Teacher teacherTest = (Teacher) admin.Factory(Data.checkRole(conn, username), rs.getString(3).split(" ")[1], rs.getString(3).split(" ")[0], rs.getInt(1), username, new java.util.Date(), "88005553535", Gender.Male, "a_izbassar@kbtu.kz", 2131546123);
            teacherTest.setTeacherType(TeacherType.valueOf(rs.getString(2)));
            // System.out.println(teacherTest.toString()); 
            
            Array courseArr = rs.getArray(4);

            if(courseArr != null){
              Integer[] courseArray = (Integer[]) courseArr.getArray();
              for(int i = 1; i <= courseArray.length ; i++){
                stat = conn.prepareStatement("select * from courses where course_id=?");
                stat.setInt(1, i);
                rs = stat.executeQuery();
                while(rs.next()){
                  Array studentsArr = rs.getArray(5);
                  Integer[] studentsArray = (Integer[]) studentsArr.getArray();

                  ArrayList<Student> studentsTestList = new ArrayList<>(); 

                  Course courseTest = new Course(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), teacherTest, new ArrayList<Lesson>());
                  for(int j = 1; j <= studentsArray.length; j++){
                    stat = conn.prepareStatement("select * from students where id=?");
                    stat.setInt(1, j);
                    ResultSet res = stat.executeQuery();
                    
                    while(res.next()){
                      Student studentTest = new Student(res.getString(8).split(" ")[1], res.getString(8).split(" ")[0], res.getInt(1),res.getString(9), new Date(), "88005553535", Gender.Male, "asd", 1231 );
                      studentTest.addCourse(courseTest);
                      studentsTestList.add(studentTest); 
                    }
                  }
                  courseTest.setStudents(studentsTestList);
                  teacherTest.addCourse(courseTest);
                }
              }
            }
            System.out.println(teacherTest.journalMark(conn) + " its mark!");
          }
          break;
          case 2:
          // teacher.recordAttendance(course, group);
          // student.getAttendanceForCourse(course);
          System.out.println("Attendance recording functionality");
          break;
          case 3:
          // teacher.viewStudentInfo();
          System.out.println("View student information");
          break;
          default:
          System.out.println("Invalid option.");
        }
      } catch (Exception e) {
        System.out.println("Error! : "  + e);
        e.printStackTrace();
      }
  }
}
