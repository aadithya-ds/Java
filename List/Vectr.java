package List;

import java.util.Collections;
import java.util.Vector;

public class Vectr {
    public static void main(String[] args) {

        Vector<Integer> vlist = new Vector<>();

        // add elements
        vlist.add(23);
        vlist.add(32);
        vlist.add(89);
        vlist.add(76);

        // get element

        System.out.println("Element: " + vlist.get(1));

        // size
        System.out.println("Element: " + vlist.size());

        // update an element
        vlist.set(2, 85);

        Collections.sort(vlist);

        for (int i = 0; i < vlist.size(); i++) {
            System.out.println(vlist.get(i));
        }

    }
}
