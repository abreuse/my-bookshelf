package com.breuse.alexis.mybookshelf.controller;

import com.breuse.alexis.mybookshelf.entity.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/user/{userId}")
public class BookController {

    @GetMapping(path = "/books")
    public List<Book> getAllBooksOfUser(@PathVariable("userId") long userId) {
        return new ArrayList<Book>();
    }
    
}
