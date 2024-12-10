package Users;

import java.util.function.Supplier;

import UsersCapabilities.UsersFactory;

public class Admin extends TechSupport implements UsersFactory {
  public Admin() {
    super();
  }

  @Override
  public User Factory(String userType) {
    switch (userType.toLowerCase()) {
      case "Admin":
        return new Admin();  
      case "TechSupport":
        return new TechSupport();  
      case "Teacher":
        return new Teacher();  
      case "Manager":
        return new Manager();  
      case "Professor":
        return new Professor();  
      case "Librarian":
        return new Librarian();  
      case "Organizations":
        return new Organiztions();  
      case "Books":
        return new Books();  
      default:
        throw new IllegalArgumentException("Unknown user type: " + userType);
    }
  }
}
