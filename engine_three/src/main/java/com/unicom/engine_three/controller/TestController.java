package com.unicom.engine_three.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.unicom.engine_three.model.Test;
import com.unicom.engine_three.service.TestService;

@Controller
public class TestController {
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/hello")
	@ResponseBody
	public String hello(){
		return "hello1";
	}
	
	@RequestMapping(value="/test")
	public String index(){
		System.out.println("index");
		System.out.println(testService.findById(1));
		return "index";
	}
	
	@RequestMapping(value="/test1")
	public String test1(){
		System.out.println("test1");
		return "test";
	}
	
	@RequestMapping(value="/pageHelper")
	@ResponseBody
	public List<Test> pageHelper(){
		System.out.println("pageHelper");
		List<Test> list = testService.list();
		return list;
	}
}
