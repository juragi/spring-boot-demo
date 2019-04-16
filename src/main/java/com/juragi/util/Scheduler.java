package com.juragi.util;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {
	private static final Logger log = LoggerFactory.getLogger(Scheduler.class);
	
	//@Scheduled(cron = "0 0/1 * * * ?")
	public void test() {
		Date date = new Date();
		log.info("schedule test - {}", date);
	}
}
