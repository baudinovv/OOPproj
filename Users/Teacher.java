package Users ;

import java.util.*;
import EnumsAndComparators.*;
import UsersCapabilities.CanborrowBook;
import UsersCapabilities.Manageable;
import Education.Course;

public class Teacher extends Employee implements Manageable, CanborrowBook
{
	
	private TeacherType teacherType;
	
	private Set<Course> course;

	public Teacher(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber){
		super(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);
	}
	public Teacher(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber, TeacherType teacherType, Set<Course> course){
		super(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);
    this.teacherType = teacherType;
    this.course = course;
	}
	
  public void setTeacherType(TeacherType teacherType){
    this.teacherType = teacherType;
  }

  public void setCourse(Set<Course> course){
    this.course = course;
  }

	public void getCourses() {
		// TODO implement me	
	}
	
	public void borrowBook() {
		// TODO implement me	
	}
	
	public void showMenu() {
		// TODO implement me	
	}
	
	public void returnBook() {
		// TODO implement me	
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
	
	public void journalMark() {
		// TODO implement me	
	}
}
