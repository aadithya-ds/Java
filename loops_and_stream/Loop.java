package loops_and_stream;

import java.util.ArrayList;

public class Loop {

    public static void main(String[] args) {

        ArrayList<String> slist = new ArrayList<>();

        slist.add("John");
        slist.add("Ram");
        slist.add("Sam");

        // for loop

        for (int i = 0; i < slist.size(); i++) {
            System.out.println(slist.get(i));
        }

        // enhanced for loop
        System.out.println("");

        for (String s : slist) {
            System.out.println(s);
        }

    }

}
