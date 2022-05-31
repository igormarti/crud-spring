package com.imr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imr.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
