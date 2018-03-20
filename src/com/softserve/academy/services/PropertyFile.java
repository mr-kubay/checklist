package com.softserve.academy.services;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	private static Properties property;
	
	static {
		property = new Properties();
		try {
			FileInputStream fis = new FileInputStream("resources/SQL_queries.properties");
			property.load(fis);
		} catch (IOException e) {
			throw new RuntimeException("failed loading file",e);
		}
		
	}
	
	public static String get(String key) {
		return property.containsKey(key) ? property.getProperty(key) : "";
	}
}
