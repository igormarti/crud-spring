package com.imr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imr.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
