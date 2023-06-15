package com.test.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.test.demo.modal.User;

@Service
public class UserService {
	
	
	@Value("${endpoint.user.url}")
	private String userEndPointURL;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	public List<User>  getUsers(){
		
		User[] responseBody = restTemplate.getForObject(userEndPointURL, User[].class);
		return Arrays.asList(responseBody);
	}
	
	

}
