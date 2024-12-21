package Users ;

import java.util.*;
import EnumsAndComparators.*;
import UsersCapabilities.CanborrowBook;
import UsersCapabilities.Manageable;

import java.time.LocalDate;
import java.util.*;
import EnumsAndComparators.*;
import UsersCapabilities.CanborrowBook;
import UsersCapabilities.Manageable;
import Education.Course;
import Education.Mark;


import java.sql.Connection;

// public class Teacher extends Employee implements Manageable, CanborrowBook
// {
	
// 	private TeacherType teacherType;
	
// 	private ArrayList<Course> course = new ArrayList<>();

//   private ArrayList<Book> books = new ArrayList<>();

// 	public Teacher(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber){
// 		super(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);
// 	}
// 	public Teacher(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber, TeacherType teacherType, ArrayList<Course> course){
// 		super(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);
//     this.teacherType = teacherType;
//     this.course = course;
// 	}
	
//   public void setTeacherType(TeacherType teacherType){
//     this.teacherType = teacherType;
//   }

//   public void setCourse(ArrayList<Course> course){
//     this.course = course;
//   }

//   public void addCourse(Course course){
//     this.course.add(course);
//   }

// 	public void getCourses() {
// 		// TODO implement me	
// 	}
	
// 	public void borrowBook(Book book) {
// 		this.books.add(book);	
// 	}
	
// 	public void showMenu() {
// 		// TODO implement me	
// 	}
	
// 	public void returnBook(Book book) {
// 		this.books.remove(book);
// 	}
	
// 	public void viewDisciplineSchedule() {
// 		// TODO implement me	
// 	}
	
// 	public void viewAttestation() {
// 		// TODO implement me	
// 	}
	
// 	public void viewStudentInfo() {
// 	    Scanner input = new Scanner(System.in);
// 	    System.out.println("Select course to view students:");
	    
// 	    for (int i = 0; i < course.size(); i++) {
// 	        System.out.println((i + 1) + ". " + course.get(i));
// 	    }
	    
// 	    int courseChoice = input.nextInt();
// 	    if (courseChoice > 0 && courseChoice <= course.size()) {
// 	        Course selectedCourse = course.get(courseChoice - 1);
// 	        System.out.println("\nStudents enrolled in " + selectedCourse + ":");
	        
// 	        ArrayList<Student> students = selectedCourse.getStudents();
// 	        for (Student student : students) {
// 	            System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
// 	            System.out.println("ID: " + student.getUserId());
// 	            System.out.println("Email: " + student.getEmail());
// 	            System.out.println("Current Grade: " + student.getMark(selectedCourse).calculateGpa());
// 	            System.out.println("------------------------");
// 	        }
// 	    } else {
// 	        System.out.println("Invalid course selection");
// 	    }
// 	}
	
// 	public int journalMark() {
	    
// 	    Scanner input = new Scanner(System.in);

// 	    System.out.println("Select course: \n");
	  
// 	    for(int i = 1 ; i <= course.size() ; i++){
// 	      System.out.println(i + ". " + course.get(i - 1) + "\n");
// 	    }
	    
// 	    int inputUser = input.nextInt();
// 	    input.nextLine();
// 	    if(inputUser < 0 || inputUser > course.size()){
// 	      input.close();
// 	      throw new InputMismatchException();
// 	    } else if(inputUser == 0){
// 	      System.out.println("Exiting system...");
// 	      input.close();
// 	      return 0;
// 	    } else {
// 	      Course userCourse = course.get(inputUser - 1);
// 	      System.out.println("Select student: \n");

// 	      for(int i = 1 ; i <= userCourse.getStudents().size() ; i++){
// 	        System.out.println(i + ". " + userCourse.getStudents().get(i - 1) + "\n");
// 	      }
// 	      int inputUser2 = input.nextInt();
// 	      input.nextLine();

// 	      System.out.println("Put mark: \n");
	      
// 	      inputUser = input.nextInt();
// 	      input.nextLine();

// 	      userCourse.getStudents().get(inputUser2 - 1).getMark(userCourse).addLessonMark(inputUser);

// 	      System.out.println(userCourse.getStudents().get(inputUser2 - 1).getMark(userCourse).getJournal());
	      
// 	      System.out.println();
	      
// 	      journalMark();
	      
// 	    }

// 	    input.close();

// 	    return 1;

// 		}
	      
// 	      public void recordAttendance(Course course, List<Student> students) {
// 	    Scanner scanner = new Scanner(System.in);
// 	    System.out.println("\n=== Recording Attendance for " + course.getCourseName() + " ===");
// 	    String date = LocalDate.now().toString();
	    
// 	    for (Student student : students) {
// 	        System.out.print(student.getFirstName() + " " + student.getLastName() + " (Present? y/n): ");
// 	        String response = scanner.nextLine().trim().toLowerCase();
// 	        boolean isPresent = response.equals("y");
	        
