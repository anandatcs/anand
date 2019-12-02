package com.poc.ms.service;

import java.util.List;

import com.poc.ms.model.User;


public interface UserService {

	List<User> findAll();

	User save(User user);

	void delete(Long id);

	User update(User user);

}
