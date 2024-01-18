package Test02;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int rollNo;
    private int age;


    public Student(int rollNo, String name, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student compareStudent) {
        int compareAge = compareStudent.getAge();
        return compareAge - this.age;
    }

    public static Comparator<Student> compareName = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            String StudentName1 = o1.getName().toUpperCase();
            String StudentName2 = o2.getName().toUpperCase();

            //ascending order
            return StudentName1.compareTo(StudentName2);

            //descending order
            //return StudentName2.compareTo(StudentName1);
        }
    };

    public static Comparator<Student> compareRollno = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            int studentRollNo1 = o1.getRollNo();
            int studentRollNo2 = o2.getRollNo();

            //ascending order
            return studentRollNo1-studentRollNo2;

            //descending order
            //return studentRollNo2-studentRollNo1;
        }
    };

}
