package _10_array_list.exercise._01_arraylist;

public class MyListTest {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student = new Student(1,"tin");
        Student student_1 = new Student(2,"vo");
        Student student_2 = new Student(3,"thanh");
        Student student_3 = new Student(4,"tien");
        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(student);
        studentMyList.add(student_1);
        studentMyList.add(student_2);
        studentMyList.add(student_3);
        studentMyList.clear();
        System.out.println(studentMyList.size());
//        for (int i = 0;i < studentMyList.size(); i++){
//            Student student1 =(Student) studentMyList.elements[i];
//            System.out.println(student1.getId() + " "+student1.getName());
//        }
    }
}
