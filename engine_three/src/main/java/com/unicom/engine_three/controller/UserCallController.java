package com.unicom.engine_three.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.unicom.engine_three.model.UserCall;
import com.unicom.engine_three.service.UserCallService;

@Controller
@CrossOrigin
public class UserCallController {
	@Autowired
	UserCallService userCallService;
	
//	每月的平均通话时长
	@RequestMapping(value="/averageCallTime")
	@ResponseBody
	public double averageCallTime(){
		return userCallService.averageCallTime();
	}
	
//	每天的通话时长（K线图）
	@RequestMapping(value="/dayCallTime")
	@ResponseBody
	public List<UserCall> dayCallTime(){
		return userCallService.dayCallTime();
	}
	
//	使用用户数按时段展示柱状图
	@RequestMapping(value="/dayUseCondition")
	@ResponseBody
	public List<UserCall> dayUseCondition(String day){
		return userCallService.dayUseCondition(day);
	}
}
