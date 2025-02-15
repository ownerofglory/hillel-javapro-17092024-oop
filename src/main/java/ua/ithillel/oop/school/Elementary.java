package ua.ithillel.oop.school;

import ua.ithillel.oop.person.Student;

public class Elementary extends School {
    public Elementary(String name) {
        super(name);
    }

    @Override
    public void enroll(Student student) {
        if (student.getAge() > 4) {
            students.add(student);
        }
    }
}
