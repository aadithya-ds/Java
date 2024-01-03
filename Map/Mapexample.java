package Map;

import java.util.HashMap;
import java.util.Map;

public class Mapexample {

    public static void main(String[] args) {

        // in hashmap the contents takes random order and doesn't take duplicate value

        // and when you insert a duplicate value with an existing key it updates with
        // the new value.

        Map<Integer, String> m = new HashMap<>();

        // insert value i hashmap

        m.put(1, "John");
        m.put(2, "ram");
        m.put(4, "smith");
        m.put(3, "bob");

        // get values

        for (int i : m.keySet()) {
            System.out.println("Key :" + i + "\t Value :" + m.get(i));

        }

        // get size
        System.out.println(m.size());

        // get individual value

        System.out.println(m.get(1));

        m.put(3, "brain");

        System.out.println(m.toString());

    }

}
