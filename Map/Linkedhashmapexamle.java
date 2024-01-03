package Map;

import java.util.LinkedHashMap;

public class Linkedhashmapexamle {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

        lhm.put(1, "one");
        lhm.put(3, "three");
        lhm.put(2, "two");
        lhm.put(5, "five");
        lhm.put(4, "four");

        // size

        System.out.println(lhm.size());

        // get value

        for (Integer key : lhm.keySet()) {
            System.out.println("Key: " + key + " Value: " + lhm.get(key));
        }

    }

}
