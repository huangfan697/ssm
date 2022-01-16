package com.huangfan.java.controller;


import com.huangfan.java.pojo.Books;
import com.huangfan.java.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("bookServiceImp")
    private BookService bookService;

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    //查询全部的书籍
    @RequestMapping("/querryAll")
    public String querryAll(Model model){
        List<Books> books = bookService.queryAllBooks();
        model.addAttribute("books",books);
        return "allbook";
    }


}
