package com.atguigu.test;

import com.npu.tx.TxConfig;
import com.npu.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Tx {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);

    @Test
    public void test01(){
        UserService userService = applicationContext.getBean(UserService.class);
        userService.insertUser();
    }

}
