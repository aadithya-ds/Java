package List;

import java.util.LinkedList;

public class Linkdlist {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        // add element in linked list

        ll.add("John");
        ll.addLast("Mohan");
        ll.add("Peter");
        ll.addFirst("Stuwert");

        // get elemnets from linkedlist

        System.out.println(ll.getFirst());

        System.out.println(ll.get(2));

        // remove

        ll.removeLast();

    }
}
