package com.example.spring_course;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;


//    @Autowired
    public Person(@Qualifier("dogBean") Pet pet) {
        this.pet = pet;
    }

    //@Qualifier("dogBean")
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void calllYourPet() {
        System.out.println("my pet...");
        pet.say();
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("Init");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("Destroy");
//    }
}
