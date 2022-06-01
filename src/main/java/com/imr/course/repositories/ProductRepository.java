package com.imr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imr.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
