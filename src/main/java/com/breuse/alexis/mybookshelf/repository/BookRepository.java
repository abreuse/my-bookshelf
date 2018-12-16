package com.breuse.alexis.mybookshelf.repository;

import com.breuse.alexis.mybookshelf.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
