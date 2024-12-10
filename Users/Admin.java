package Users;


import java.util.*;

import Education.Course;
import Education.Mark;
import Education.Specialty;
import EnumsAndComparators.Faculty;
import EnumsAndComparators.Gender;
import UsersCapabilities.UsersFactory;

public class Admin extends TechSupport implements UsersFactory {
  public Admin(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber) {
    super(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);
  }

  public User Factory(String userType, String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber) {
    switch (userType.toLowerCase()) {
      case "admin":
        return new Admin(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);  
      case "student":
        return new Student(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);  
      case "techSupport":
        return new TechSupport(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);  
      case "teacher":
        return new Teacher(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);  
      case "manager":
        return new Manager(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);  
      case "librarian":
        return new Librarian(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);  
      default:
        throw new IllegalArgumentException("Unknown user type: " + userType);
    }
  }

}
