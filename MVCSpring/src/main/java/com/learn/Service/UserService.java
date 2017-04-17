package com.learn.Service;

import java.util.List;

import com.learn.configuration.User;

public interface UserService {

	public void createUser(User user);
	
	public List<User> showUSers();
	
	public User getUser();
}
