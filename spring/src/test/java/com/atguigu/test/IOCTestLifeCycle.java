package com.atguigu.test;

import com.atguigu.config.MainConfigLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: yangjiang
 * @create: 2020-12-20 15:04
 **/
public class IOCTestLifeCycle {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigLifeCycle.class);
//        System.out.println(context.getBean("car"));
        context.close();
    }
}
