package com.uc.utils.exportor;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public abstract class ExcelListExportor<ExportObj extends Object> extends ExcelExportor97Base {	
	private List<ExportObj> data;
	public List<ExportObj> getData() {
		return data;
	}

	public void setData(List<ExportObj> data) {
		this.data = data;
	}

	private int startRow;
	private int startCol;
	private HeaderInfo header;

	public HeaderInfo getHeader() {
		return header;
	}
	
	public void setHeader(HeaderInfo header) {
		this.header = header;
	}
	
	@Override
	protected void exportSheets() {
		Sheet sheet=getWorkbook().createSheet(getHeader().getTitle());
		setSheet(sheet);		
		export(getSheet(), startRow, startCol);
	};
	
	protected int export(Sheet sheet, int startRow, int startCol){
		for(int i=0; i < getColumnCount(); i++){
			sheet.autoSizeColumn(i, true);
		}		
		int current=onExportHeader(sheet, startRow, startCol);
		current = onExportList(sheet, current, startCol);
		//current = onExportFooter(sheet, current, startCol);
		return current;
	}
	
	protected int onExportHeader(Sheet sheet, int startRow, int startCol){
		return getHeader().export(sheet, startRow, startCol);
	}
	
	protected int onExportFooter(Sheet sheet, int startRow, int startCol){
		return 0;
	}
		
	protected int onExportList(Sheet sheet, int startRow, int startCol){
		int currentRow = startRow;
		for(ExportObj  item : getData()){			
			currentRow=onExportRow(sheet, currentRow, startCol, item);			
		}
		return currentRow;
	}
	
	protected int onExportRow(Sheet sheet, int startRow, int startCol, ExportObj rowData){
		Row row=sheet.createRow(startRow);
		for(int i=0; i< getColumnCount(); i++){
			Cell cell=row.createCell(startCol + i);			
			onSetDataCellStyle(cell, i, rowData);
			onExportCell(cell, i, rowData);
		}
		return startRow + 1;
	}
	
	protected void onSetDataCellStyle(Cell cell, int i, ExportObj item){
	}
	protected abstract String onGetColumnValue(int column, ExportObj item);
	
	protected void onExportCell(Cell cell, int column, ExportObj data){
		
		String value=onGetColumnValue(column, data);
		int width=0;
		if(value!=null){
			width=ExcelHelper.getCellWidth(value);
		}
		if(width > cell.getSheet().getColumnWidth(cell.getColumnIndex())){
			cell.getSheet().setColumnWidth(cell.getColumnIndex(), width);
		}
		cell.setCellValue(value);
	}
	
	protected abstract int getColumnCount();
}
