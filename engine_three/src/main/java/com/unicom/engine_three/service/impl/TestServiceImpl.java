package com.unicom.engine_three.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.unicom.engine_three.mapper.TestMapper;
import com.unicom.engine_three.model.Test;
import com.unicom.engine_three.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestMapper testMapper;

	@Override
	public Test findById(int id) {
		return testMapper.selectById(id);
	}

	@Override
	public List<Test> list() {
		PageHelper.startPage(2, 1);
		List<Test> items = testMapper.list();
		System.out.println("----------------");
		System.out.println(items);
		System.out.println("----------------");
		System.out.println("before page helper: " + items.size());
		PageInfo<Test> pageInfo = new PageInfo<>(items);
		System.out.println(pageInfo);
		System.out.println("after page helper: " + items.size());
		return items;
	}
}
