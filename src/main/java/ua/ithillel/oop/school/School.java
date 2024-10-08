package ua.ithillel.oop.school;

import ua.ithillel.oop.person.Student;

import java.util.ArrayList;
import java.util.List;

public abstract class School {
    private String name;

    protected List<Student> students = new ArrayList<>();
    protected List<Faculty> faculties = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public abstract void enroll(Student student);

    public void createFaculty(String name) {
        new Faculty(name);
        faculties.add(new Faculty(name));
    }
}
