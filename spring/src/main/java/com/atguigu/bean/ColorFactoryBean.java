package com.atguigu.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @description:创建一个spring定义的FactoryBean
 * @author: yangjiang
 * @create: 2020-12-20 11:59
 **/
public class ColorFactoryBean implements FactoryBean<Color>
{
    @Override
    public Color getObject() throws Exception {
        System.out.println("ColorFactoryBean...");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
