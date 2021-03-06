package com.springbackend.service.impl;

import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.projection.ProjectionFactory;
import org.springframework.stereotype.Service;

import com.springbackend.domain.projection.UserProjection;
import com.springbackend.repository.UserRepository;
import com.springbackend.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	private UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Autowired
	private ProjectionFactory projectionFactory;

	@Override
	public Page<UserProjection> getAllUsers() {
		logger.info("get all user invoke");
		return new PageImpl<UserProjection>(userRepository.findAll().stream()
				.map(p -> projectionFactory.createProjection(UserProjection.class, p)).collect(Collectors.toList()));
	}

}