// 	        // Store attendance in student's record
// 	        Map<String, Boolean> studentAttendance = student.getAttendanceForCourse(course);
// 	        if (studentAttendance == null) {
// 	            studentAttendance = new HashMap<>();
// 	        }
// 	        studentAttendance.put(date, isPresent);
// 	    }
// 	    System.out.println("Attendance recorded successfully!");
// 	}
// 	@Override
// 	public String showStatistics() {
// 		// TODO Auto-generated method stub
// 		return null;
// 	}
// }
import Education.Course;

public class Teacher extends Employee implements Manageable, CanborrowBook
{
	
	private TeacherType teacherType;
	
	private ArrayList<Course> course = new ArrayList<>();

  private ArrayList<Book> books = new ArrayList<>();

	public Teacher(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber){
		super(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);
	}
	public Teacher(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber, TeacherType teacherType, ArrayList<Course> course){
		super(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);
    this.teacherType = teacherType;
    this.course = course;
	}
	
  public String showStatistics(){
    return "";
  }

  public void setTeacherType(TeacherType teacherType){
    this.teacherType = teacherType;
  }

  public void setCourse(ArrayList<Course> course){
    this.course = course;
  }

  public void addCourse(Course course){
    this.course.add(course);
  }

	public void getCourses() {
		// TODO implement me	
	}
	
	public void borrowBook(Book book) {
		this.books.add(book);	
	}
	
	public void showMenu() {
		// TODO implement me	
	}
	
	public void returnBook(Book book) {
		this.books.remove(book);
	}
	
	public void viewDisciplineSchedule() {
		// TODO implement me	
	}
	
	public void viewAttestation() {
		// TODO implement me	
	}
	
	public void viewStudentInfo() {
    Scanner input = new Scanner(System.in);
    System.out.println("Select course to view students:");
    for (int i = 0; i < course.size(); i++) {
      System.out.println((i + 1) + ". " + course.get(i));
    }
    int courseChoice = input.nextInt();
    if (courseChoice > 0 && courseChoice <= course.size()) {
        Course selectedCourse = course.get(courseChoice - 1);
        System.out.println("\nStudents enrolled in " + selectedCourse + ":"); 
        ArrayList<Student> students = selectedCourse.getStudents();
        for (Student student : students) {
          System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
          System.out.println("ID: " + student.getUserId());
          System.out.println("Email: " + student.getEmail());
          System.out.println("Current Grade: " + student.getMark(selectedCourse).calculateGpa());
          System.out.println("------------------------");
        }
    } else {
        System.out.println("Invalid course selection");
    }
}

  public void recordAttendance(Course course, List<Student> students) {
 	  Scanner scanner = new Scanner(System.in);
 	  System.out.println("\n=== Recording Attendance for " + course.getCourseName() + " ===");
 	  String date = LocalDate.now().toString();    
 	  for (Student student : students) {
 	      System.out.print(student.getFirstName() + " " + student.getLastName() + " (Present? y/n): ");
 	      String response = scanner.nextLine().trim().toLowerCase();
 	      boolean isPresent = response.equals("y");        
 	      // Store attendance in student's record
 	      Map<String, Boolean> studentAttendance = student.getAttendanceForCourse(course);
 	      if (studentAttendance == null) {
 	        studentAttendance = new HashMap<>();
 	      }
 	      studentAttendance.put(date, isPresent);
 	  }
 	  System.out.println("Attendance recorded successfully!");
    scanner.close();
 	}
	
	public int journalMark(Connection conn) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Select course: \n");
  
    for(int i = 1 ; i <= course.size() ; i++){
      System.out.println(i + ". " + course.get(i - 1) + "\n");
    }
    
    int inputUser = input.nextInt();
    input.nextLine();
    if(inputUser < 0 || inputUser > course.size()){
      input.close();
      throw new InputMismatchException();
    } else if(inputUser == 0){
      System.out.println("Exiting system...");
      input.close();
      return 0;
    } else {
      Course userCourse = course.get(inputUser - 1);
      System.out.println("Select student: \n");

      for(int i = 1 ; i <= userCourse.getStudents().size() ; i++){
        System.out.println(i + ". " + userCourse.getStudents().get(i - 1) + "\n");
      }
      int inputUser2 = input.nextInt();
      input.nextLine();

      System.out.println("Put mark: \n");
      
      inputUser = input.nextInt();
      input.nextLine();

      userCourse.getStudents().get(inputUser2 - 1).getMark(userCourse).addLessonMark(inputUser);

      System.out.println(userCourse.getStudents().get(inputUser2 - 1).getMark(userCourse).getJournal());
      
      System.out.println();
      
      journalMark(conn);
      
    }

    input.close();

    return 1;

	}
}
