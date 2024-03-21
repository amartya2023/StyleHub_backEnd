package com.StyleHub.service;

import com.StyleHub.exception.UserException;
import com.StyleHub.model.User;

public interface UserService {

	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
}
