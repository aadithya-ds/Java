package encapsulation;

public class main {
    public static void main(String[] args) {
        Person obj = new Person();

        obj.setName("john");
        obj.setAge(22);

        System.out.println("MY NAME IS " + obj.getName().toUpperCase() + " AND MY AGE IS " + obj.getAge());

    }

}
