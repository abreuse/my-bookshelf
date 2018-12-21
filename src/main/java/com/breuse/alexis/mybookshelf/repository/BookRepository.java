package com.breuse.alexis.mybookshelf.repository;

import com.breuse.alexis.mybookshelf.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {
}
