import java.util.List;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class Test {
    public static void main(String[] args) {
        Student obj = new Student("Era", "Boy", "12345");
        obj.enrollCourse("Java");
        obj.enrollModules(List.of("Java", "Python", "C++"));
    }
}
