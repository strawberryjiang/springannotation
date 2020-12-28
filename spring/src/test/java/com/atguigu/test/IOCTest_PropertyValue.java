package com.atguigu.test;


import com.atguigu.bean.Person;
import com.atguigu.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_PropertyValue {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);

    @Test
    public void test01(){
        printBeans(applicationContext);
        Person person = (Person)applicationContext.getBean("person");
        System.out.println(person);
        applicationContext.close();
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames=applicationContext.getBeanDefinitionNames();
        for(String name:definitionNames){
            System.out.println(name);
        }
    }
}
