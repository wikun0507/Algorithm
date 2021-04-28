package Java_Base;

import java.util.Objects;

/**
 * @author Administrator
 */
public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("Null被叼了");
    }

    public Person(String name) {
        this();
        this.name = name;
        System.out.println("Name被叼了");
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
