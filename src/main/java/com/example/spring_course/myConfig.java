package com.example.spring_course;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com.example.spring_course")
@PropertySource("classpath:myApp.properties")
public class myConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    @Scope("singleton")
    public Pet dogBean() {
        return new Dog();
    }

    @Bean
    public Person personBean() {
        return new Person(dogBean());
    }

}
