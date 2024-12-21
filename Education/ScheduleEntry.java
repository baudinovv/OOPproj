package Education;

import EnumsAndComparators.WeekDay;

public class ScheduleEntry {

    private Lesson lesson;
    private WeekDay dayLesson;
    private int room;
    private String time;


    public ScheduleEntry() {
        super();
    }

    public ScheduleEntry(Lesson lesson, WeekDay dayLesson, int room, String time) {
        this.lesson = lesson;
        this.dayLesson = dayLesson;
        this.room = room;
        this.time = time;
    }

    public void schedule(Lesson lesson, WeekDay dayLesson, int room, String time) {
        if (lesson == null || dayLesson == null || time == null || room <= 0) {
            throw new IllegalArgumentException("Invalid schedule entry details.");
        }
        this.lesson = lesson;
        this.dayLesson = dayLesson;
        this.room = room;
        this.time = time;

        System.out.println("Schedule Entry successfully created:");
        System.out.println(this);
    }

    public void addScheduleEntry() {
        System.out.println("Schedule entry for " + lesson.getLessonName() + " on " + dayLesson +
                " at " + time + " in room " + room + " added to the system.");
    }

    public void viewSchedule() {
        if (lesson == null || dayLesson == null || time == null) {
            System.out.println("No schedule entry available.");
        } else {
            System.out.println("Schedule Entry:");
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        return "Lesson: " + (lesson != null ? lesson.getLessonName() : "None") +
                ", Day: " + (dayLesson != null ? dayLesson : "None") +
                ", Room: " + room +
                ", Time: " + time;
    }
}
