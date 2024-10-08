package ua.ithillel.oop.person;

public class Employee extends Person {
    private String job;

    public Employee(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    public Employee() {
        super("Default", 0);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


    @Override
    public void print(String format) {
        System.out.printf(format, "Employee " + this);
    }

    @Override
    public void run(int distance) {
        System.out.println("Gotta work, no running today");
    }
}
