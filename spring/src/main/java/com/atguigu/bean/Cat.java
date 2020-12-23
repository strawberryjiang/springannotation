package com.atguigu.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: yangjiang
 * @create: 2020-12-23 18:14
 **/
@Component
public class Cat implements InitializingBean, DisposableBean {
    public Cat() {
        System.out.println("Cat....constructor");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat.....afterPropertiesSet");
    }

    public void destroy() throws Exception {
        System.out.println("Cat......destroy");
    }
}
