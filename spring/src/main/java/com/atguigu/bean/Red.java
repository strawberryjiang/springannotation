package com.atguigu.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: yangjiang
 * @create: 2020-12-20 11:53
 **/
@Component
public class Red implements ApplicationContextAware , BeanNameAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("spring的ioc为"+applicationContext);
        this.applicationContext=applicationContext;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("当前bean的名字为"+name);
    }
}
