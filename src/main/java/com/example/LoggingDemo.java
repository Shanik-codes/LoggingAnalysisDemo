package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.json.JSONObject;

public class LoggingDemo {
	private static final Logger logger = LoggerFactory.getLogger(LoggingDemo.class);
	
	public static void main(String[] args) {
		JSONObject logEntry = new JSONObject();
		logEntry.put("userID", "12345");
		logEntry.put("action", "login");
		logEntry.put("status", "success");
		
		logger.info(logEntry.toString());
	}

}
