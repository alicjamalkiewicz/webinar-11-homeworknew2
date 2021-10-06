package pl.test.OOP_2;

import pl.test.access.Person;

public class Student extends Person {

    public void example(final int age) {
        Student student = new Student();
        System.out.println(student.firstname);

        System.out.println(age);
    }
}
