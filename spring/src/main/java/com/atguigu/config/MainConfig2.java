package com.atguigu.config;

import com.atguigu.bean.Color;
import com.atguigu.bean.Person;
import org.springframework.context.annotation.*;

/**
 * @description:
 * @author: yangjiang
 * @create: 2020-09-05 19:59
 **/
@Configuration
@Import(Color.class)
public class MainConfig2 {


    //SINGLETON
    @Lazy
    @Scope("singleton")
    @Bean("Person")
    public Person person() {
        System.out.println("chaungjianduxianf");
        return new Person("张三", 25);
    }

}
