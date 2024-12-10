package Users;


import java.util.*;

import EnumsAndComparators.Gender;
import UsersCapabilities.UsersFactory;

public class Admin extends TechSupport implements UsersFactory {
  public Admin(String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber) {
    super(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);
  }

  @Override
  public User Factory(String userType, String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber) {
    switch (userType.toLowerCase()) {
      case "Admin":
        return new Admin(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);  
      case "TechSupport":
        return new TechSupport(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);  
      case "Teacher":
        return new Teacher(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);  
      case "Manager":
        return new Manager(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);  
      case "Librarian":
        return new Librarian(firstName, lastName,id, username, registrationDate, phoneNumber, gender, email, passportNumber);  
      default:
        throw new IllegalArgumentException("Unknown user type: " + userType);
    }
  }
}
