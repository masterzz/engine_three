package com.unicom.engine_three;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.unicom.engine_three.controller.TestController;

//指定当前要测试的类
@SpringBootTest(classes=TestController.class)
////指定实现测试的类
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration

public class EngineThreeApplicationTests {
	@Autowired
	TestController testController;

	@Test
	public void contextLoads() {
//		String hello = testController.hello();
		System.out.println("hello");
	}

}
