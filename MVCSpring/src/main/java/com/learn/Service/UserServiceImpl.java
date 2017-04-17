package com.learn.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.learn.configuration.User;

@Component
public class UserServiceImpl implements UserService {

	List<User> userList = new ArrayList<User>();
	public void createUser(User user) {
		User newUser = new User();
		System.out.println("In UserServiceImpl:"+user.getAge());
		newUser.setAge(user.getAge());
		newUser.setUserName(user.getUserName());
		userList.add(newUser);
		//Adding more USers;
		
		User user2 = new User();
		user2.setAge(20);
		user2.setUserName("Neha");
		userList.add(user2);
	}

	public List<User> showUSers() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
