package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.entity.User;
@Service
public interface UserService {
	
	public User register(User user);

	public List<User> usersList();

}
