package com.poc.ms.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;*/
import org.springframework.stereotype.Service;

import com.poc.ms.model.User;
import com.poc.ms.repo.UserRepository;
import com.poc.ms.service.UserService;

@Service(value = "userService")
public class UserServiceImpl implements /* UserDetailsService, */UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	/*
	 * @Override public UserDetails loadUserByUsername(String username) throws
	 * UsernameNotFoundException { User user =
	 * userRepository.findByUsername(username); if (user == null) { throw new
	 * UsernameNotFoundException("Invalid username or password."); } return new
	 * org.springframework.security.core.userdetails.User(String.valueOf(user.getId(
	 * )), user.getPassword(), getAuthority());
	 * 
	 * }
	 * 
	 * private List<SimpleGrantedAuthority> getAuthority() { return
	 * Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN")); }
	 */
}
