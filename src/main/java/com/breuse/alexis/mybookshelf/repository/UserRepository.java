package com.breuse.alexis.mybookshelf.repository;

import com.breuse.alexis.mybookshelf.entity.Book;
import com.breuse.alexis.mybookshelf.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    public List<Book> findAllBooksById(Long id);
}
