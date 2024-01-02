package Comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;

class Students implements Comparable<Students> {
    String name;
    int age;
    String department;

    public Students(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public int compareTo(Students o) {
        if (age == o.age)
            return 0;
        else if (age > o.age)
            return 1;
        else
            return -1;
    }

    // Getters and other methods

}

public class Comparale {

    public static void main(String[] args) {
        ArrayList<Students> slist = new ArrayList<>();
        slist.add(new Students("sad", 21, "EEE"));
        slist.add(new Students("john", 27, "ECE"));
        slist.add(new Students("bob", 32, "CSE"));
        slist.add(new Students("asd", 22, "CSE"));

        Collections.sort(slist);

        // Printing the sorted list
        for (Students student : slist) {
            System.out.println(student.name + "\t" + student.age + "\t" + student.department);
        }
    }
}
