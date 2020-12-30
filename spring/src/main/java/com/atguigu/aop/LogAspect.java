package com.atguigu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @description:切面类
 * @author: yangjiang
 * @create: 2020-12-29 20:12
 **/
@Aspect
public class LogAspect {

    @Pointcut("execution(public int com.atguigu.aop.MathCalculator.*(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature().getName() + "运行。。。@Before参数列表是：" + Arrays.asList(args));
    }


    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "结束。。。 @After");
    }

    @AfterReturning(value = "pointCut()", returning = "o")
    public void logReturn(JoinPoint joinPoint, Object o) {
        System.out.println(joinPoint.getSignature().getName() + "运行正常返回。。。@AfterReturning运行结果" + o);
    }

    @AfterThrowing(value = "pointCut()", throwing = "e")
    public void logException(JoinPoint joinPoint, Exception e) {
        System.out.println(joinPoint.getSignature().getName() + "异常。。。异常信息：@AfterThrowing" + e);
    }
}
