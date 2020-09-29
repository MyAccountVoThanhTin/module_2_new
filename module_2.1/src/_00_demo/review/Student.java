package review;

public class Student implements Comparable<Student>{
    private int id;
    private String name;


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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     *
     * @param otherStudent
     * @return 0 khi hai doi tuong bang nhau
     *         >0 khi doi tuong ben trai lon hon ben phai
     *         <0 khi doi tuong ben phai nhi hon ben trai
     */
    @Override
    public int compareTo(Student otherStudent) {
        int result = this.id - otherStudent.getId();
        if(result==0){
            return otherStudent.getName().compareTo(this.name);
        }
        return result;
    }
}
