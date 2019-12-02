package com.poc.ms.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.ms.model.User;
import com.poc.ms.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserResource {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/user")
	public List<User> listUser() {
		return userService.findAll();
	}

	@PostMapping(value = "/user") 
	public User create(@RequestBody User user) { 
		if(user.getPassword()==null) {
			user.setPassword("admin");
		}
		return userService.save(user); 
	}
	
	@PutMapping(value = "/user")
	public User update(@RequestBody User user) { 
		if(user.getPassword()==null) {
			user.setPassword("admin");
		}
		return userService.update(user); 
	}

	@DeleteMapping(value = "/user/{id}") 
	public User delete(@PathVariable(value = "id") Long id) { 
		userService.delete(id);
		return new User(); 
	}
	

	

}
