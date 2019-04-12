package com.juragi.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.juragi.m.TestMapper;

//@MapperScan(basePackages = "com.example.m")
@Controller
public class HomeController {
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	TestMapper testMapper;
	
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
		
		model.addAttribute("test","about");
		model.addAttribute("now", now);
		return "about";
	}
}
