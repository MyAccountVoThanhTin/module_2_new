package _00_demo.review;

import _00_demo.review.Student2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManager {
    public static void main(String[] args) {
        List<Student2> studentList = new ArrayList<>();
        studentList.add(new Student2(2, "Nguyen Van A"));
        studentList.add(new Student2(5, "Nguyen Van C"));
        studentList.add(new Student2(3, "Nguyen Van B"));
        studentList.add(new Student2(3, "Nguyen Van E"));
        studentList.add(new Student2(3, "Nguyen Van F"));
        studentList.add(new Student2(1, "Nguyen Van D"));


        //Collections.sort(studentList);
        //Collections.sort(studentList, new StudentSortById());
        Collections.sort(studentList, new review.StudentSortByName());

        for(Student2 student: studentList){
            System.out.println(student);
        }
    }
}
