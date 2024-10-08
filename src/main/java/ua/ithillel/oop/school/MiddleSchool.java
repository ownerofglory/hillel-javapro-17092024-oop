package ua.ithillel.oop.school;

import ua.ithillel.oop.person.Student;

public class MiddleSchool extends School {
    public MiddleSchool(String name) {
        super(name);
    }

    @Override
    public void enroll(Student student) {
        if (student.getAge() < 12 && student.getGpa() > 0) {
            students.add(student);
        }
    }
}
