package Polymorphism;

class Vehicle {

    void run() {
        System.out.println("Vehicle is running properly");
    }
}

public class Overriding extends Vehicle {

    // run time polymorphism

    void run() {
        System.out.println("Vehicle is running Safely");
    }

    public static void main(String[] args) {

        Overriding obj = new Overriding();
        obj.run();

    }

}
