package Education;

import java.util.*;
import Communications.*;

public class Mark {

  private int value;

  private HashSet<ScheduleEntry> lessonSchedule;

  private int attestationResult;

  private int percentageOfMark;

  private int finalGrade;

  private List<Integer> journal;

  public Mark() {
    this.lessonSchedule = new HashSet<>();
    this.journal = new ArrayList<>();
  }

  public void addLessonMark(int mark) {
    if (mark < 0 || mark > 100) {
      throw new IllegalArgumentException("Mark must be between 0 and 100");
    }
    journal.add(mark);
  }

  public int calculateFirstHalf() {
    if (journal.isEmpty()) {
      return 0;
    }

    int sum = 0;
    int count = 0;

    for (int i = 0; i < (journal.size() < 8 ? journal.size() : 8); i++) {
      sum += journal.get(i);
      count++;
    }

    return count > 0 ? sum / count : 0;
  }

  public int calculateSecondHalf() {
    if (journal.isEmpty()) {
      return 0;
    }

    int sum = 0;
    int count = 0;

    for (int i = 8; i < (journal.size() < 15 ? journal.size() : 15); i++) {
      sum += journal.get(i);
      count++;
    }

    return count > 0 ? sum / count : 0;
  }

  public int calculateFinalGrade(int finalGrade) {
    int firstHalf = calculateFirstHalf();
    int secondHalf = calculateSecondHalf();
    this.finalGrade = firstHalf + secondHalf + finalGrade;
    return this.finalGrade;
}

  public String convertToLetterGrade(int value) {
    if (value >= 95)
      return "A";
    if (value >= 90)
      return "A-";
    if (value >= 85)
      return "B+";
    if (value >= 80)
      return "B";
    if (value >= 75)
      return "B-";
    if (value >= 70)
      return "C+";
    if (value >= 65)
      return "C";
    if (value >= 60)
      return "C-";
    if (value >= 55)
      return "D+";
    if (value >= 50)
      return "D";
    return "F";
  }

  public double calculateGpa() {
    String letterGrade = convertToLetterGrade(this.finalGrade);
    switch (letterGrade) {
      case "A":
        return 4.0;
      case "A-":
        return 3.67;
      case "B+":
        return 3.33;
      case "B":
        return 3.0;
      case "B-":
        return 2.67;
      case "C+":
        return 2.33;
      case "C":
        return 2.0;
      case "C-":
        return 1.67;
      case "D+":
        return 1.33;
      case "D":
        return 1.0;
      default:
        return 0.0;
    }
  }

}
