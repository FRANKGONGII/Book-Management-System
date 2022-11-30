package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.books;
import com.example.demo.mapper.BookMapper;
import com.example.demo.service.BookService;
import org.springframework.stereotype.Service;



@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, books> implements BookService {

}
