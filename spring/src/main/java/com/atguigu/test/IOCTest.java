package com.atguigu.test;

import com.atguigu.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: yangjiang
 * @create: 2020-12-18 22:23
 **/
public class IOCTest {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext aa = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = aa.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

    }

}
