package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniversityLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniversityLibrary.return*())")
//    private void allReturnMethodsFronUniLibrary() {}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFronUniLibrary()")
//    private void allGetAndReturnFronUniLibrary() {}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: log #1");
//    }
//
//    @Before("allReturnMethodsFronUniLibrary()")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: log #2");
//    }
//
//      @Before("allGetAndReturnFronUniLibrary()")
// //   @Before("execution(* aop.UniversityLibrary.get*()) || execution(* aop.UniversityLibrary.return*())")
//    public void beforeGetAndReturnBookAdvice() {
//        System.out.println("beforeGetAndReturnBookAdvice: log #3");
//    }
//
//    @Before("execution(* aop.UniversityLibrary.*()) && !execution(public void aop.UniversityLibrary.returnMagazine())")
//    public void beforeGetAndReturnBookAdvice() {
//        System.out.println("beforeGetAndReturnBookAdvice: log #10");
//    }


    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeGetBookAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        System.out.println("methodSignature " + methodSignature);
        System.out.println("methodSignature.getMethod " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();

            for(Object obj : arguments){
                if(obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println(obj.toString());
                } else if(obj instanceof String) {
                    System.out.println("book add: " + obj);
                }

            }
        }


        System.out.println("beforeGetBookAdvice: log");
        System.out.println("---------------------------------");
    }



}
