package Users;

import java.util.*;
import java.util.Map.Entry;

import EnumsAndComparators.*;
import UsersCapabilities.*;
import Education.*;

class AttendanceRecord {
    private Student student;
    private Course course;
    private Date date;
    private boolean present;

    public AttendanceRecord(Student student, Course course, Date date, boolean present) {
        this.student = student;
        this.course = course;
        this.date = date;
        this.present = present;
    }

    public Date getDate() {
        return date;
    }

    public boolean isPresent() {
        return present;
    }
}


public class Student extends User implements Educationable, CanborrowBook {

  private double gpa;

  private int studyYear;

  private Faculty faculty;

  private int availableECTS;

  private int retakeNumber;

  private Specialty specialty;

  private HashMap<Course, Mark> marks = new HashMap<>();

  private ArrayList<Book> books;

  private ArrayList<ScheduleEntry> examsSchedule = new ArrayList<>();
  private ArrayList<ScheduleEntry> lessonSchedule = new ArrayList<>();

private HashMap<Course, Mark> attendance;
private List<Course> courses;

  public Student(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber,Gender gender, String email, int passportNumber, double gpa, int studyYear, Faculty faculty, int availableECTS,int retakeNumber, Specialty specialty, HashMap<Course, Mark> marks,List<Course> courses) {
    super(firstName, lastName, id, username, registrationDate, phoneNumber, gender, email, passportNumber);
    this.gpa = gpa;
    this.studyYear = studyYear;
    this.faculty = faculty;
    this.availableECTS = availableECTS;
    this.specialty = specialty;
    this.marks = marks;
    this.courses = new ArrayList<>();
  }

  public Student(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber,
    Gender gender, String email, int passportNumber) {
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

  public double getGpa() {
    return gpa;
  }

  public int getStudyYear() {
    return studyYear;
  }

  public Faculty getFaculty() {
    return faculty;
  }

  public int getAvailableECTS() {
    return availableECTS;
  }

  public Specialty getSpecialty() {
    return specialty;
  }

  public boolean CanborrowBook() {
    if (this.books.size() > 10) {
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

  public void addCourse(Course course) {
	    if (this.courses == null) {
	        this.courses = new ArrayList<>();
	    }
	    this.courses.add(course);
	}
  public List<Course> getCourses() {
	    return courses;
	}
  public Mark getMark(Course key) {
    return this.marks.get(key);
  }

  public HashMap<Course, Mark> getMarks() {
    return this.marks;
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
      double totalGPA = 0;
      int totalCredits = 0;
      
      System.out.println("=== TRANSCRIPT ===");
      System.out.println("Student: " + getFirstName() + " " + getLastName());
      System.out.println("ID: " + getUserId());
      System.out.println("Faculty: " + faculty);
      System.out.println("Specialty: " + specialty);
      System.out.println("\nCourses:");
      
      for (Entry<Course, Mark> entry : marks.entrySet()) {
          Course lesson = entry.getKey();
          Mark mark = entry.getValue();
          double finalGrade = mark.calculateFinalGrade(totalCredits);
          String letterGrade = mark.convertToLetterGrade(finalGrade);
          double courseGPA = mark.calculateGpa();
          
          System.out.printf("%s (Credits: %d)\n", lesson.getCourseName(), lesson.getCredits());
          System.out.printf("Final Grade: %.2f | Letter Grade: %s | GPA: %.2f\n\n",
                  finalGrade, letterGrade, courseGPA);
          
          totalGPA += courseGPA * lesson.getCredits();
          totalCredits += lesson.getCredits();
      }
      
      if (totalCredits > 0) {
          System.out.printf("Cumulative GPA: %.2f\n", totalGPA / totalCredits);
      }
      System.out.println("Total Credits Completed: " + totalCredits);
      System.out.println("Available ECTS: " + availableECTS);
  }

 
  // public String toString() {
  // return "Student{username: " + this.getUsername() + ", gpa: " + this.gpa + ",
  // firstName: " + this.getFirstName() + ", lastName: " + this.getLastName() + ",
  // studyYear: " + studyYear + ", specialty: " + specialty + ", marks: " + marks
  // + ", books: " + books + ", retakeNumber: " + retakeNumber + "}";
  // }

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
  public void viewSchedule() {
	    System.out.println("\n=== Student Schedule ===");
	    if (courses == null || courses.isEmpty()) {
	        System.out.println("No courses scheduled.");
	        return;
	    }
	    
	    for (Course course : courses) {
	        for (Lesson lesson : course.getLesson()) {
	            System.out.println("Course: " + course.getCourseName());
	            System.out.println("Teacher: " + lesson.getTeacher().getFirstName() + " " + lesson.getTeacher().getLastName());
	            System.out.println("Time: " + lesson.LessonTime());
	            System.out.println("Room: " + lesson.getRoom());
	            System.out.println("------------------------");
	        }
	    }
	}

	public void viewAttendanceMark() {
	    System.out.println("\n=== Attendance Record ===");
	    if (courses == null || courses.isEmpty()) {
	        System.out.println("No courses to show attendance for.");
	        return;
	    }
	    
	    for (Course course : courses) {
	        System.out.println("\nCourse: " + course.getCourseName());
	        Map<String, Boolean> attendance = getAttendanceForCourse(course);
	        if (attendance.isEmpty()) {
	            System.out.println("No attendance records available.");
	        } else {
	            for (Map.Entry<String, Boolean> entry : attendance.entrySet()) {
	                System.out.println("Date: " + entry.getKey() + " - " + (entry.getValue() ? "Present" : "Absent"));
	            }
	        }
	    }
	}

  public Map<String, Boolean> getAttendanceForCourse(Course course) {
	  return null;
	}

@Override
  public void viewJournal() {
    //
  }

  public Organizations createOrganisation(String organizationName, List<Student> members, Student head,String organizationInfo) {
    return new Organizations(organizationName, members, this, organizationInfo);
  }
}
