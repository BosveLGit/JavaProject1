package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(myConfig.class);

        UniversityLibrary universityLibrary = contex.getBean("universityLibrary", UniversityLibrary.class);
        Book book = contex.getBean("book", Book.class);

        universityLibrary.addBook("Ivan", book);
        universityLibrary.addMagazine();

//        SchoolLibrary schoolLibrary = contex.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        contex.close();

    }
}
