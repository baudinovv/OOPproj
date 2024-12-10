package Education ;




public class Lesson
{
	
	private String LessonName;
	
	private Teacher teacher;
	
	private Course course;
	
	private WeekDay lessonDay;
	
	private  LessonTime;
	
	private String room;
	
	private Language Language;
	private List<Student> enrolledStudents;
    private Map<Student, List<Grade>> studentGrades;

    public Lesson() {
        this.enrolledStudents = new ArrayList<>();
        this.studentGrades = new HashMap<>();
    }
	
	public void viewMarks() {
        if (studentGrades.isEmpty()) {
            throw new IllegalStateException("No grades available");
        }
        studentGrades.forEach((student, grades) -> {
            System.out.println("Student: " + student.getName());
            System.out.println("Grades: " + grades);
        });
    }
	
	public List<Grade> getMarks(Student student) {
        if (!enrolledStudents.contains(student)) {
            throw new IllegalArgumentException("Student not enrolled in this lesson");
        }
        return studentGrades.getOrDefault(student, new ArrayList<>());
    }

	
	public void registerStudent(Student student) {
        if (enrolledStudents.contains(student)) {
            throw new IllegalStateException("Student already registered");
        }
        enrolledStudents.add(student);
        studentGrades.put(student, new ArrayList<>());
        System.out.println("Student " + student.getName() + " registered for " + lessonName);
    }
	
	public void scheduleLesson(Time time, WeekDay day, String room) {
        this.lessonTime = time;
        this.lessonDay = day;
        this.room = room;
        System.out.println("Lesson scheduled for " + day + " at " + time + " in room " + room);
    }
}
