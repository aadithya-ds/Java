package Set;

import java.util.LinkedHashSet;

import java.util.*;

public class Linkedhashsetexample {

    public static void main(String[] args) {

        // those it stores value in the insertion order and also doesn't allow
        // duplicates.

        LinkedHashSet<String> ls = new LinkedHashSet<>();

        ls.add("John");
        ls.add("ram");
        ls.add("peter");
        ls.add("John");
        ls.add("sam");
        ls.add("ds");

        // remove

        ls.remove("ram");

        // iterator

        Iterator<String> iterate = ls.iterator();
        while (iterate.hasNext()) {

            System.out.println(iterate.next());

        }

        LinkedList<Integer> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(20);
        l.add(10);
        l.add(50);

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(l);

        System.out.println(lhs.toString());

    }

}
