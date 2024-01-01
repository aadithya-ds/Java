package constructors;

public class Parameterized {

    Parameterized(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        Parameterized obj = new Parameterized("Parameter Value");
    }

}
