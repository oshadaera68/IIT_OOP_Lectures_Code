import java.util.ArrayList;
import java.util.List;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class Person {
    private final List<String> modules;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.modules = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules.add(String.valueOf(modules));
    }
}
