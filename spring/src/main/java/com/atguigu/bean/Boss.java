package com.atguigu.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: yangjiang
 * @create: 2020-12-28 14:27
 **/
@Component
public class Boss {
    private Car car;

    public Car getCar() {
        return car;
    }

    @Autowired
    public Boss(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }

//    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }
}
