package com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: yangjiang
 * @create: 2020-09-05 19:59
 **/
@Configuration
@ComponentScan(value = "com.atguigu",excludeFilters = {
        @ComponentScan.Filter
})//指定扫描的包
public class MainConfig {

    //给容器中注入一个bean；类型为返回值类型，id默认是用方法名作为id
    @Bean("Person")
    public Person person() {
        return new Person("lisi", 20);
    }

}
