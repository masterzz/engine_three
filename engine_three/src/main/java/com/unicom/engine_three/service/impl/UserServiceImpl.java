package com.unicom.engine_three.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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
	private UserMapper userMapper;
	
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
		System.out.println("username: " + username + ", password:" + password);
		System.out.println("data:" + request.getParameter("data"));
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

	@Override
	public Object modify(HttpServletRequest request) {
		String username =request.getParameter("username");
		String password =request.getParameter("password");
		String newPassword = request.getParameter("newPassword");
		User original = new User();
		original.setUsername(username);
		original.setPassword(password);
//		待修改的user
		User user = userMapper.getUserByNameAndPassword(original);
		if(user == null)
			return null;
		user.setPassword(newPassword);
		userMapper.updateUser(user);
		return user;
	}

	@Override
	public List<User> getUserAll() {
		// TODO Auto-generated method stub
		return userMapper.getUserAll();
	}

	@Override
	public Object updateUserInfo(HttpServletRequest request) {
		
		User user  = new User();
		
		userMapper.updateUser(user);
		return user;
	}
	
	@Override
	public Object deleteMoreUser(HttpServletRequest request) {
		
		String[] userids =  request.getParameter("userids").split(",");
		int[] user_id=new int[userids.length];
		for (int i = 0; i < userids.length; i++) {
			user_id[i]=Integer.parseInt(userids[i]);
		}
		userMapper.deleteMoreUser(user_id);
		return user_id;
	}
	
	@Override
	public void insert(HttpServletRequest request) {
		
		User user =  new User();
		
		System.out.println("hello"+request.getParameter("username"));
		user.setUsername(request.getParameter("username"));
		user.setSex(request.getParameter("sex"));
		user.setPhone(request.getParameter("phone"));
		user.setPassword(request.getParameter("password"));
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			user.setCreateTime(sdf.parse(request.getParameter("createtime")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		user.setAge(request.getParameter("age"));
		user.setAddress(request.getParameter("address"));

		userMapper.insert(user);
	}
}
