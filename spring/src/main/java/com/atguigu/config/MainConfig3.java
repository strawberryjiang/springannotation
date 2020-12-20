package com.atguigu.config;

import com.atguigu.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: yangjiang
 * @create: 2020-09-05 19:59
 **/
@Configuration
public class MainConfig3 {


    @Bean("Car")
    public Car car() {
        return new Car();
    }

}
