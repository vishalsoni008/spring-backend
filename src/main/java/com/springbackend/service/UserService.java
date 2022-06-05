package com.springbackend.service;

import org.springframework.data.domain.Page;

import com.springbackend.domain.projection.UserProjection;


public interface UserService {
	public Page<UserProjection> getAllUsers();

}
