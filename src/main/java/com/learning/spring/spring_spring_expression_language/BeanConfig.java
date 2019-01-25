package com.learning.spring.spring_spring_expression_language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource({
	"classpath:config.properties"
})
public class BeanConfig {

	@Autowired
	Environment environment;
	
	@Value("#{environment['server']}")
	private String server;
	
	@Bean
	public LicenseConfigImpl licenseConfig() {
		return new LicenseConfigImpl(this.server);
	}
}
