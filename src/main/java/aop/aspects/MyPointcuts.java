package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* add123*(..))")
    public void allAddMethods(){}

}
