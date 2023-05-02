
package darmaan;

import java.io.*;
import java.sql.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

/**
 * A simple Java program that exports data from database to Excel file.
 * @author Nam Ha Minh
 * (C) Copyright codejava.net
 */
public class SimpleDb2ExcelExporter {

	
	public void export() {
		String jdbcURL = "jdbc:h2:~/dintest";
		String username = "jawad";
		String password = "1234";

		String excelFilePath = "Reviews-export.xlsx";

		try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
			String sql = "SELECT * FROM sickdetails";
                        String sql1 = "SELECT * FROM tooth_info";

			Statement statement = connection.createStatement();

			ResultSet result = statement.executeQuery(sql);

			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("Reviews");

			writeHeaderLine(sheet);

			writeDataLines(result, workbook, sheet);

			FileOutputStream outputStream = new FileOutputStream(excelFilePath);
			workbook.write(outputStream);
			workbook.close();

			statement.close();

		} catch (SQLException e) {
			System.out.println("Datababse error:");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("File IO error:");
			e.printStackTrace();
		}
	}

	private void writeHeaderLine(XSSFSheet sheet) {

		Row headerRow = sheet.createRow(0);

		Cell headerCell = headerRow.createCell(0);
		headerCell.setCellValue("آی دی");

		headerCell = headerRow.createCell(1);
		headerCell.setCellValue("نمبر مشخصه");

		headerCell = headerRow.createCell(2);
		headerCell.setCellValue("نام");

		headerCell = headerRow.createCell(3);
		headerCell.setCellValue("تخلص");

		headerCell = headerRow.createCell(4);
		headerCell.setCellValue("سن");
                
                headerCell = headerRow.createCell(5);
		headerCell.setCellValue("مریضی قبلی");
                
                headerCell = headerRow.createCell(6);
		headerCell.setCellValue("شماره تماس");
                
                headerCell = headerRow.createCell(7);
		headerCell.setCellValue("نوع تداوی");
                
                headerCell = headerRow.createCell(8);
		headerCell.setCellValue("جمع کل");
                
                headerCell = headerRow.createCell(9);
		headerCell.setCellValue("رسید اول");
                
                headerCell = headerRow.createCell(10);
		headerCell.setCellValue("رسید دوم");
                
                headerCell = headerRow.createCell(11);
		headerCell.setCellValue("رسید سوم");
                
                headerCell = headerRow.createCell(12);
		headerCell.setCellValue("باقی مانده");
                
                 headerCell = headerRow.createCell(13);
		headerCell.setCellValue("تاریخ");
                
                 headerCell = headerRow.createCell(14);
		headerCell.setCellValue("جنسیت");
                
                 headerCell = headerRow.createCell(15);
		headerCell.setCellValue("آدرس");
                
                headerCell = headerRow.createCell(16);
		headerCell.setCellValue("رسید چهارم");
	}

	private void writeDataLines(ResultSet result, XSSFWorkbook workbook, 
			XSSFSheet sheet) throws SQLException {
		int rowCount = 1;

		while (result.next()) {
			String courseName = result.getString(1);
			String studentName = result.getString(2);
			String rating = result.getString(3);
			String comment = result.getString(4);
                        String comment1 = result.getString(5);
                        String comment2 = result.getString(6);
                        String comment3 = result.getString(7);
                        String comment4 = result.getString(8);
                        String comment5 = result.getString(9);
                        String comment6 = result.getString(10);
                        String comment7= result.getString(11);
                        String comment8 = result.getString(12);
                        String comment9 = result.getString(13);
                        String comment10 = result.getString(14);
                        String comment11 = result.getString(15);
                        String comment12 = result.getString(16);
                        String comment13 = result.getString(17);
                        
			Row row = sheet.createRow(rowCount++);

			int columnCount = 0;
			Cell cell = row.createCell(columnCount++);
			cell.setCellValue(courseName);

			cell = row.createCell(columnCount++);
			cell.setCellValue(studentName);

//			cell = row.createCell(columnCount++);
//
//			CellStyle cellStyle = workbook.createCellStyle();
//			CreationHelper creationHelper = workbook.getCreationHelper();
//			cellStyle.setDataFormat(creationHelper.createDataFormat().getFormat("yyyy-MM-dd HH:mm:ss"));
//			cell.setCellStyle(cellStyle);

//			cell.setCellValue(timestamp);

			cell = row.createCell(columnCount++);
			cell.setCellValue(rating);

			cell = row.createCell(columnCount++);
			cell.setCellValue(comment);
                        cell = row.createCell(columnCount++);
                        cell.setCellValue(comment1);
                        cell = row.createCell(columnCount++);
                        cell.setCellValue(comment2);
                        cell = row.createCell(columnCount++);
                        cell.setCellValue(comment3);
                        cell = row.createCell(columnCount++);
                        cell.setCellValue(comment4);
                        cell = row.createCell(columnCount++);
                        cell.setCellValue(comment5);
                        cell = row.createCell(columnCount++);
                        cell.setCellValue(comment6);
                        cell = row.createCell(columnCount++);
                        cell.setCellValue(comment7);
                        cell = row.createCell(columnCount++);
                        cell.setCellValue(comment8);
                        cell = row.createCell(columnCount++);
                        cell.setCellValue(comment9);
                        cell = row.createCell(columnCount++);
                        cell.setCellValue(comment10);
                        cell = row.createCell(columnCount++);
                        cell.setCellValue(comment11);
                        cell = row.createCell(columnCount++);
                        cell.setCellValue(comment12);
                        cell = row.createCell(columnCount);
                        cell.setCellValue(comment13);
                      
                              
                        

		}
	}

}