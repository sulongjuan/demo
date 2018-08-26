package com.yc.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.yc.email.EmailService;


@Component
public class ScheduledService {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private EmailService emailService;
	
	@Scheduled(cron = "0/5 * * * * *")
	public void scheduled(){
		logger.info("=====>>>>>使用cron  {}",System.currentTimeMillis());
	}
	@Scheduled(fixedRate = 5000)
	public void scheduled1() {
		logger.info("=====>>>>>使用fixedRate{}", System.currentTimeMillis());
	}
	@Scheduled(fixedDelay = 5000)
	public void scheduled2() {
		logger.info("=====>>>>>fixedDelay{}",System.currentTimeMillis());
	}
	
	@Scheduled(cron = "0 0/1 * * * *")
	public void sendSimpleEmail() throws Exception{  //sulongjuanbella@sina.com
		emailService.sendSimpleEmail("755973513@qq.com", "this is simple mail", "Hello!!!");
	}
}
