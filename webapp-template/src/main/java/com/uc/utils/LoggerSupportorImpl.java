package com.uc.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerSupportorImpl implements LoggerSupportor {
	private Logger logger;
	public LoggerSupportorImpl() {
		logger=LoggerFactory.getLogger(this.getClass());
	}
	@Override
	public Logger getLoggger() {
		return logger;
	}
}
