package review;

import _00_demo.review.Student2;

import java.util.Comparator;

public class StudentSortById implements Comparator<Student2> {

    @Override
    public int compare(Student2 student_1, Student2 student_2) {
        return student_1.getId() - student_2.getId();
    }
}
