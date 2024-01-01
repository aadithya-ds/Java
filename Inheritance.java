class Mobile {
    void call() {
        System.out.println("we can use call functionality");
    }
}

class Nokia extends Mobile {

    void camera() {
        System.out.println("Nokia has 5MP camera");
    }

}

public class Inheritance {

    public static void main(String[] args) {
        Nokia obj = new Nokia();
        obj.call();
        obj.camera();

    }
}
