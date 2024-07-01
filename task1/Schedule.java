package finalexam.task1;

public class Schedule {
    private String day;
    private String time;
    private String course;

    public Schedule(String day, String time, String course) {
        this.day = day;
        this.time = time;
        this.course = course;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "day='" + day + '\'' +
                ", time='" + time + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
