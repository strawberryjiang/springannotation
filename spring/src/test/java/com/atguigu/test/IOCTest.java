package com.atguigu.test;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * @description:
 * @author: yangjiang
 * @create: 2020-09-05 20:11
 **/
public class IOCTest {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext aa = new AnnotationConfigApplicationContext(MainConfig2.class);
//        printBeans(aa);

        //工厂bean获取的是调用getObject创建的对象
        Object bean1 = aa.getBean("colorFactoryBean");
        //加上&前缀，获取的是bean工厂对象
        Object bean2 = aa.getBean("&colorFactoryBean");
        System.out.println(bean1.getClass());

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


    @Test
    public void test03() {
        //-Dos.name=linux
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] names = applicationContext.getBeanNamesForType(Person.class);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String osName = environment.getProperty("os.name");
        System.out.println(osName);
        Map<String, Person> personMap = applicationContext.getBeansOfType(Person.class);
        System.out.println(personMap);



    }
}
