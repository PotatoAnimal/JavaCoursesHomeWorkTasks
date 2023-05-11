package romonuck.vlad.homeWorkFour.task1And2;

import java.util.List;
import java.util.stream.Collectors;

public class Catalog {
    public List<Student> showStudents(List<Student> list, String s){
        if (list.isEmpty()){
            return null;
        }
        List<Student> list1 = list
                .stream()
                .filter(student -> student.getFaculty().equals(s))
                .collect(Collectors.toList());
        return list1;
    }
}
