package com.uc.utils.exportor;

public interface ExcelExportOptions {

	String getTitleFont();	
	short getTitleFontSize();
	short  getTitleFontStyle();
	short getTitleColor();
	short getTitleBkColor();
	
	String getColumnHeaderFont();
	short  getColumnHeaderFontSize();
	short  getColumnHeaderFontStyle();
	short getColumnHeaderColor();
	short getColumnHeaderBkColor();

}
