package Education;

import Users.*;
import EnumsAndComparators.*;

import java.sql.Time;
import java.util.*;

public class Lesson {

  private String lessonName;

  private Teacher teacher;

  private Course course;

  private ScheduleEntry lessonInfo;

  private Language Language;

  private List<Student> enrolledStudents;

  private Map<Student, List<Mark>> studentGrades;

  private Time lessonTime;

  private WeekDay lessonDay;

  private String room;

  public Lesson(String lessonName, Teacher teacher, Course course, ScheduleEntry lessonInfo, Language language) {
    this.lessonName = lessonName;
    this.teacher = teacher;
    this.course = course;
    this.lessonInfo = lessonInfo;
    this.Language = language;
    this.enrolledStudents = new ArrayList<>();
    this.studentGrades = new HashMap<>();
  }

  public void viewMarks() {
    if (studentGrades.isEmpty()) {
      throw new IllegalStateException("No grades available");
    }
    studentGrades.forEach((student, grades) -> {
      System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
      System.out.println("Grades: " + grades);
    });
  }

  public List<Mark> getMarks(Student student) {
    if (!enrolledStudents.contains(student)) {
      throw new IllegalArgumentException("Student not enrolled in this lesson");
    }
    return studentGrades.getOrDefault(student, new ArrayList<>());
  }

  public void registerStudent(Student student) {
    if (enrolledStudents.contains(student)) {
      throw new IllegalStateException("Student already registered");
    }
    enrolledStudents.add(student);
    studentGrades.put(student, new ArrayList<>());
    System.out.println("Student " + student.getFirstName() + " registered for " + this.lessonName);
  }

  public void scheduleLesson(Time time, WeekDay day, String room) {
    this.lessonTime = time;
    this.lessonDay = day;
    this.room = room;
    System.out.println("Lesson scheduled for " + day + " at " + time + " in room " + room);
  }

public User getTeacher() {
	return teacher;
}

public String getRoom() {
	return room;
}
public Time LessonTime() {
	return lessonTime;
}

public String getLessonName() {
	return lessonName;
}
}
