public class methods {

    public String nmethod() {
        String s = "Calling an method/function";
        return s;
    }

    public static String stmethod() {
        String s = "Calling an static method/function";
        return s;
    }

    public static void main(String[] args) {
        methods m = new methods();

        System.out.println("Methods or Functions");
        System.out.println(m.nmethod());
        System.out.println(stmethod());

    }
}
