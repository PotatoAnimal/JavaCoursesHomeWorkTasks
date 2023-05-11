package romonuck.vlad.homeWorkFour.task1And2;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        // first task
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i< 8 ; i++){
            studentList.add(new Student("Viva"+i, "Vilgotta"+(i*4), (i%2==0) ? "Yes" : "No"));
        }
        for (Student student: studentList){
            if (student.getFaculty() == "No"){
                System.out.println(student);
            }
        }

        Catalog catalog = new Catalog();
        System.out.println(catalog.showStudents(studentList, "Yes"));
    }
}
