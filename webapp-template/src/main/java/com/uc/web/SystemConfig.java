package com.uc.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class SystemConfig {
	
	public static final String KEY_EXPORT_MAX_ROW = "export.max-row";
	public static final String KEY_LIST_PAGE_SIZE = "list.page-size";
	public static final String KEY_SYSTEM_NAME="system.name";
	public static final String KEY_SYSTEM_VERSION="system.version";
	public static final String KEY_COMPANY_NAME="system.company";
	public static final int DEFAULT_LIST_PAGE_SIZE = 20;
	public static final int DEFAULT_EXPORT_MAX_ROW = 10000;
	public static final String DEFAULT_SYSTEM_NAME="webapp";
	public static final String DEFAULT_SYSTEM_VERSION="1.0";
	public static final String DEFAULT_COMPANY_NAME="云南优云科技有限公司";
	private static Properties properties;
	public static Properties getProperties(){
		synchronized (SystemConfig.class) {
			if(properties==null){
				properties= new Properties();
			}
		}
		return properties;
	}
	public static boolean load(String configFileName){
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
	
	public static int getConfigInt(String key, int defualtValue) {
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
	
	public static String getConfigString(String key, String defaultValue){
		return getProperties().getProperty(key, defaultValue);
	}
	
	public static boolean getConfigBool(String key, boolean defaultValue){
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
	
	public static double getConfigDouble(String key, double defaultValue){
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
	
	public static char getConfigChar(String key, char defaultValue){
		StringBuilder builder=new StringBuilder();
		builder.append(defaultValue);
		String valueStr=getProperties().getProperty(key, builder.toString());
		if(valueStr!=null && valueStr.length()>0){
			return valueStr.charAt(0);
		}
		return defaultValue;
	}
}
