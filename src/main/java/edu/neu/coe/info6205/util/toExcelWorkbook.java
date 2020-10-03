package edu.neu.coe.info6205.util;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class toExcelWorkbook {
	
	private XSSFWorkbook workbook;
	private String file_name;
	final static LazyLogger logger = new LazyLogger(toExcelWorkbook.class);
	
	public toExcelWorkbook(String file_name) {
		this.file_name = file_name;
		this.workbook = new XSSFWorkbook();
	}
	
	public void addExcelSheet(Object[][] bookData, int sheet_no) {
		
		XSSFSheet sheet = this.workbook.createSheet("sheet no. " + sheet_no);

		int rowCount = 0;

		for (Object[] aBook : bookData) {
			Row row = sheet.createRow(++rowCount);

			int columnCount = 0;

			for (Object field : aBook) {
				Cell cell = row.createCell(++columnCount);
				if (field instanceof Double) {
					cell.setCellValue((Double) field);
				} else if (field instanceof Integer) {
					cell.setCellValue((Integer) field);
				}
			}

		}

	}
	
	public void writeToFile(String file_name) {
		
		if(file_name == null || file_name == "") {
			file_name = this.file_name;
		}
		
	try (FileOutputStream outputStream = new FileOutputStream("C:\\Algorithms-Fall2020\\" + file_name + ".xlsx")) {
		workbook.write(outputStream);
		logger.info("Generated excel file at - " + "C:\\Algorithms-Fall2020\\" + file_name + ".xlsx");
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}