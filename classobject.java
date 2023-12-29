public class classobject {
<<<<<<< HEAD

    // class and objects and static variable and static methods and constructor.
=======
 
    //class and objects and static variable and static methods and constructor.
>>>>>>> 770d49a8e7f896241bbda9ee83108e85f3840405

    int x = 5;
    int s, t;

    public static int svar = 10;

    public static int multiply(int n, int y) {
        return n * y;

    }

    public static void main(String[] args) {
        classobject myObj = new classobject(); // created an object

        System.out.println(myObj.x);

        System.out.println(classobject.svar);

        System.out.println("Calling a static method Multiply:" + multiply(10, 10));

    }

}
