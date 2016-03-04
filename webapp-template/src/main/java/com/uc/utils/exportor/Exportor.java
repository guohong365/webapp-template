package com.uc.utils.exportor;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Exportor {
	public static final int BOLD=1;
	public static final int ITALIC=2;
	public static final int STRIKEOUT=4;
	public static final int UNDERLINE=8;
	public static final int MAX_ROW = 10000;
	
	void Export(String fileName) throws IOException;
	void Export(OutputStream outputStream) throws IOException;
	void Export(HttpServletRequest request, HttpServletResponse response) throws IOException;
	String getDefaultFileName();
}
