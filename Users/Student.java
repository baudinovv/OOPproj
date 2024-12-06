package Users ;




public abstract class  Student extends User implements Subscriber, Educationable, CanborrowBook
{
	
	private double gpa;
	
	private int studyYear;
	
	private Faculty faculty;
	
	private int availableECTS;
	
	private int retakeNumber;
	
	private Specialty specialty;
	
	private HashMap<Lesson, Mark> marks;
	
	private Gender gender;
	public  Student(){
		super();
	}
	
	public void returnBook() {
		// TODO implement me	
	}
	
	public void borrowBook() {
		// TODO implement me	
	}
	
	public void viewJournal() {
		// TODO implement me	
	}
	
	public void retakeDiscipline(Discipline parameter) {
		// TODO implement me	
	}
	
	public void addResearchPaper() {
		// TODO implement me	
	}
	
	public void addDropDiscipline() {
		// TODO implement me	
	}
	
	public void addDiscipline(Discipline parameter) {
		// TODO implement me	
	}
	
	public void disciplineRegestration() {
		// TODO implement me	
	}
	
	public void viewTranscript() {
		// TODO implement me	
	}
	
	public void viewAttendanceMark() {
		// TODO implement me	
	}
	
	public void viewSchedule() {
		// TODO implement me	
	}
	
	public void viewAttestation() {
		// TODO implement me	
	}
	
	public void viewTranscript() {
		// TODO implement me	
	}
	
	public String getStudentPrivateData() {
		// TODO implement me
		return "";	
	}
	
	public void showMyPapers() {
		// TODO implement me	
	}
	
	public void viewExamsSchedule() {
		// TODO implement me	
	}
	
	public void createOrganisation() {
		// TODO implement me	
	}
}
