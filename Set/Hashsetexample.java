package Set;

import java.util.HashSet;

public class Hashsetexample {

    public static void main(String[] args) {

        // those it prints in a random order and it does not allow duplicates

        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(30);
        hs.add(5);
        hs.add(50);
        hs.add(10);

        // get
        System.out.println(hs.remove(5));

        // size
        System.out.println(hs.size());

        System.out.println(hs);

        // contains

        System.out.println(hs.contains(10));
    }

}
