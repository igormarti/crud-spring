package com.imr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imr.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
