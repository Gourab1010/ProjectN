package Library_files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utilityClass 
{     //name
	//
	public static String getDataFromPF(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\biswa\\eclipse-wo"
				+ "rkspace\\Framework_maven_proj\\PropFile.properties");
		//creating object of properties class
		Properties prop = new Properties();
		//calling load method present indsidwe properties class
		prop.load(file);//opened propfile
		// get data from pF 
		String value1=prop.getProperty(key);
		return value1;
		
	}
	//neme 
	//date
	public static String getDataFromXlsheet( int rowIndex,int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\biswa\\eclipse-workspace\\Fram"
				+ "ework_maven_proj\\Testdata\\Datasheet.xlsx");
		String value2=WorkbookFactory.create(file).getSheet("sheet1").getRow(rowIndex).getCell(colIndex).getStringCellValue();
		return value2;
	}
	
	//name 
	public static void captureScreensshot(WebDriver driver, String TestcaseID) throws IOException
	{
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File dest=new File("C:\\Users\\biswa\\eclipse-workspace\\"
				+ "Framework_maven_proj\\Screenshots"+TestcaseID+".jpg");
	    org.openqa.selenium.io.FileHandler.copy(source, dest);
	}

}
