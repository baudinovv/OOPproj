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
	
	private HashMap<Lesson, Mark> marks;

  private ArrayList<Books> books;

  private ArrayList<ScheduleEntry> examsSchedule;
  private ArrayList<ScheduleEntry> lessonSchedule;
	
	public Student(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber, double gpa, int studyYear, Faculty faculty, int availableECTS, int retakeNumber, Specialty specialty, HashMap<Lesson, Mark> marks){
		super(firstName, lastName, id, username, registrationDate, phoneNumber, gender, email, passportNumber);
    this.gpa = gpa;
    this.studyYear = studyYear;
    this.faculty = faculty;
    this.availableECTS = availableECTS;
    this.specialty = specialty;
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
  public void borrowBook(Books book) {
    this.books.add(book);
  }

  @Override
	public void returnBook(Books book) {
		this.books.remove(book);
	}
	
	public void retakeCourse(Course course) {
		this.retakeNumber++;
	}
	
	
	public void addCourse(Course parameter) {
    // TODO implement me	
	}
	
	public void viewAttendanceMark() {
    // TODO implement me	
	}
	
	public ArrayList<ScheduleEntry> viewSchedule() {
    return this.lessonSchedule;	
	}
	
	public void viewAttestation() {
        if (marks.isEmpty()) {
            throw new IllegalStateException("No attestation marks available");
        }
        marks.forEach((lesson, mark) -> {
            double firstAtt = mark.calculateFirstHalf();
            double secondAtt = mark.calculateSecondHalf();
            System.out.println(lesson.getCourseName() + ":");
            System.out.println("First Attestation: " + firstAtt + "/30");
            System.out.println("Second Attestation: " + secondAtt + "/30");
            System.out.println("Current Total: " + (firstAtt + secondAtt) + "/60");
        });
    }
	
	public void viewTranscript() {
    // TODO implement me	
	}
	
	public String toString() {
    return "Student{username: " + this.getUsername() + ", gpa: " + this.gpa + ", firstName: " + this.getFirstName() + ", lastName: " + this.getLastName() + ", studyYear: " + studyYear + ", specialty: " + specialty + ", marks: " + marks + ", books: " + books + ", retakeNumber: " + retakeNumber + "}";	
	}
	
	public void showMyPapers() {
    // TODO implement me	
	}
	
  public void addResearchPaper() {
    // TODO implement me	
  }

  @Override
	public ArrayList<ScheduleEntry> viewExamsSchedule() {
    return this.examsSchedule;
	}
	
  @Override
  public void viewCourseSchedule() {
			
	}
	
  @Override
  public void viewJournal() {
		// TODO implement me	
	}

	public void createOrganisation() {
		// TODO implement me	
	}
}
