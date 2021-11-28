package com.github.kgrama.openbanking.support;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class OpenBankingResourceLocatorTestSupport {
	
	@Bean
	@ConditionalOnMissingBean
	public ObjectMapper mapper() {
		return new ObjectMapper();
	}
}
