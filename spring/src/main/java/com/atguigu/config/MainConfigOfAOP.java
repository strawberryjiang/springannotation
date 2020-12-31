package com.atguigu.config;

import com.atguigu.aop.LogAspect;
import com.atguigu.aop.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@EnableAspectJAutoProxy
@Configuration
public class MainConfigOfAOP {

    //业务逻辑类加入容器中
    @Bean
    public MathCalculator calculator() {
        return new MathCalculator();
    }


    //切面类加入容器中
    @Bean
    public LogAspect logAspect() {
        return new LogAspect();
    }

}
