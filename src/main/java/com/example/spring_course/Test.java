package com.example.spring_course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.calllYourPet();

//        System.out.println(person.getAge());
//        System.out.println(person.getSurname());
//
//        Person person1 = context.getBean("myPerson", Person.class);
//        person1.calllYourPet();

        context.close();

    }
}
