package com.example.vault.vaultexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {
	static final Logger logger = LoggerFactory.getLogger(Service.class);
	@Autowired
	AppConfig appConfig;
	
	@GetMapping("/")
	public String getName() {
		logger.info("Reading from consul server");
	    logger.info("value of testkey is : "+appConfig.getValues());
	    return "success";
	}
}
