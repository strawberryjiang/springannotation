package com.atguigu.config;

/**
 * @description:bean的生命周期
 * @author: yangjiang
 * @create: 2020-12-20 14:59
 **/


import com.atguigu.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * bean的创建---初始化---销毁的过程
 * 容器管理bean的生命周期
 *
 * 1、指定初始化和销毁方法：init-method和destroy-method
 * 2、通过让bean实现InitializingBean实现初始化、通过实现DisposableBean来实现销毁
 * 3、使用JSR250：@PostConstruct:在bean创建完成并且属性赋值完成；来执行初始化方法；
 *                @PreDestroy：在容器销毁bean之前通知我们进行清理工作
 * 4、BeanPostProcessor:bean的后置处理器：在bean初始化前后进行一些处理工作
 *          postProcessBeforeInitialization：在初始化方法之前调用
 *          postProcessAfterInitialization：在初始化方法调用之后工作
 * */
@Configuration
@ComponentScan("com.atguigu.bean")
public class MainConfigLifeCycle {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }



}
