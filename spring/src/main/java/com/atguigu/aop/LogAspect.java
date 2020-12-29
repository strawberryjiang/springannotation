package com.atguigu.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;

/**
 * @description:
 * @author: yangjiang
 * @create: 2020-12-29 20:12
 **/
public class LogAspect {


    @Before("com.atguigu.aop.MathCalculator.*(..)")
    public void logStart() {
        System.out.println("除法运行。。。参数列表是：{}");
    }


    @After("com.atguigu.aop.MathCalculator.*(..)")
    public void logEnd() {
        System.out.println("除法结束。。。");
    }

    public void logReturn() {
        System.out.println("除法正常返回。。。运行结果：{}");
    }

    public void logException() {
        System.out.println("除法异常。。。异常信息：{}");
    }
}
