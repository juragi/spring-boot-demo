package com.juragi.controller;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.juragi.mapper.TestMapper;
import com.juragi.service.TestService;

@Controller
public class HomeController {
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	TestMapper testMapper;
	
	@Autowired
	TestService testService;
	
	@GetMapping("/")
	public String index(Model model) {
		String now = testMapper.getCurrent();
		log.info("now: {}", now);
		
		model.addAttribute("test","home");
		model.addAttribute("now", now);
		return "index";
	}
	
	@GetMapping("/about")
	public String about(Model model) {
		String now = testMapper.getCurrent();
		log.info("now: {}", now);
		log.info("test: {}", testService.test());
		
		model.addAttribute("test","about");
		model.addAttribute("now", now);
		return "about";
	}
	
	@RequestMapping("/test")
	@ResponseBody
	public List<HashMap<String, Object>> test(){
		log.info("test: {}", testService.test());
		return testMapper.getBoardList();
	}
}
