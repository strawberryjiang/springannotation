package com.atguigu.test;


import com.atguigu.bean.Boss;
import com.atguigu.bean.Car;
import com.atguigu.config.MainConfigOfAutoWired;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_AutoWired {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutoWired.class);

    @Test
    public void test01(){
        Boss bean = applicationContext.getBean(Boss.class);
        Car beanCar = applicationContext.getBean(Car.class);
        System.out.println(bean);
        System.out.println(beanCar);
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames=applicationContext.getBeanDefinitionNames();
        for(String name:definitionNames){
            System.out.println(name);
        }
    }
}
