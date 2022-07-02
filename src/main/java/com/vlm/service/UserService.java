package com.vlm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vlm.Dto.UserRequest;
import com.vlm.Exception2.UserNotFoundException;
import com.vlm.entity.UserEntity;
import com.vlm.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserEntity saveUser(UserRequest userRequest) {
		UserEntity userEntity = UserEntity.build(0, userRequest.getName(), userRequest.getAge(), userRequest.getEmail(),
				userRequest.getMobileno(), userRequest.getGender(), userRequest.getCity());
		return userRepository.save(userEntity);
	}

	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();

	}

	public UserEntity getUser(int id) throws UserNotFoundException {
		UserEntity userEntity = userRepository.findById(id).get();
		
		if(userEntity!=null) {
			return userEntity;
		}
	
	else {
		throw new UserNotFoundException("user not found");
	}

	}
}
