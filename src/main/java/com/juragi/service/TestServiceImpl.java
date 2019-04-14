package com.juragi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juragi.mapper.TestMapper;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	TestMapper testMapper;

	@Override
	public String test() {
		return "test::" + testMapper.getCurrent();
	}

}
