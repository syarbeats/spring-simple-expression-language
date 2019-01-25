package com.learning.spring.spring_spring_expression_language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


public class LicenseConfigImpl implements ILicenseConfig{
	
	private String server;
	
	public LicenseConfigImpl(String server) {
		this.server = server;
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

}
