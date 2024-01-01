package encapsulation;

public class Person {

    private int age;
    private String name;

    public void setName(String val) {
        this.name = val;
    }

    public void setAge(int i) {
        this.age = i;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
