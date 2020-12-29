package com.atguigu.bean;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: yangjiang
 * @create: 2020-09-06 10:24
 **/
@Component
public class Car {
    private String name;

    public void init() {
        System.out.println("car init....");
    }

    public void destroy() {
        System.out.println("car destroy....");
    }



}
