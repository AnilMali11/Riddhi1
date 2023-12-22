package com.configfilereader;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.core.config.Property;

public class ConfigProperty {

	Properties properties;
	
	String path ="C:\\Users\\Anil\\eclipse-workspace\\RiddhiProject1\\riddhi1\\config\\config.properties";
	
	public ConfigProperty()
	{
		
		properties = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(path);
			try {
				properties.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getURL()
	{
		String url = properties.getProperty("url");
		if(url!=null)
			return url;
		else
			throw new RuntimeException("url not specified in config file");
	}
	
	public static String fetchLocatorValue(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Anil\\eclipse-workspace\\RiddhiProject1\\riddhi1\\config\\Elements.properties");
		Properties properties = new Properties();
		properties.load(fis);
		return properties.get(key).toString();
		
	}
}
