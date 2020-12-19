package com.atguigu.config;

import com.atguigu.bean.Color;
import com.atguigu.bean.Person;
import com.atguigu.condition.LinuxCondition;
import com.atguigu.condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 * @description:
 * @author: yangjiang
 * @create: 2020-09-05 19:59
 **/
@Configuration
@Conditional({LinuxCondition.class})
@Import(Color.class)
public class MainConfig2 {

    @Lazy
    @Scope("prototype")
    @Bean("Person")
    public Person person() {
        return new Person("张三", 25);
    }


    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person01() {
        return new Person("Bill Gates", 62);
    }


    @Conditional({LinuxCondition.class})
    @Bean("linux")
    public Person person02() {
        return new Person("linux", 48);
    }
}
