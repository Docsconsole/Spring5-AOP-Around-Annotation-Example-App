package com.docsconsole.tutorials.spring5aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ProductLoggingAspect {
     
	@Around("execution(* com.docsconsole.tutorials.spring5aop.service.ProductManagerServiceImpl.*(..))")
    public void logAroundAllMethods(ProceedingJoinPoint joinPoint) 
    {
        System.out.println(":::::::--> ProductLoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName());
        try {
        	joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
        System.out.println(":::::::--> ProductLoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName());
    }
     
	@Around("execution(* com.docsconsole.tutorials.spring5aop.service.ProductManagerServiceImpl.getProductById(..))")
    public void logAroundGetProduct(ProceedingJoinPoint joinPoint) 
    {
        System.out.println(":::::::--> ProductLoggingAspect.logAroundGetProduct() : " + joinPoint.getSignature().getName());
        try {
        	joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
        System.out.println(":::::::--> ProductLoggingAspect.logAroundGetProduct() : " + joinPoint.getSignature().getName());
    }
     
	@Around("execution(* com.docsconsole.tutorials.spring5aop.service.ProductManagerServiceImpl.createProduct(..))")
    public void logAroundCreateProduct(ProceedingJoinPoint joinPoint) 
    {
        System.out.println(":::::::--> ProductLoggingAspect.logAroundCreateProduct() : " + joinPoint.getSignature().getName());
        try {
        	joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
        System.out.println(":::::::--> ProductLoggingAspect.logAroundCreateProduct() : " + joinPoint.getSignature().getName());
    }
}	