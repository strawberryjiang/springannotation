package com.atguigu.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @description:给对象的属性赋值
 * @author: yangjiang
 * @create: 2020-09-05 19:46
 **/

public class Person {
    /**
     * @Value的用法
     *  1、基本数值
     *  2、#{} SpEl表达式
     *  3、${} 取配置文件（运行环境中变量的值）
     * */

    @Value("张三")
    private String name;
    @Value("#{20}")
    private int age;
    @Value("${person.nickName}")
    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
