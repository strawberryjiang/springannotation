package com.atguigu.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @description:
 * @author: yangjiang
 * @create: 2020-12-23 22:28
 **/
@Component
public class Dog implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public Dog() {
        System.out.println("Dog ...constructor");
    }

    //对象创建并且赋值之后调用
    @PostConstruct
    public void init() {
        System.out.println("Dog....PostConstruct。。。init");
    }


    @PreDestroy
    public void destroy() {
        System.out.println("Dog....PreDestroy。。。destroy");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;

    }
}
