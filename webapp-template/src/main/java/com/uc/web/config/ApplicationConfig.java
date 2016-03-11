package com.uc.web.config;

import java.util.Properties;

public interface ApplicationConfig {

	Properties getProperties();

	boolean load(String configFileName);

	int getConfigInt(String key, int defualtValue);

	String getConfigString(String key, String defaultValue);

	boolean getConfigBool(String key, boolean defaultValue);

	double getConfigDouble(String key, double defaultValue);

	char getConfigChar(String key, char defaultValue);

}