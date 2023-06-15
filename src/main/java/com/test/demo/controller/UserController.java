package com.test.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.modal.User;
import com.test.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private  UserService userService;
	
	
	
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUserDetails(){
		
		List<User> result = userService.getUsers();
		
		return new ResponseEntity<List<User>>(result, HttpStatus.OK);
	}
	
	
	

}
