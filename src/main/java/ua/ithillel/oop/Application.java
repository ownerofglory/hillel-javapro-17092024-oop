package ua.ithillel.oop;

import ua.ithillel.oop.classes.Outer;
import ua.ithillel.oop.config.ConfigRecord;
import ua.ithillel.oop.config.ProgramConfig;
import ua.ithillel.oop.connection.SomeConnection;
import ua.ithillel.oop.person.Employee;
import ua.ithillel.oop.person.Person;
import ua.ithillel.oop.person.Student;
import ua.ithillel.oop.school.Elementary;
import ua.ithillel.oop.school.MiddleSchool;
import ua.ithillel.oop.school.School;
import ua.ithillel.oop.school.University;
import ua.ithillel.oop.sport.Jumper;
import ua.ithillel.oop.sport.Runner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Application {
    public static void main(String[] args) {
        var anonObj = new Person("anonimous", 10) {
            private int i;

            public void anonPrint() {
                System.out.println("Anou");
            }
        };


        // singleton
        SomeConnection someConnection = SomeConnection.getInstance();
        SomeConnection instance = SomeConnection.getInstance();




        System.out.println(anonObj instanceof Person);
        anonObj.anonPrint();
        anonObj.anonPrint();
        anonObj.anonPrint();

        var r = new Runner() {

            @Override
            public void run(int distance) {
                System.out.println("Anon is running");
            }

            public void someAnon() {
                System.out.println("Some anon");
            }
        };

        r.run(100);
        r.someAnon();

        var r2 = new Runner() {

            @Override
            public void run(int distance) {
                System.out.println("Anon is running");
            }

            public void someAnon() {
                System.out.println("Some anon");
            }
        };


        new Outer(10) {
            private int anonimousInt = 100;

            public void printAnonimos() {
                System.out.println("anonimous" + anonimousInt);
            }
        }.printAnonimos();

        List<Person> people = new ArrayList<>() {{
            add(new Person("sd", 21));
            add(new Person("sd", 21));
            add(new Person("sd", 21));
            add(new Person("sd", 21));
        }};

//        Outer.Inner inner = new Outer(12).new Inner(100);
        Outer outer = new Outer(12);
        Outer.Inner inner = outer.new Inner(100);

        Outer.StaticInner staticInner = new Outer.StaticInner();

        // builder
        ProgramConfig config = ProgramConfig.builder()
                .setCredential("kjbkniknk")
                .setUsername("user")
                .setConfigPath("/ss/sss.json")
                .build();

        ProgramConfig newConfig = ProgramConfig.builder()
                .setConfigPath(config.getConfigPath())
                .setCredential("sfsfd")
                .build();


        Runner runner = new Person("Vasyl", 20);
        runner.run();
        runner.run(Runner.DEFAULT_DISTANCE + 200);

        int defaultDistance = runner.DEFAULT_DISTANCE;

        Jumper jumper = new Person("Hanna", 23);
        jumper.jump(12);




        Person p = new Employee("Jack", 38, "Tester");
        p.print("%s\n");
        p.print();

        Person ps = new Student("Julie", 29, 8.9);
        ps.print("%s\n");



        String format = "datetime:%s, output: %s";
        String format1 = String.format(format, new Date(), new Object());

        School[] schools = new School[] {
          new Elementary("Some elementary"),
          new University("KPI"),
          new University("ONPU"),
          new MiddleSchool("School #1")
        };

        School school = new University("School #1");


        Student petro = new Student("Petro", 12, 0);
        Person clone = petro.clone();

        Student petroCopy = new Student(petro.getName(), petro.getAge(), petro.getGpa());


        Person petroDiia = new Person("Petro", 12);

        System.out.println(petro);
        System.out.println(petroDiia);

        boolean e1 = petroDiia.equals(petro);
        boolean e2 = petro.equals(petroDiia);


        Student anna = new Student("Anna", 17, 8.7);

//        Student somePetro = schools[0].getStudents().get(0);
        Student otherPetro = new Student("Petro", 12, 0);


        if (petro.equals(otherPetro)) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }


        School kpi = schools[1];
        kpi.createFaculty("Computer Science");
        kpi.createFaculty("Physics");

        School onpu = schools[2];
        onpu.createFaculty("Computer Science");

        kpi.enroll(anna);
        onpu.enroll(anna);



//        School someSchool = new School("some school");

//        Employee employee = new Employee();
//        // employee is a Person
        Person p1 = new Employee("John", 32, "Tester");
        Object o1 = new Employee("John", 32, "Tester");
        Object o2 = p1;

        Student ivan = new Student("Ivan", 32, 8.9);
        double gpa = ivan.getGpa();
        Person ivanP = ivan;

        // using operatort instanceof
        if (ivanP instanceof Student) {
            Student ivanS = (Student) ivanP;
            ivanS.getGpa();
        }

        // using class metadata
        if (ivanP.getClass().equals(Student.class)) {
            Student ivanS = (Student) ivanP;
            ivanS.getGpa();
        }


        int legalAge = Person.LEGAL_AGE;
//        Person.LEGAL_AGE = 21; // not allowed

//        Person person1 = new Person();
        int age = 34;
        System.out.printf("Legal age: %d%n", Person.LEGAL_AGE);


//        person1.setAge(age);
//        person1.setName("John Doe");

        Person person2 = new Person("Jane Doe", 23);

//        person2.setName("Jane Doe");
//        person2.setAge(-100);
//        person2.setAge(23);

//        System.out.printf("%s: %d%n", person1.getName(), person1.getAge());
        System.out.printf("%s: %d%n", person2.getName(), person2.getAge());
    }
}
