package com.springbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbackend.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	private UserService userService;
	
	@Autowired
	private UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/all")
	public ResponseEntity getAllUsers(Pageable pageable) {
		return ResponseEntity.ok(userService.getAllUsers());
	}

}
