package com.juragi.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.juragi.m.TestMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	TestMapper testMapper;

	@Test
	public void contextLoads() {
		System.out.println("junit test: " + testMapper.getCurrent());
		System.out.println("junit test: " + testMapper.getBoardList());
	}

}
