package com.springbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbackend.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
