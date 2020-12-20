package com.atguigu.config;

/**
 * @description:bean的生命周期
 * @author: yangjiang
 * @create: 2020-12-20 14:59
 **/


import com.atguigu.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * bean的创建---初始化---销毁的过程
 * 容器管理bean的生命周期
 *
 * 1、指定初始化和销毁方法：init-method和destroy-method
 * */
@Configuration
public class MainConfigLifeCycle {


    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }
}
