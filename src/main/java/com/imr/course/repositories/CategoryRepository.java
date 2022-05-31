package com.imr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imr.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
