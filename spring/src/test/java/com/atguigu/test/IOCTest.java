package com.atguigu.test;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: yangjiang
 * @create: 2020-09-05 20:11
 **/
public class IOCTest {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext aa = new AnnotationConfigApplicationContext(MainConfig2.class);
        printBeans(aa);
    }

    private void printBeans(AnnotationConfigApplicationContext aa) {
        String[] bb = aa.getBeanDefinitionNames();
        for (String s : bb) {
            System.out.println(s);
        }
    }

    @Test
    public void test02() {
        AnnotationConfigApplicationContext aa = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] bb = aa.getBeanDefinitionNames();
        System.out.println("IOC容器创建完成");
        Person person1 = (Person) aa.getBean("Person");
        Person person2 = (Person) aa.getBean("Person");
        System.out.println(person1 == person2);
        for (String s : bb) {
            System.out.println(s);
        }
    }
}
