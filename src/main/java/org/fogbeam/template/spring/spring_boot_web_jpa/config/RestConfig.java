package org.fogbeam.template.spring.spring_boot_web_jpa.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig 
{
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) 
	{
	   // Do any additional configuration here
	   return builder.build();
	}
}
