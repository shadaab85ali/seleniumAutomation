package StepDefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelSheet {
	
@Test
public void readExcelData() throws IOException {
	System.out.println("the entry1 value= ");
	File src=new File("D:\\Users\\HP\\eclipse-workspace\\AutomationProjectV2\\ExcelFile\\Book1.xlsx");
	FileInputStream fis=new FileInputStream(src);
	
	XSSFWorkbook xsf=new XSSFWorkbook(fis);
	
	XSSFSheet sheet=xsf.getSheetAt(0);
	
	String entry1=sheet.getRow(1).getCell(0).getStringCellValue();
	
	System.out.println("the entry1 value= "+entry1);
	 xsf.close();
	
}

}
