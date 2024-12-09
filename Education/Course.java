package Education ;




public class Course
{
	
	private String Courseid;
	
	private String name;
	
	private int credits;
	
	private String type;
	
	private Teacher teachers;
	
	private  ArrayList<String>  students;
	
	private Lesson lessons;

	 public Course(String courseId, String name, int credits, String type, Teacher teachers, Lesson lessons) {
        this.courseId = courseId;
        this.name = name;
        this.credits = credits;
        this.type = type;
        this.teachers = teachers;
        this.lessons = lessons;
        this.students = new ArrayList<>();
    }
	
	public void addStudent(Student student) {
        if (student != null) {
            students.add(student.getName());
        }
    }
	
	public void removeStudent(Student student) {
        if (student != null) {
            students.remove(student.getName());
        }
    }

	
	public String getCourseName() {
        return name;
    }

    public Lesson getLesson() {
        return lessons;
    }
	 public int getCredits() {
        return credits;
    }

}
