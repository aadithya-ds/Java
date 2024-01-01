public class Statickey {

    public Statickey(String string) {

        System.out.println(string);
    }

    static {
        System.out.println("static method is called");
    }

    public static void main(String[] args) {

        // static - This code inside the static block is executed only once: the first
        // time the class is loaded into memory.

        Statickey obj = new Statickey("Constructor called !");

    }

}
