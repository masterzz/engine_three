package com.unicom.engine_three.service;

import java.util.List;

import com.unicom.engine_three.model.Test;

public interface TestService {
	public Test findById(int id);

	public List<Test> list();
}
