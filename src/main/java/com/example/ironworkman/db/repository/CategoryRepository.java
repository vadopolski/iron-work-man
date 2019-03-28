package com.example.ironworkman.db.repository;

import com.example.ironworkman.db.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}