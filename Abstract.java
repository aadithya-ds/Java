abstract class Bank {

    abstract int getInterest();

}

class Sbi extends Bank {

    int getInterest() {
        return 8;

    }

}

class Pnb extends Bank {

    int getInterest() {
        return 7;
    }
}

public class Abstract {

    public static void main(String[] args) {
        // A class which is declared with the abstract keyword is known as an abstract
        // class in Java. It can have abstract and non-abstract methods (method with the
        // body).

        Bank b;
        b = new Sbi();
        System.out.println(b.getInterest());
        b = new Pnb();
        System.out.println(b.getInterest());

    }

}
