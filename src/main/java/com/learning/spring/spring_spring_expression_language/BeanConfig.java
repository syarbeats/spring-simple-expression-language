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
	
	@Value("#{environment['app.server']}")
	private String server;
	
	@Value("#{environment['app.applicationName']}")
	private String applicationName; 
	
	@Value("#{environment['app.port']}")
	private String port;
	
	@Value("#{environment['app.licenseKeyFile']}")
	private String licenseKeyFile;
	
	@Value("${app.username}")
	private String username;
	
	@Bean
	public LicenseConfigImpl licenseConfig() {
		return new LicenseConfigImpl(this.server, this.applicationName, this.port, this.licenseKeyFile, this.username);
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getLicenseKeyFile() {
		return licenseKeyFile;
	}

	public void setLicenseKeyFile(String licenseKeyFile) {
		this.licenseKeyFile = licenseKeyFile;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
