package com.unicom.engine_three.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.unicom.engine_three.model.UserInvoice;

@Mapper
public interface VoiceAnalyzeMapper {
	public List<UserInvoice> queryAll();
	public List<Map<Object, Object>> queryUserHeatMap();
	public List<Map<String, String>> queryLocation();
}
