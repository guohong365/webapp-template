package com.uc.utils.exportor;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.RegionUtil;

public class ExcelHelper {

	public static Font getFont(Sheet sheet, String fontName, short size, short style){
		Font font=sheet.getWorkbook().createFont();
		font.setFontName(fontName);
		font.setFontHeightInPoints(size);
		if((style & Exportor.BOLD)==Exportor.BOLD){
			font.setBold(true);
			//font.setBoldweight((short) 400);			
		}
		if((style & Exportor.ITALIC)==Exportor.ITALIC){
			font.setItalic(true);
		}
		if((style & Exportor.STRIKEOUT)==Exportor.STRIKEOUT){
			font.setStrikeout(true);
		}
		if((style & Exportor.UNDERLINE)==Exportor.UNDERLINE){
			font.setUnderline((byte) 0xFF);
		}
		return font;
	}
	public static Font getFont(Sheet sheet, String fontName, short size, short style, short color) {
		Font font=getFont(sheet, fontName, size, style);
		font.setColor(color);
		return font;
	}
	public static void setBorder(CellStyle style, short border){
		style.setBorderLeft(border);
		style.setBorderRight(border);
		style.setBorderTop(border);
		style.setBorderBottom(border);		
	}
	public static void setRegionBorder(Sheet sheet, CellRangeAddress region, short border){
		RegionUtil.setBorderLeft(border, region, sheet, sheet.getWorkbook());
		RegionUtil.setBorderRight(border, region, sheet, sheet.getWorkbook());
		RegionUtil.setBorderTop(border, region, sheet, sheet.getWorkbook());
		RegionUtil.setBorderBottom(border, region, sheet, sheet.getWorkbook());
	}
	public static int getCellWidth(String value){
		return value.getBytes().length * 256 + 256;
	}
}
