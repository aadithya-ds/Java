package constructors;

public class Copyconstructor {

    String name;
    int age;
    String dept;

    public Copyconstructor(String string, int i, String string2) {
        this.name = string;
        this.age = i;
        this.dept = string2;

    }

    Copyconstructor(Copyconstructor c) {
        this.name = c.name;
        this.age = c.age;
        this.dept = c.dept;
    }

    public static void main(String[] args) {

        Copyconstructor cpy = new Copyconstructor("john", 23, "CSE");

        System.out
                .println("My name is " + cpy.name + " and my age is " + cpy.age + " and my department is " + cpy.dept
                        + "\n");

        Copyconstructor cpy1 = new Copyconstructor(cpy);
        System.out
                .println("My name is " + cpy1.name + " and my age is " + cpy1.age + " and my department is " + cpy1.dept
                        + " those copied from first object");

    }
}