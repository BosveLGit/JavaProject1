package com.example.spring_course;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext contex =
                new AnnotationConfigApplicationContext(myConfig.class);

        Person person = contex.getBean("personBean", Person.class);

        person.calllYourPet();
        System.out.println(person.getAge());
        System.out.println(person.getSurname());

    }
}
