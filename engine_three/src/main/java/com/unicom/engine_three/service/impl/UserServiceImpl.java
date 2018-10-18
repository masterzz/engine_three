package com.unicom.engine_three.service.impl;

import java.util.HashMap;
import java.util.Map;

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
	public Map<String, Object> login(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String,Object>();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		User user0 = new User();
		user0.setUsername(username);
		user0.setPassword(password);
//		获取用户
		User user = getUserByNameAndPassword(user0);
		String status = "no";
		String type = "null";
		String currentAuthority = "null";
		System.out.println("user service");
//		用户存在时放入session中
		if(user != null) {
			session.setAttribute("username", user.getUsername());
			session.setAttribute("role", "normal");
			status = "ok";
			type = "account";
			currentAuthority = "admin";
		}
//		构造返回map
		map.put("status", status);
		map.put("type", type);
		map.put("currentAuthority", currentAuthority);
		return map;
	}
	
	
}
