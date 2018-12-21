package com.breuse.alexis.mybookshelf.controller;

import com.breuse.alexis.mybookshelf.entity.Book;
import com.breuse.alexis.mybookshelf.entity.User;
import com.breuse.alexis.mybookshelf.repository.BookRepository;
import com.breuse.alexis.mybookshelf.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users/{userId}/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public Book addBookForUser(@PathVariable("userId") String userId,
                               @RequestBody Book book) {
        bookRepository.save(book);

        User user = userRepository.findById(userId).get();
        user.addBook(book);
        userRepository.save(user);

        return book;
    }

    @GetMapping
    public List<Book> getAllBooksOfUser(@PathVariable("userId") String userId) {
        return userRepository.findById(userId).get().getBooks();
    }
    
}
