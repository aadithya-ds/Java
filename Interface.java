interface example {

    void exp();
}

interface example2 {
    void exp1();
}

public class Interface implements example, example2 {

    public static void main(String[] args) {

        // Another way to achieve abstraction in Java, is with interfaces.

        // An interface is a completely "abstract class" that is used to group related
        // methods with empty bodies:
        Interface obj = new Interface();
        obj.exp();
        obj.exp1();

    }

    @Override
    public void exp1() {
        System.out.println("thoe it is an interface exp1");
    }

    @Override
    public void exp() {
        System.out.println("thoe it is an interface exp");
    }

}
