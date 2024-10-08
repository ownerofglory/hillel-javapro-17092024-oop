package ua.ithillel.oop.school;

import ua.ithillel.oop.person.Student;

public class University extends School {
    public University(String name) {
        super(name);
    }

    @Override
    public void enroll(Student student) {
        if (student.getAge() > 16 && student.getGpa() > 6) {
            students.add(student);
        }
    }
}
