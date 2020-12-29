package com.atguigu.service;


import com.atguigu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {
	
	@Autowired(required = false)
	private BookDao bookDao0;
	
	public void print(){
		System.out.println(bookDao0);
	}

	@Override
	public String toString() {
		return "BookService [bookDao=" + bookDao0+ "]";
	}
	
	
	
	

}
