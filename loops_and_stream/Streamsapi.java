package loops_and_stream;

import java.util.Arrays;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

class Streamsapi {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 22),
                new Person("David", 35));

        int sumofage = people.stream().mapToInt(Person::getAge).sum();

        System.out.println(sumofage);
    }
}