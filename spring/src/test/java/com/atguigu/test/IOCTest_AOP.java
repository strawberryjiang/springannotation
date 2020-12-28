package com.atguigu.test;

import com.atguigu.bean.MathCalculator;
import com.atguigu.config.MainConfigOfAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_AOP {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);

    @Test
    public void test01(){
        MathCalculator bean = applicationContext.getBean(MathCalculator.class);
        bean.div(3,2);
    }


}
