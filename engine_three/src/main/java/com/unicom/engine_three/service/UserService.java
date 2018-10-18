package com.unicom.engine_three.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.unicom.engine_three.model.Test;
import com.unicom.engine_three.model.User;

public interface UserService {

	User getUserByName(String string);

	User login(HttpServletRequest request);
	
	User getUserByNameAndPassword(User user);
}
