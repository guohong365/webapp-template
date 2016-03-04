package com.uc.utils.exportor;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.uc.web.forms.Column;

public abstract class HeaderInfo extends ColumnInfo {
	protected Logger logger; 
	ExcelExportOptions options;
	
	public HeaderInfo(){
		logger=LoggerFactory.getLogger(getClass());
		options=new ExcelExportOptionsImpl();
	}
	
	@Override
	public int getColSpan() {
		int col=0;
		if(getSubColumns()!=null && getSubColumns().size()>0){
			for(Column column : getSubColumns()){
				col += column.getColSpan();
			}
		}
		return col > 1 ? col : 1;
	};

	public int export(Sheet sheet, int beginRow, int startCol){
		calcHeaderLayout();
		int currentRow=exportTitle(sheet, beginRow, startCol);
		logger.info("after title, row=" + currentRow);
		currentRow=exprotAddtional(sheet, currentRow, startCol);
		logger.info("after addtional, row=" + currentRow);
		currentRow=exportColumnHeader(sheet, currentRow, startCol);
		logger.info("after header, row=" + currentRow);
		return currentRow;
	}
	protected void setTitleStyle(Sheet sheet,CellStyle cellStyle){
		Font font=ExcelHelper.getFont(sheet, options.getTitleFont(), options.getTitleFontSize(), options.getTitleFontStyle());
		cellStyle.setFont(font);
		cellStyle.setAlignment(CellStyle.ALIGN_CENTER);
		cellStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
		//ExcelHelper.setBorder(cellStyle, CellStyle.BORDER_THIN);
	}
	
	protected int exportTitle(Sheet sheet, int beginRow, int startCol){
		CellStyle cellStyle=sheet.getWorkbook().createCellStyle();
		setTitleStyle(sheet, cellStyle);				
		Row row=sheet.createRow(beginRow);
		Cell cell=row.createCell(startCol);
		cell.setCellValue(getTitle());
		cell.setCellStyle(cellStyle);
		CellRangeAddress rangeAddress=new CellRangeAddress(beginRow, beginRow + getRowSpan() - 1 , 0, getColSpan() - 1);
		sheet.addMergedRegion(rangeAddress);
		//ExcelHelper.setRegionBorder(sheet, rangeAddress, CellStyle.BORDER_THIN);		
		return beginRow + getRowSpan();
	}
	
	protected int exprotAddtional(Sheet sheet, int beginRow, int startCol){
		return beginRow;
	}
	
	protected int exportColumn(Sheet sheet, int startRow, int startCol, Column column){
		int subRow=startRow;
		//logger.info(column.toString());
		if(column.getParent()!=null){
			
			Row row=sheet.getRow(startRow);
			if(row==null){
				row=sheet.createRow(startRow);
			}		
			Cell cell = row.createCell(startCol);
			CellStyle cellStyle=sheet.getWorkbook().createCellStyle();
			ExcelHelper.setBorder(cellStyle, CellStyle.BORDER_THIN);
			cellStyle.setAlignment(CellStyle.ALIGN_CENTER);
			cellStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
			Font font=ExcelHelper.getFont(sheet, options.getColumnHeaderFont(), options.getColumnHeaderFontSize(), options.getColumnHeaderFontStyle());
			cellStyle.setFont(font);
			cell.setCellStyle(cellStyle);
			cell.setCellValue(column.getTitle());
			
			if(column.getColSpan()==1){
				int width=((ColumnInfo) column).getWidth();
				if(width > sheet.getColumnWidth(startCol)){
					sheet.setColumnWidth(startCol, width);				
				}
			}
			if(column.getColSpan() > 1 || column.getRowSpan() > 1){
				CellRangeAddress cellRangeAddress=new CellRangeAddress(startRow, startRow + column.getRowSpan() - 1, startCol, startCol + column.getColSpan() - 1);
				//logger.info("column :[" + column.getTitle() + "] at ["+ startRow + ","+ startCol +"], merge:["+ startRow +","+ (startRow + column.getRowSpan() - 1) +", "+ startCol+", "+ (startCol + column.getColSpan() -1) +"]");
				sheet.addMergedRegion(cellRangeAddress);
				ExcelHelper.setRegionBorder(sheet, cellRangeAddress, CellStyle.BORDER_THIN);				
			}
			subRow += column.getRowSpan();
		}		
		if(column.getSubColumns()!=null && column.getSubColumns().size()>0){
			int col=startCol;
			for(Column subColumn: column.getSubColumns()){
				int rows=exportColumn(sheet, startRow + column.getRowSpan(), col , subColumn);
				if(rows > subRow){
					subRow =rows;
				}
				col += subColumn.getColSpan();
			}
		}
		return subRow;
	}
	
	protected int exportColumnHeader(Sheet sheet,int startRow, int startCol){
		logger.info("export column header----------------------");
		int nextRow= exportColumn(sheet, startRow, startCol, this);
		logger.info("row after header is [" + nextRow +"]");
		return nextRow;
	}
	
	protected void calcHeaderLayout(){
		getWidth();
	}
}
