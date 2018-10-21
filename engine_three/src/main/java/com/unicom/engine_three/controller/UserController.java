package com.unicom.engine_three.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.unicom.engine_three.model.User;
import com.unicom.engine_three.service.UserService;

@Controller
@CrossOrigin
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login")
	@ResponseBody
	public Map<String,Object> test1(HttpServletRequest request){
//		根据用户名找到user，并将用户的用户名信息、角色信息添加到session中
		return userService.login(request);
	}
	
	@RequestMapping(value="/testlogin")
	@ResponseBody
	public Object testlogin(HttpServletRequest request){
//		根据用户名找到user，并将用户的用户名信息、角色信息添加到session中
		return request.getSession().getAttribute("username");
	}
	
//	修改密码
	@RequestMapping(value="/modify")
	@ResponseBody
	public Object modify(HttpServletRequest request){
//		根据用户名找到user，并将用户的用户名信息、角色信息添加到session中
		return userService.modify(request);
	}
	

	@RequestMapping(value="/getUserAll")
	@ResponseBody
	public List<User> getUsers(){
		return userService.getUserAll();
	}
	
	@RequestMapping(value="/modifyUser")
	@ResponseBody
	public Object modifyUser(HttpServletRequest request){
		return userService.updateUserInfo(request);
	}
	
	@RequestMapping(value="/insert")
	public void  insert(HttpServletRequest request){
		userService.insert(request);
	}
	
	
	@RequestMapping(value="/deletMul")
	public Object  deletMul(HttpServletRequest request){
		return userService.deleteMoreUser(request);
	}
	
}
