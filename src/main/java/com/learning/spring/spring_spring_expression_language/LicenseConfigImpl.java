package com.learning.spring.spring_spring_expression_language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


public class LicenseConfigImpl implements ILicenseConfig{
	
	private String server;
	private String applicationName; 
	private String port;
	private String licenseKeyFile;
	private String username;
	
	public LicenseConfigImpl(String server, String applicationName, String port, String licenseKeyFile, String username) {
		this.server = server;
		this.applicationName = applicationName;
		this.port = port;
		this.licenseKeyFile = licenseKeyFile;
		this.username = username;
	}
	
	@Override
	public boolean verified() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getLicenseKey() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
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
