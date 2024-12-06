package Users ;




public abstract class User
{
	
	private String firstName;
	
	private String lastName;
	
	private int id;
	
	private String username;
	
	private Date registrationDate;
	
	private String phoneNumber;
	
	private Gender gender;
	
	private String email;
	
	private int passportNumber;
	
	public String getFirstName() {
		// TODO implement me
		return "";	
	}
	
	public String getLastName() {
		// TODO implement me
		return "";	
	}
	
	public int getUserId() {
		// TODO implement me
		return 0;	
	}
	
	public String getEmail() {
		// TODO implement me
		return "";	
	}
	
	public User(String Name, int User_id) {
		super();
		// TODO construct me	
	}
	
	public void showMenu() {
		// TODO implement me	
	}
	
	public void editPassword() {
		// TODO implement me	
	}
	
	public int getPhoneNumber() {
		// TODO implement me
		return 0;	
	}
	
	public Gender getGender() {
		// TODO implement me
		return null;	
	}
	
	public String getUsername() {
		// TODO implement me
		return "";	
	}
	
	public void getRegistrationDate() {
		// TODO implement me	
	}
	
	public void sendMessage() {
		// TODO implement me	
	}
	
	public void viewNews() {
		// TODO implement me	
	}
}
