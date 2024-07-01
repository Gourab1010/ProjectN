package Module1_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_files.baseClass;
import Library_files.utilityClass;
import Module1.Adactin_homepage;
import Module1.Adactin_login;
import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class Testing_class extends baseClass
{
	
	Adactin_login login;
	Adactin_homepage home;
	String TestcaseID;
	
	
	@BeforeClass
	public void openBrowser()
	
	{
		browserInitialisation();

		
		 login = new Adactin_login(driver);
		 home = new Adactin_homepage(driver);
		 
	}
	
	@BeforeMethod
	public void loginToApp() throws IOException
	{
		login.enterUsername(utilityClass.getDataFromPF("username"));
		login.enterPassword(utilityClass.getDataFromPF("password"));
	    login.clickLoginBtn();
	}
	@Test(priority = 1)
	public  void verifyUserName() throws IOException
	{  
		TestcaseID="TC001";
		//Actul username
		String actualUsername=home.getUsername();
		//Expected username
		String expectedUserName=utilityClass.getDataFromXlsheet(0, 0);
		
		//compare
		Assert.assertEquals(actualUsername, expectedUserName);
	
		
		
	
	}
	
	@Test(priority = 2)
	public void verifyTitle() throws EncryptedDocumentException, IOException
	{
		
		TestcaseID="TC002";
		//call actual title
		String actualTitle=driver.getTitle();
		//call expected title from utilite class
		String expectedTitle=utilityClass.getDataFromXlsheet(1, 0);
		//compare
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority = 3)
	public void BookHotel() throws EncryptedDocumentException, IOException, InterruptedException
	{
		TestcaseID="TC003";
		home.selectHotelocation(utilityClass.getDataFromXlsheet(2, 0));
		
		home.selectHotelName(utilityClass.getDataFromXlsheet(3, 0));
	home.selectRoom_type(utilityClass.getDataFromXlsheet(4, 0));
	home.selectRoom_nos(utilityClass.getDataFromXlsheet(5, 0));
	home.enterDateck_in(utilityClass.getDataFromXlsheet(6, 0));
	home.enterDateck_out(utilityClass.getDataFromXlsheet(7, 0));
	home.selectadult_room(utilityClass.getDataFromXlsheet(8, 0));
	home.selectchild_room(utilityClass.getDataFromXlsheet(9, 0));
	home.enterSubmitbtn();
	
	home.clickRadiobutton();
	home.enterContinuebtn();
	
	
	home.enterFirst_name(utilityClass.getDataFromXlsheet(0, 1));
	home.enterLast_name(utilityClass.getDataFromXlsheet(1, 1));
	home.enterAddress(utilityClass.getDataFromXlsheet(2, 1));
	home.enterCC_num(utilityClass.getDataFromXlsheet(3, 1));
	home.enterCC_type(utilityClass.getDataFromXlsheet(4, 1));
	home.enterCC_exp_month(utilityClass.getDataFromXlsheet(5, 1));
	home.enterCC_exp_year(utilityClass.getDataFromXlsheet(6, 1));
	home.enterCC_cvv(utilityClass.getDataFromXlsheet(7, 1));
	Thread.sleep(2000);
	home.clickBook_nowbtn();
	//Thread.sleep(10000);
	}	
	
	@AfterMethod
	public void logoutFromApp(ITestResult Result) throws IOException
	
	{
		if(Result.getStatus()==ITestResult.FAILURE)
		{
			utilityClass.captureScreensshot(driver,TestcaseID);
		}
		home.clickLogoutBtn();
		home.loginagain();
	}
	@AfterClass
	public void quitBrowser()
	{
		driver.close();
	}
	
}
