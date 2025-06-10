import java.util.*;

class Student implements Comparable<Student> {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return rollNo + " = " + name;
    }

    @Override
    public int compareTo(Student s) {
        if (this.rollNo < s.rollNo)
            return -1;
        else if (this.rollNo > s.rollNo)
            return 1;
        else
            return 0;
    }
}

public class Testing {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(102, "Aman"));
        students.add(new Student(101, "Saurav"));
        students.add(new Student(103, "Neha"));

        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}