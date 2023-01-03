package src.practice.test;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PoiMakeExcel {
	public static String filePath = "C:\\poi_temp";
	public static String fileNm = "poi_test.xlsx";
	
	public static void main(String[] args) {
		XSSFRow xssfRow = null;
		XSSFCell xssfCell = null;
		
		// 빈 Workbook 생성
		XSSFWorkbook workbook = new XSSFWorkbook();

		// 빈 Excel Sheet를 생성, 파일이름 : employee data
		XSSFSheet sheet1 = workbook.createSheet("employee1.xlsx");
//		XSSFSheet sheet2 = workbook.createSheet("employee2.xlsx");

		// Sheet를 채우기 위한 데이터들을 Map에 저장
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] { "순서", "이름", "연락처" });
		data.put("2", new Object[] { "1", "박설아", "010-1111-1111" });
		data.put("3", new Object[] { "2", "김소민", "010-2222-2222" });
		data.put("4", new Object[] { "3", "이영진", "010-3333-3333" });

		// data에서 keySet를 가져온다. 이 Set 값들을 조회하면서 데이터들을 sheet에 입력한다.
		Set<String> keyset = data.keySet();
		int rownum = 0;

		// 폰트 스타일
		XSSFFont font = workbook.createFont();
		font.setFontName(HSSFFont.FONT_ARIAL); // 폰트 스타일
		font.setFontHeightInPoints((short) 20); // 폰트 크기
		font.setBold(true); // Bold 설정

		// 테이블 셀 스타일
		CellStyle cellStyle = workbook.createCellStyle();
		sheet1.setColumnWidth(2, (sheet1.getColumnWidth(2)) + (short) 3000); // 3번째 컬럼 넓이 조절

		cellStyle.setFont(font); // cellStyle에 font를 적용
		cellStyle.setAlignment(HorizontalAlignment.CENTER); // cellStyle에 setAlignment 정렬을 적용
		
		// 셀병합
		sheet1.addMergedRegion(new CellRangeAddress(0, 1, 0, 4)); // 첫행, 마지막행, 첫열, 마지막열 병합

		// 타이틀 생성
		xssfRow = sheet1.createRow(rownum++); // 행 객체 추가
		xssfCell = xssfRow.createCell((short) 0); // 추가한 행에 셀 객체 추가
		xssfCell.setCellStyle(cellStyle); // 셀에 스타일 지정
		xssfCell.setCellValue("JAVA POI Test"); // 데이터 입력

		sheet1.createRow(rownum++);
		xssfRow = sheet1.createRow(rownum++); // 빈행 추가

		// 알아야할 점, TreeMap을 통해 생성된 keySet는 for를 조회시, 키값이 오름차순으로 조회된다.
		for (String key : keyset) {
			Row row = sheet1.createRow(rownum++);
			Object[] objArr = data.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				Cell cell = row.createCell(cellnum++);
				if (obj instanceof String) {
					cell.setCellValue((String) obj);
				} else if (obj instanceof Integer) {
					cell.setCellValue((Integer) obj);
				}
			}
		}
		try {
			FileOutputStream out = new FileOutputStream(new File(filePath, fileNm));
			workbook.write(out);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
