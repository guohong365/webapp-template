package com.uc.utils.exportor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.uc.utils.LoggerSupportorImpl;

public abstract class ExcelExportorBase extends LoggerSupportorImpl implements Exportor {	
	
	private Workbook workbook;
	private Sheet sheet;
	
	protected abstract Workbook createWorkbook();
	
	protected abstract void exportSheets();
	
	public Workbook getWorkbook(){
		return this.workbook;
	}
	public Sheet getSheet(){
		return this.sheet;
	}
	public void setSheet(Sheet sheet){
		this.sheet=sheet;
	}

	@Override
	public void Export(String fileName) throws IOException {
		workbook=createWorkbook();
		exportSheets();
		FileOutputStream fileOutputStream=new FileOutputStream(fileName);
		workbook.write(fileOutputStream);
		fileOutputStream.flush();
		fileOutputStream.close();		
	}			

	@Override
	public void Export(OutputStream outputStream) throws IOException {
		workbook=createWorkbook();
		exportSheets();
		workbook.write(outputStream);
		outputStream.flush();
	}
	
	@Override
	public void Export(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.reset();
		try {
			response.setHeader(
					"Content-disposition",
					"attachment; filename="
							+ new String(getDefaultFileName().getBytes("UTF-8"), "ISO8859-1"));
		} catch (UnsupportedEncodingException e1) {
			response.setHeader("Content-disposition",
					"attachment; filename=" + "report.xls");
			e1.printStackTrace();
		}// 设定输出文件头
		response.setContentType("application/msexcel");// 定义输出类型
		OutputStream outputStream;
		try {
			outputStream = response.getOutputStream();
			Export(outputStream);
			outputStream.flush();
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}
}
