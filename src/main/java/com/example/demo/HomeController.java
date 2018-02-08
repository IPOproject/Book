package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    BookRepository bookRepository;

    @RequestMapping("/")
    public String listBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "list";
    }

    @GetMapping("/add")
    public String courseForm(Model model) {
        Book book = new Book();
        model.addAttribute("book", new Book());
        return "bookform";
    }

    @PostMapping("/process")
    public String processForm(@Valid Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "bookform";

        }
        bookRepository.save(book);
        return "redirect:/";

    }
    }

