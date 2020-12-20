package com.atguigu.config;

import com.atguigu.bean.Color;
import com.atguigu.bean.ColorFactoryBean;
import com.atguigu.bean.Person;
import com.atguigu.condition.LinuxCondition;
import com.atguigu.condition.MyImportBeanDefinitionRegistry;
import com.atguigu.condition.MyImportSelector;
import com.atguigu.condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 * @description:
 * @author: yangjiang
 * @create: 2020-09-05 19:59
 **/
@Configuration
@Conditional({WindowsCondition.class})
@Import({Color.class, MyImportSelector.class, MyImportBeanDefinitionRegistry.class})
public class MainConfig2 {

    /**
     * 给容器中增加组件的三种方式
     * 1、使用@Service等注解
     * 2、使用@Bean注解
     * 3、使用@Import注解
     *      3.1、@Import(Color.class)
     *      3.2、ImportSelectors
     *      3.3、ImportBeanDefinitionRegistrar
     * 4、使用spring提供的FactoryBean
     * */


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


    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }
}
