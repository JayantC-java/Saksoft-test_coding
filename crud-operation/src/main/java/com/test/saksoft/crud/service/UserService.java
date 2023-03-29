package com.test.saksoft.crud.service;

import java.util.List;

import com.test.saksoft.crud.model.User;

public interface UserService {
	
	User createUser(User user);
	
	User getUserById(Long id);
	
	List<User> getAllUsers();
	
	User updateUser(User user);
	
	void deleteUser(Long id);
	

}
