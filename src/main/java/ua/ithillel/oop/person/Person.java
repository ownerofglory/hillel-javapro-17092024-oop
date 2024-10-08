package ua.ithillel.oop.person;

// public, protected, "package-private", private
// read only class
// data class

import ua.ithillel.oop.sport.Jumper;
import ua.ithillel.oop.sport.Runner;

import java.util.Date;
import java.util.Objects;

public class Person implements Cloneable, Runner, Jumper {
    public static final int LEGAL_AGE = 18;

    private String name;
    private int age;
    private Date birthDate;
    private Address address;

    // dynamic init block
    {
        name = "default name";
    }

    // static int block
    static {
        System.out.println(LEGAL_AGE);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }



    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void print(String format) {
        System.out.printf(format, this);
    }

    public void print() {
        System.out.printf("default %s\n", this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (this == o) {
            return true;
        }

        if (!(o instanceof Person)) {
            return false;
        }

        Person person = (Person) o;

        if (age == person.age && Objects.equals(name, person.name)) {
            return true;
        }

        return false;

    }

    @Override
    // 4 bytes -2 billio +2 biilion
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // deep copy
    @Override
    public Person clone() {
        Person person = new Person(name, age);

        Address otherAddress = address.clone();

        person.setAddress(otherAddress);
        return person;
    }


    @Override
    public void run(int distance) {
        System.out.println("Person has run " + distance);
    }

    @Override
    public void jump(int height) {
        System.out.println("Person has jumped " + height + " meters");
    }
}
