package com.poc.ms.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.poc.ms.model.User;
import com.poc.ms.repo.UserRepository;
import com.poc.ms.service.UserService;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public void delete(Long id) {
		Optional<User> user =  userRepository.findById(id);
		userRepository.delete(user.get());
	}

	@Override
	public User update(User user) {
		return userRepository.save(user);
	}

	
}
