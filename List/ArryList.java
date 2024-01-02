package List;

import java.util.ArrayList;
import java.util.Collections;

public class ArryList {

    public static void main(String[] args) {

        ArrayList<Integer> alist = new ArrayList<>();

        // add element in array list
        alist.add(100);
        alist.add(90);
        alist.add(23);
        alist.add(43);

        // get an element
        System.out.println(alist.get(0));

        // update an element
        alist.set(2, 85);

        // size of array list
        System.out.println("Size :" + alist.size());

        // sort arraylist

        Collections.sort(alist);

        // enhanced for loop

        for (int s : alist) {
            System.out.println(s);
        }

        // remove an element

        alist.remove(2);

    }
}
