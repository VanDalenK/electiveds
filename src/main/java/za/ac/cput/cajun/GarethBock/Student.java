package za.ac.cput.cajun.GarethBock;

public class Student {

    private int studentNo;
    private String name;
    private int age;

    public Student(int studentNo, String name, int age) {
        this.studentNo = studentNo;
        this.name = name;
        this.age = age;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return studentNo  == student.studentNo;
    }

    @Override
    public int hashCode() {
        return studentNo;
    }
}
