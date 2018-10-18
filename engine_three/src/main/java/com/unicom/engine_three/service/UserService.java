package com.unicom.engine_three.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.unicom.engine_three.model.Test;
import com.unicom.engine_three.model.User;

public interface UserService {

	User getUserByName(String string);

	Map<String, Object> login(HttpServletRequest request);
	
	User getUserByNameAndPassword(User user);
}
