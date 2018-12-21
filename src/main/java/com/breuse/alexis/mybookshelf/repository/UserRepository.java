package com.breuse.alexis.mybookshelf.repository;

import com.breuse.alexis.mybookshelf.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
