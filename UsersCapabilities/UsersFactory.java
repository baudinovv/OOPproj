package UsersCapabilities ;

import java.util.*;

import Education.Course;
import Education.Mark;
import Education.Specialty;
import EnumsAndComparators.Faculty;
import EnumsAndComparators.Gender;
import EnumsAndComparators.TeacherType;
import Users.*;

public interface UsersFactory 
{
  public User Factory(String userType, String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber);
}

