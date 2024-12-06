package Users ;




public class Teacher extends Employee implements Manageable, CanborrowBook
{
	
	private TeacherType teacherType;
	
	private Set<Course> course;
	public Teacher(){
		super();
	}
	
	public void getCourses() {
		// TODO implement me	
	}
	
	public void borrowBook() {
		// TODO implement me	
	}
	
	public void showMenu() {
		// TODO implement me	
	}
	
	public void returnBook() {
		// TODO implement me	
	}
	
	public void viewDisciplineSchedule() {
		// TODO implement me	
	}
	
	public void viewAttestation() {
		// TODO implement me	
	}
	
	public void viewStudentInfo() {
		// TODO implement me	
	}
	
	public void attestationMark() {
		// TODO implement me	
	}
	
	public void attendanceJournal() {
		// TODO implement me	
	}
	
	public void journalMark() {
		// TODO implement me	
	}
}
