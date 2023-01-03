package src.practice.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PoiReadExcel {
	public static String filePath = "C:\\poi_temp";
	public static String fileNm = "poi_test.xlsx";

	public static void main(String[] args) {

		try {
			FileInputStream file = new FileInputStream(new File(filePath, fileNm));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowiterator = sheet.iterator();

			while (rowiterator.hasNext()) {
				Row row = rowiterator.next();
				Iterator<Cell> celliterator = row.cellIterator();

				while (celliterator.hasNext()) {
					Cell cell = celliterator.next();

					switch (cell.getCellType()) {
					case NUMERIC:
						System.out.print((int) cell.getNumericCellValue() + "\t");
						break;
					case STRING:
						System.out.print(cell.getStringCellValue() + "\t");
						break;
					}
				}
				System.out.println();
			}
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}