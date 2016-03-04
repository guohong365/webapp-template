package com.uc.utils.exportor;

import org.apache.poi.ss.usermodel.IndexedColors;

public class ExcelExportOptionsImpl implements ExcelExportOptions {
		
	
	public ExcelExportOptionsImpl() {
		this.titleFont="黑体";
		this.titleFontSize=20;
		this.titleFontStyle=Exportor.BOLD;
		this.titleColor=IndexedColors.AUTOMATIC.getIndex();
		this.titleBkColor=IndexedColors.AUTOMATIC.getIndex();
		this.columnHeaderFont="宋体";
		this.columnHeaderFontSize=12;
		this.columnHeaderFontStyle=Exportor.BOLD;
		this.columnHeaderColor=IndexedColors.AUTOMATIC.getIndex();
		this.columnHeaderBkColor=IndexedColors.AUTOMATIC.getIndex();
	}
	
	@Override
	public String getTitleFont() {
		return titleFont;
	}
	public void setTitleFont(String titleFont) {
		this.titleFont = titleFont;
	}
	public short getTitleFontSize() {
		return titleFontSize;
	}
	public void setTitleFontSize(short titleFontSize) {
		this.titleFontSize = titleFontSize;
	}
	public short getTitleFontStyle() {
		return titleFontStyle;
	}
	public void setTitleFontStyle(short titleFontStyle) {
		this.titleFontStyle = titleFontStyle;
	}
	private String titleFont;
	private short titleFontSize;
	private short titleFontStyle;
	private short titleColor;
	private short titleBkColor;

	private String columnHeaderFont;
	
	private short columnHeaderFontSize;
	private short columnHeaderFontStyle;
	private short columnHeaderColor;
	private short columnHeaderBkColor;
	public short getTitleColor() {
		return titleColor;
	}
	public void setTitleColor(short titleColor) {
		this.titleColor = titleColor;
	}
	public short getTitleBkColor() {
		return titleBkColor;
	}
	public void setTitleBkColor(short titleBkColor) {
		this.titleBkColor = titleBkColor;
	}
	public String getColumnHeaderFont() {
		return columnHeaderFont;
	}
	public void setColumnHeaderFont(String columnHeaderFont) {
		this.columnHeaderFont = columnHeaderFont;
	}
	public short getColumnHeaderFontSize() {
		return columnHeaderFontSize;
	}
	public void setColumnHeaderFontSize(short columnHeaderFontSize) {
		this.columnHeaderFontSize = columnHeaderFontSize;
	}
	public short getColumnHeaderFontStyle() {
		return columnHeaderFontStyle;
	}
	public void setColumnHeaderFontStyle(short columnHeaderFontStyle) {
		this.columnHeaderFontStyle = columnHeaderFontStyle;
	}
	public short getColumnHeaderColor() {
		return columnHeaderColor;
	}
	public void setColumnHeaderColor(short columnHeaderColor) {
		this.columnHeaderColor = columnHeaderColor;
	}
	public short getColumnHeaderBkColor() {
		return columnHeaderBkColor;
	}
	public void setColumnHeaderBkColor(short columnHeaderBkColor) {
		this.columnHeaderBkColor = columnHeaderBkColor;
	}
}
