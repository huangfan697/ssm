package com.huangfan.java.dao;

import com.huangfan.java.pojo.Books;

import java.util.List;

public interface BookMapper {

    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookByID(int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(int id);
    //查询全部的书
    List<Books> queryAllBooks();

}
