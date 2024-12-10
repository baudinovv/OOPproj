package Users;


import java.util.*;

import EnumsAndComparators.*;
import UsersCapabilities.*;
import Education.*;


public class Student extends User implements Educationable, CanborrowBook
{
	
	private double gpa;
	
	private int studyYear;
	
	private Faculty faculty;
	
	private int availableECTS;
	
	private int retakeNumber;
	
	private Specialty specialty;
	
	private HashMap<Course, Mark> marks;

  private ArrayList<Book> books;

  private ArrayList<ScheduleEntry> examsSchedule;
  private ArrayList<ScheduleEntry> lessonSchedule;
	
	public Student(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber, double gpa, int studyYear, Faculty faculty, int availableECTS, int retakeNumber, Specialty specialty, HashMap<Course, Mark> marks){
		super(firstName, lastName, id, username, registrationDate, phoneNumber, gender, email, passportNumber);
    this.gpa = gpa;
    this.studyYear = studyYear;
    this.faculty = faculty;
    this.availableECTS = availableECTS;
    this.specialty = specialty;
    this.marks = marks;
  }
	public Student(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber){
		super(firstName, lastName, id, username, registrationDate, phoneNumber, gender, email, passportNumber);
  }

public void setGpa(double gpa) {
    this.gpa = gpa;
}

public void setStudyYear(int studyYear) {
    this.studyYear = studyYear;
}

public void setFaculty(Faculty faculty) {
    this.faculty = faculty;
}

public void setAvailableECTS(int availableECTS) {
    this.availableECTS = availableECTS;
}

public void setSpecialty(Specialty specialty) {
    this.specialty = specialty;
}

public void setMarks(HashMap<Course, Mark> marks) {
    this.marks = marks;
}

	public boolean CanborrowBook(){
    if(this.books.size() > 10){
      return false;
    } else {
      return true;
    }
  }

  @Override
  public void borrowBook(Book book) {
    this.books.add(book);
  }

  @Override
	public void returnBook(Book book) {
		this.books.remove(book);
	}
	
	public void retakeCourse(Course course) {
		this.retakeNumber++;
	}
	
	
	public void addCourse(Course parameter) {
    //
	}
	
	public ArrayList<ScheduleEntry> viewSchedule() {
    return this.lessonSchedule;	
	}
	
	public void viewAttestation() {
    // TODO implement me	
	}
	
	public void viewTranscript() {
    // TODO implement me	
	}
	
	public String toString() {
    return "Student{username: " + this.getUsername() + ", gpa: " + this.gpa + ", firstName: " + this.getFirstName() + ", lastName: " + this.getLastName() + ", studyYear: " + studyYear + ", specialty: " + specialty + ", marks: " + marks + ", books: " + books + ", retakeNumber: " + retakeNumber + "}";	
	}
	
	public void showMyPapers() {
    // 	
	}
	
  public void addResearchPaper() {
    // TODO implement me	
  }

  @Override
	public ArrayList<ScheduleEntry> viewExamsSchedule() {
    return this.examsSchedule;
	}
	
  @Override
  public ArrayList<ScheduleEntry> viewLessonSchedule() {
    return this.lessonSchedule;
	}
	
  @Override
  public void viewJournal() {
		//
	}

	public Organizations createOrganisation(String organizationName, List<Student> members, Student head, String organizationInfo) {
    return new Organizations(organizationName, members, this, organizationInfo);
	}
}
