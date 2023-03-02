package com.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Config {
	Properties p = new Properties();
	public Config() throws Throwable {
		File f = new File(System.getProperty("user.dir") + "\\Configuration_Folder\\Config.properties");
		FileInputStream fis = new FileInputStream(f);
		p.load(fis);
		}
	public String getUrl() {
		String property = p.getProperty("url");
		return property;
	}
	public String getUser() {
		String property1 = p.getProperty("username");
		return property1;
	}
	public String getPass() {
		String property2 = p.getProperty("password");
		return property2;
	}
}