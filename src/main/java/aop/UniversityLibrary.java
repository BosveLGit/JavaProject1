package aop;

import org.springframework.stereotype.Component;

@Component()
public class UniversityLibrary extends AbstractLibrary{

 //   @Override
    public void getBook() {
        System.out.println("get university book...");
        System.out.println("------------------------------");
    }

    public void getMagazine() {
        System.out.println("get university magazine...");
        System.out.println("------------------------------");
    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("return university book...");
        return "Petrov book";
    }

    public void returnMagazine() {
        System.out.println("return university magazine...");
        System.out.println("------------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("add university book...");
        System.out.println("------------------------------");
    }

    public void addMagazine() {
        System.out.println("add university magazine...");
        System.out.println("------------------------------");
    }
}
