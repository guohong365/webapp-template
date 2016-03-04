package com.uc.utils.exportor;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public abstract class ExcelExportor97Base extends ExcelExportorBase {

	@Override
	protected Workbook createWorkbook() {
		return new HSSFWorkbook();
	}
}
