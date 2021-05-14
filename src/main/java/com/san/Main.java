package com.san;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.san.service.EmailService;

@SpringBootApplication
public class Main {

	static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Main.class, args);
		ctx.getBean(EmailService.class).sendSimpleMessage("anilagrawal038@gmail.com", "sample mail from spring-boot-mail-utility", "sample mail body from spring-boot-mail-utility");
		logger.info("Application started.");
	}

}
