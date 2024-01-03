package Set;

import java.util.LinkedList;
import java.util.TreeSet;

public class Treesetexample {

    public static void main(String[] args) {

        LinkedList<Integer> ls = new LinkedList<>();

        ls.add(20);
        ls.add(10);
        ls.add(60);
        ls.add(20);
        ls.add(10);
        ls.add(50);

        // In treeset the elements gets sorted based on the self balancing binary search
        // tree .It removes duplicte values also

        TreeSet<Integer> trs = new TreeSet<>(ls);

        System.out.println(trs);

    }
}
