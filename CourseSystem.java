// Superclass: Course
class Course {
    protected String courseName;
    protected int duration; // in weeks

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // in percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFinalPrice() {
        return fee - (fee * (discount / 100));
    }

    @Override
    public void displayDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No") +
                ", Fee: $" + fee + ", Discount: " + discount + "%, Final Price: $" + getFinalPrice());
    }
}

public class CourseSystem {
    public static void main(String[] args) {
        Course course = new Course("Java Basics", 6);
        OnlineCourse onlineCourse = new OnlineCourse("Python for Data Science", 8, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced AI", 10, "Coursera", true, 500, 20);

        course.displayDetails();
        onlineCourse.displayDetails();
        paidCourse.displayDetails();
    }
}
