package Module2;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_files.nbase;
import Library_files.utilityClass;

public class nTest extends nbase{
	nLogin log;
	nUpdate update;
	
	
	@BeforeClass
	public void nopenbrowser()
	{
		nbrowserInitialisation();
		log=new nLogin(driver);
		update=new nUpdate(driver);
	}
	
	@BeforeMethod
	public void loginpage() throws IOException
	{
		log.clicknlogin();
		log.entuserid(utilityClass.getDataFromPF("nusername"));
		log.entpass(utilityClass.getDataFromPF("npassword"));
		log.submit();
	}
	
	@Test
	public void resumeupdate() throws AWTException, InterruptedException
	{
		
		update.clickcmpprofile();
		Thread.sleep(2000);
		update.clickupdate();
		update.updatefile();
	Thread.sleep(2000);
		
	}
	
	@AfterMethod
	public void logoutN()
	{
		
		update.click3dot();
		update.log_out();
		
	}
	@AfterClass
	public void quit()
	{
		driver.quit();
	}

}
