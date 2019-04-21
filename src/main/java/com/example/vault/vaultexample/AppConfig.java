package com.example.vault.vaultexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class AppConfig {
	
	@Value("${testkey}")
    private String values;

	public String getValues() {
		return values;
	}

	public void setValues(String values) {
		this.values = values;
	}
		

}
