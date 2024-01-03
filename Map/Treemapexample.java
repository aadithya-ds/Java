package Map;

import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Treemapexample {

    public static void main(String[] args) {

        // those treemap follows order .

        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(1, "java");
        tm.put(2, "c++");
        tm.put(4, "go");
        tm.put(3, "python");

        // get value
        System.out.println(tm.get(1));

        // get size
        System.out.println(tm.size());

        // remove
        System.out.println(tm.remove(2));

        for (int i : tm.keySet()) {
            System.out.println("Key:" + i + "Value :" + tm.get(i));
        }

    }

}
