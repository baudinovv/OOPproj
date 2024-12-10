package UsersCapabilities ;

import java.util.*;
import EnumsAndComparators.Gender;
import Users.User;

public interface UsersFactory 
{
	
	public User Factory(String userType, String firstName, String lastName, int id, String username, Date registrationDate, String phoneNumber, Gender gender, String email, int passportNumber) ;
}

