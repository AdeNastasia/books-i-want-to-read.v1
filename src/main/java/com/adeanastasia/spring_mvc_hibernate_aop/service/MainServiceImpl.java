package com.adeanastasia.spring_mvc_hibernate_aop.service;

import com.adeanastasia.spring_mvc_hibernate_aop.dao.BookDAO;
import com.adeanastasia.spring_mvc_hibernate_aop.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {
    @Autowired
    private BookDAO bookDAO;

    @Override
    @Transactional
    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }
}
