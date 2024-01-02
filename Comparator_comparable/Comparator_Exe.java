package Comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Namecomparaor implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.name).compareTo(o2.name);
    }

}

class Agecomparaor implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.age == o2.age) {
            return 0;
        } else if (o1.age > o2.age) {
            return 1;
        } else {
            return -1;
        }

    }

}

public class Comparator_Exe {

    public static void main(String[] args) {

        ArrayList<Student> slist = new ArrayList<>();

        slist.add(new Student("sad", 22, "CSE"));
        slist.add(new Student("aad", 24, "ECE"));
        slist.add(new Student("john", 21, "MECH"));

        Collections.sort(slist, new Agecomparaor());
        System.out.println("Age comparator");
        for (Student s : slist) {
            System.out.println(s.name + "\t" + s.age + "\t" + s.dept);
        }

        Collections.sort(slist, new Namecomparaor());
        System.out.println("Name comparator");
        for (Student s : slist) {
            System.out.println(s.name + "\t" + s.age + "\t" + s.dept);
        }

    }

}
