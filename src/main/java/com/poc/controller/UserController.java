package com.poc.controller;

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

import com.poc.entity.User;
import com.poc.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
@Api(value = "User Service")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/save")
	@ApiOperation(value = "save user api")
	public String saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}

	@ApiOperation(value = "search user api")
	@GetMapping("/searchUser/{userId}")
	public User getUser(@PathVariable int userId) {
		return service.getUser(userId);
	}

	@DeleteMapping("/deleteUser/{userId}")
	public List<User> deleteUser(@PathVariable int userId) {
		return service.removeUser(userId);
	}
	
	@ApiOperation(value = "get all users api")
	@GetMapping("/allUsers")
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}
	
	@ApiOperation(value = "update user api")
	@PutMapping("/updateUser/{userId}")
	public Integer updateUser(@PathVariable Integer userId, @RequestBody User user) {
		return service.updateUser(userId, user);
	}
	
}
