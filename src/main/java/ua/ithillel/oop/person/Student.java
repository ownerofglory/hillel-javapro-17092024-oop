package ua.ithillel.oop.person;

import ua.ithillel.oop.sport.Jumper;

import java.util.Iterator;

public final class Student extends Person implements Comparable<Student>, Iterable {
    private double gpa; // average grade

    public Student(String name, int age, double gpa) {
        super(name, age);

        this.gpa = gpa;
    }

    public double getGpa() {
        final int i = 1;
        return gpa;
    }

    public void setGpa(final double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                "gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void jump(int height) {
        System.out.println("Student doesn't jump");
    }
}
