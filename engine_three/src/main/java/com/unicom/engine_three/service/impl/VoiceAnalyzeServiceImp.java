package com.unicom.engine_three.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unicom.engine_three.mapper.VoiceAnalyzeMapper;
import com.unicom.engine_three.model.UserInvoice;
import com.unicom.engine_three.service.VoiceAnalyzeService;

@Service
public class VoiceAnalyzeServiceImp implements VoiceAnalyzeService{
	@Autowired
	private VoiceAnalyzeMapper voiceAnalyzeMapper;
	@Override
	public List<UserInvoice> queryAll() {
		return voiceAnalyzeMapper.queryAll();
	}
	@Override
	public List<Map<Object, Object>> queryUserHeatMap() {
		return voiceAnalyzeMapper.queryUserHeatMap();
	}
	@Override
	public List<Map<String, String>> queryLocation() {
		return voiceAnalyzeMapper.queryLocation();
	}
}
