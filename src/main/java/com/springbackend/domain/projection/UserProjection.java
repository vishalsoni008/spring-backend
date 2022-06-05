package com.springbackend.domain.projection;

import org.springframework.data.rest.core.config.Projection;

import com.springbackend.domain.User;

@Projection(types = {User.class})
public interface UserProjection {
	Long getId();
	
	String getName();
	
	String getEmail();

}
