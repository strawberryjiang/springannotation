package com.atguigu.test;

import com.atguigu.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: yangjiang
 * @create: 2020-09-05 19:51
 **/
public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext aa = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = aa.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
