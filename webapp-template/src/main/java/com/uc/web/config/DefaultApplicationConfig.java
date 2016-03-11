package com.uc.web.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class DefaultApplicationConfig implements ApplicationConfig {
	

	private Properties properties;
	
	@Override
	public Properties getProperties(){
		synchronized (getClass()) {
			if(properties==null){
				properties= new Properties();
			}
		}
		return properties;
	}

	@Override
	public boolean load(String configFileName){
		FileInputStream inStream;
		try {
			inStream = new FileInputStream(configFileName);
			InputStreamReader reader=new InputStreamReader(inStream, "utf-8");			
			getProperties().load(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Override
	public int getConfigInt(String key, int defualtValue) {
		String defaultValueStr="" + defualtValue;
		String value=getProperties().getProperty(key, defaultValueStr);
		int intValue=defualtValue;
		try {
			intValue=Integer.parseInt(value);
		}
		catch (Exception e){
			intValue=defualtValue;
		}
		return intValue;
	}
	
	@Override
	public String getConfigString(String key, String defaultValue){
		return getProperties().getProperty(key, defaultValue);
	}
	
	@Override
	public boolean getConfigBool(String key, boolean defaultValue){
		String defaultValueStr="" + defaultValue;
		String valueStr=getProperties().getProperty(key, defaultValueStr);
		if(defaultValue){
			if(valueStr!=null && (valueStr.equals("0") || valueStr.compareToIgnoreCase("false")==0)){
				return false;
			}
			return true;
		} else {
			if(valueStr!=null && valueStr.equals("1") || valueStr.compareToIgnoreCase("true")==0){
				return true;
			}
			return false;
		}
	}
	
	@Override
	public double getConfigDouble(String key, double defaultValue){
		String defaultValueStr="" + defaultValue;
		String valueStr=getProperties().getProperty(key, defaultValueStr);
		double value=defaultValue;
		try {
			value=Double.parseDouble(valueStr);
		} catch (Exception e){
			value=defaultValue;
		}
		return value;
	}
	
	@Override
	public char getConfigChar(String key, char defaultValue){
		StringBuilder builder=new StringBuilder();
		builder.append(defaultValue);
		String valueStr=getProperties().getProperty(key, builder.toString());
		if(valueStr!=null && valueStr.length()>0){
			return valueStr.charAt(0);
		}
		return defaultValue;
	}
}
