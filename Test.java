import Users.*;
import UsersCapabilities.*;
import EnumsAndComparators.*;
import Education.*;
import Communications.*;

public class Test {
  public static void main(String[] args) {
    Admin admin = new Admin("Alisher", "Baudinov", 1, null, null, null, null, null, 0);

    Student student = (Student) admin.Factory("student", "Sonya", "Marmaladova", 0, null, null, null, null, null, 0);

    Teacher teacher = (Teacher) admin.Factory("teacher", "Assylzhan", "Isbassar", 0, null, null, null, null, null, 0)
    
    
  }
}
