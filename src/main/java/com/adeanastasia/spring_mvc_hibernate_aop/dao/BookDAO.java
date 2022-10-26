package com.adeanastasia.spring_mvc_hibernate_aop.dao;

import com.adeanastasia.spring_mvc_hibernate_aop.entity.Book;

import java.util.List;

public interface BookDAO {
    List<Book> getAllBooks();
}
