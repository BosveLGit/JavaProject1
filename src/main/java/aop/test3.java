package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class test3 {

    public static void main(String[] args) {

        System.out.println("Method start");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(myConfig.class);

        UniversityLibrary universityLibrary  = context.getBean("universityLibrary", UniversityLibrary.class);
        String bookName = universityLibrary.returnBook();
        System.out.println("Library get book: " + bookName);


        context.close();

        System.out.println("Method end");
    }

}
