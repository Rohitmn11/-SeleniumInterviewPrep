package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_ApachePOI {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			FileInputStream file = new FileInputStream("F://SeleniumInterview/SeleniumInterviewPrep/TestData/ReadExcel.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(file);
			
			XSSFSheet sheet=  wb.getSheetAt(0);
			
			Row row= sheet.getRow(0);
			Cell cell1 = row.getCell(1);
			int rowcount =sheet.getLastRowNum();
			int columncount =sheet.getRow(1).getLastCellNum();
			//rowcount = row.getRowNum();
			System.out.println(columncount);
			System.out.println(sheet.getRow(1).getCell(1));
			//System.out.println(row + cell1);
			
			}

}
