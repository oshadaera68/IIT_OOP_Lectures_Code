import java.util.List;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class Student extends Person {
    private String studentID;
    private String course;

    public Student(String firstName, String lastName, String studentID) {
        super(firstName, lastName);
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getCourse() {
        return course;
    }

    public void enrollModules(List<String> modules) {
        super.setModules(modules);
    }

    public void enrollCourse(String course) {
        this.course = course;
    }
}
