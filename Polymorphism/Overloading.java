package Polymorphism;

public class Overloading {

    // compile time polymorphism
    public int add(int a, int b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + " " + b;
    }

    public static void main(String[] args) {

        Overloading obj = new Overloading();

        System.out.println(obj.add(10, 20));
        System.out.println(obj.add("Hello", "World"));

    }

}
