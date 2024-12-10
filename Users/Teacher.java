package Users ;

import java.util.*;
import EnumsAndComparators.*;
import UsersCapabilities.CanborrowBook;
import UsersCapabilities.Manageable;
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
		// TODO implement me	
	}
	
	public void attestationMark() {
		// TODO implement me	
	}
	
	public void attendanceJournal() {
		// TODO implement me	
	}
	
	public int journalMark() {
    
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
      
      journalMark();
      
    }

    input.close();

    return 1;

	}
}
