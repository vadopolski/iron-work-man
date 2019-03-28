package com.example.ironworkman.db.repository;

import com.example.ironworkman.db.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
