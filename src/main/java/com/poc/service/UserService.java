package com.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.entity.User;
import com.poc.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;

	public String saveUser(User user) {
		User u = repository.save(user);
		return "User saved with id " + u.getUserId();
	}

	public User getUser(int userId) {
		return repository.findOne(userId);
	}

	public List<User> removeUser(int userId) {
		repository.delete(userId);
		return repository.findAll();
	}
	
	public List<User> getAllUsers() {
		return repository.findAll();
	}
	
	public Integer updateUser(Integer id, User userEntity) {
		// TODO Auto-generated method stub
		User user = getUser(id);
		if(user!=null)
		{
			userEntity.setUserId(id);
			User u = repository.save(userEntity);
			return u.getUserId();
		}		
		return null;
	}

}
