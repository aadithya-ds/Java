class A {
    private int data = 40;

    public int n = 10;
}

public class Accessmodifiers {

    public static void main(String[] args) {

        // default -access only within the package

        // private - The methods or data members declared as private are accessible only
        // within the class in which they are declared.

        // protected - The methods or data members declared as protected are accessible
        // within the same package or subclasses in different packages.

        // public - Classes, methods, or data members that are declared as public are
        // accessible from everywhere in the program.
        A a = new A();

        System.out.println(a.n);

    }

}
