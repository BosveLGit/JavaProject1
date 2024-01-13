package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: log before");
    }

//    @AfterReturning(pointcut = "execution(* getStudents())",
//                    returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//
//        Student st1 = students.get(0);
//        st1.setName("Mr. " + st1.getName());
//        st1.setAvgGrade(st1.getAvgGrade() + 2);
//
//        System.out.println("beforeGetStudentsLoggingAdvice: log after");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",
//                    throwing = "exception")
//    public void afterThrowingGetStudentsLiggingADvice(Throwable exception) {
//        System.out.println("afterThrowingGetStudentsLiggingADvice: log throwing " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: log after or throwing");
    }

}
