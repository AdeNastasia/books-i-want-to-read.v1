package com.adeanastasia.spring_mvc_hibernate_aop.controller;

import com.adeanastasia.spring_mvc_hibernate_aop.dao.BookDAO;
import com.adeanastasia.spring_mvc_hibernate_aop.entity.Book;
import com.adeanastasia.spring_mvc_hibernate_aop.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private MainService mainService;

    @GetMapping("/show")
    public String showAllBooks(Model model) {
        List<Book> allBooks = mainService.getAllBooks();
        model.addAttribute("allBooks", allBooks);
        return "all-books";
    }
}
