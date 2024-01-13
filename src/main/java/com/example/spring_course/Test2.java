package com.example.spring_course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Person person = context.getBean("personBean", Person.class);
        person.calllYourPet();

        System.out.println(person.getAge());
        System.out.println(person.getSurname());

        context.close();
    }
}
