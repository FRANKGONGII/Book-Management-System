package com.example.demo.controller;

import com.example.demo.entity.books;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class Hello {
    @GetMapping("/hello")
    public String hello(){
        return "hello worlddddddddd";
    }

    @Autowired
    private BookService bookService;

    @GetMapping()
    public List<books> show(){
        return bookService.list();
    }


}
