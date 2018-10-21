package com.unicom.engine_three.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.unicom.engine_three.model.UserInvoice;
import com.unicom.engine_three.service.VoiceAnalyzeService;

@Controller
@CrossOrigin
public class VoiceAnalyzeContorller {
	@Autowired
	private VoiceAnalyzeService voiceAnalyzeService;
	
	//查询所有详单
	@RequestMapping(value="/getAllInvoice")
	@ResponseBody
	public List<UserInvoice> getAllInvoice(){
		List<UserInvoice> invoices = new ArrayList<UserInvoice>();
		invoices=voiceAnalyzeService.queryAll();
		return invoices;
	}
	//根据经纬度统计拨打分钟数和用户数
	@RequestMapping(value="/queryStatistics")
	@ResponseBody
	public List<Map<Object, Object>> queryUserHeatMap(){
		List<Map<Object, Object>> userHeatMap=voiceAnalyzeService.queryUserHeatMap();
		return userHeatMap;
	}
	
	@RequestMapping(value="/queryLocation")
	@ResponseBody
	public List<Map<String, String>> queryLocation(){
		List<Map<String, String>> userLocation=voiceAnalyzeService.queryLocation();
		return userLocation;
	}
}
