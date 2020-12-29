package com.atguigu.dao;

import com.atguigu.bean.Boss;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {

    private Boss label ;


    public BookDao(Boss label) {
        this.label =label ;
    }


    @Override
    public String toString() {
        return "BookDao [label=" + label + "]";
    }

}
