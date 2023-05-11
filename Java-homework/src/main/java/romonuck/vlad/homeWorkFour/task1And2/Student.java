package romonuck.vlad.homeWorkFour.task1And2;
import lombok.Data;
@Data
public class Student {
    private String firstName;
    private String secondName;
    private String faculty;

    public Student() {
    }

    public Student(String firstName, String secondName, String faculty) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.faculty = faculty;
    }

    public String getFirstName() {
        return firstName;
    }
}
