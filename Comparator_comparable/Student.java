package Comparator_comparable;

public class Student {

    String name;
    int age;
    String dept;

    public Student(String string, int i, String string2) {

        this.name = string;
        this.age = i;
        this.dept = string2;
    }

    public int compareTo(Student s) {
        if (age == s.age) {
            return 0;

        } else if (age > s.age) {
            return 1;
        } else {
            return -1;
        }

    }

}
