package com.mintApp.Backend.repository;


import com.mintApp.Backend.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDAO extends CrudRepository<Category, Integer> {
}
