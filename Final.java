final class Bike {

    final void run() {
        System.out.println("Running smoothly");
    }
}

public class Final extends Bike {

    final int speed = 400;

    void run() {
        System.out.println("Running properly");
    }

    public static void main(String[] args) {

        // stop variable change , method overriding , inheritance
        Final f = new Final();
        System.out.println(f.speed);

    }
}
