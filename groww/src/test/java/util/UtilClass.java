package util;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilClass {
	private static FileInputStream file;
	private static String str_value="";

	public static void snapShot(WebDriver driver, String testId) throws IOException {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String formattedDate = sdf.format(date);
		String FileName = formattedDate.toString().replace(":", "_").replace(" ", "_").replace("-", "_");

		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Shreya Shirodkar\\Pictures\\Screenshots\\xyz" + FileName + testId + ".jpg");
		FileHandler.copy(src1, dest);
	}

	 public static String getDataFromExcel(String sheet_name, int row_no, int cell_no) throws EncryptedDocumentException, IOException {
		 
		 	String path="C:\\Automation\\excelsheet.xlsx";
			file= new FileInputStream(path);
			try {
				str_value=WorkbookFactory.create(file).getSheet(sheet_name).getRow(row_no).getCell(cell_no).getStringCellValue();
				return str_value;
			}
			catch(Exception e){
				double num_value= WorkbookFactory.create(file).getSheet(sheet_name).getRow(row_no).getCell(cell_no).getNumericCellValue();
				str_value=Double.toString(num_value);
				return str_value;
		 }	
	 } 
}
