package review;

import _00_demo.review.Student2;

import java.util.Comparator;

public class StudentSortByName implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
