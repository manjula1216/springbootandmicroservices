package com.vlm.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vlm.Dto.UserRequest;
import com.vlm.Exception2.UserNotFoundException;
import com.vlm.entity.UserEntity;
import com.vlm.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
	public ResponseEntity<UserEntity> saveUser(@RequestBody @Valid UserRequest userRequest){
		return new ResponseEntity<>(userService.saveUser(userRequest),HttpStatus.CREATED);
	}
	
	@GetMapping("/getUser")
	public ResponseEntity<List<UserEntity>> getAllUsers(){
		return ResponseEntity.ok(userService.getAllUsers());
	}
	
	@GetMapping("/getUser/{id}")
	public ResponseEntity<UserEntity> getUser(@PathVariable int id) throws UserNotFoundException{
		return ResponseEntity.ok(userService.getUser(id));
	}

}
