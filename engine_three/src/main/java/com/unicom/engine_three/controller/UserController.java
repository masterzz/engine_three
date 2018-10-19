package com.unicom.engine_three.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.unicom.engine_three.service.UserService;

@Controller
@CrossOrigin
public class UserController {
	@Autowired
	UserService userService;
	
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
}
