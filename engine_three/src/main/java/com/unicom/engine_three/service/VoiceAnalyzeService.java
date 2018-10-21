package com.unicom.engine_three.service;

import java.util.List;
import java.util.Map;

import com.unicom.engine_three.model.UserInvoice;

public interface VoiceAnalyzeService {
	public List<UserInvoice> queryAll();
	public List<Map<Object, Object>> queryUserHeatMap();
	public List<Map<String, String>> queryLocation();
}
