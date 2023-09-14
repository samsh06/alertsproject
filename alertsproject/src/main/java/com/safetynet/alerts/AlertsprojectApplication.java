package com.safetynet.alerts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlertsprojectApplication implements ApplicationRunner {

	private static final Logger logger = LogManager.getLogger(AlertsprojectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AlertsprojectApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) {
		logger.debug("LOG TEST - Alerts application is running...");
		logger.info("LOG TEST - Alerts application is running...");
		logger.error("LOG TEST - Alerts application is running...");
	}
}
