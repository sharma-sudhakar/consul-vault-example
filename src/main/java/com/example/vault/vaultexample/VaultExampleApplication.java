package com.example.vault.vaultexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableConfigurationProperties(MyConfiguration.class)
public class VaultExampleApplication implements CommandLineRunner {
	
	private final MyConfiguration configuration;
	
	public VaultExampleApplication(MyConfiguration configuration) {
        this.configuration = configuration;
    }

	public static void main(String[] args) {
		SpringApplication.run(VaultExampleApplication.class, args);
	}
	
	@Override
    public void run(String... args) {

        Logger logger = LoggerFactory.getLogger(VaultExampleApplication.class);

        logger.info("----------------------------------------");
        logger.info("Configuration properties");
        logger.info("        example.username is {}", configuration.getUsername());
        logger.info("        example.password is {}", configuration.getPassword());
        logger.info("----------------------------------------");
        
    }

}
