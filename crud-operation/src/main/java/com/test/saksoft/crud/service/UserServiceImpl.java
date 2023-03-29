package com.test.saksoft.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.saksoft.crud.model.User;
import com.test.saksoft.crud.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;

	@Override
	public User createUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public User getUserById(Long id) {
		Optional<User> optionalUser = userRepo.findById(id);
		return optionalUser.get();
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public User updateUser(User user) {
		User existingUser = userRepo.findById(user.getId()).get();
		existingUser.setFirst_name(user.getFirst_name());
		existingUser.setLast_name(user.getLast_name());
		existingUser.setEmail(user.getEmail());
		existingUser.setAge(user.getAge());
		return updateUser(user);
	}

	@Override
	public void deleteUser(Long id) {
		userRepo.deleteById(id);
	}

}
