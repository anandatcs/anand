package com.poc.ms.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.poc.ms.model.User;
import com.poc.ms.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserResource {

	  @Autowired
	    private UserService userService;

	    @RequestMapping(value = "/user", method = RequestMethod.GET)
	    public List<User> listUser() {
	        return userService.findAll();
	    }
	
}
