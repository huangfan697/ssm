package com.huangfan.java;


import com.huangfan.java.pojo.Books;
import com.huangfan.java.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestExecutionListeners;

import java.util.List;

public class Mytest {

    @Test
    public void test1(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImp = (BookService) classPathXmlApplicationContext.getBean("bookServiceImp");
        List<Books> books = bookServiceImp.queryAllBooks();
        System.out.println(books);
    }

}
