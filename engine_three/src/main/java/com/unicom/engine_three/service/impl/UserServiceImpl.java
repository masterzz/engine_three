package com.unicom.engine_three.service.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unicom.engine_three.mapper.UserMapper;
import com.unicom.engine_three.model.User;
import com.unicom.engine_three.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;
	
	@Override
	public User getUserByName(String username) {
		return userMapper.getUserByName(username);
	}
	
	@Override
	public User getUserByNameAndPassword(User user) {
		return userMapper.getUserByNameAndPassword(user);
	}

	@Override
	public User login(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		User user0 = new User();
		user0.setUsername(username);
		user0.setPassword(password);
//		获取用户
		User user = getUserByNameAndPassword(user0);
		if(user != null) {
			session.setAttribute("username", user.getUsername());
			session.setAttribute("role", "normal");
		}
		return user;
	}
	
	
}
