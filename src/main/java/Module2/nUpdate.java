package Module2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class nUpdate {
	
	@FindBy(xpath="(//a[@href=\"/mnjuser/profile\"])[1]") private WebElement cmpProfile;
	
	
	@FindBy(xpath="//input[@value=\"Update resume\"]") private WebElement update;
	
	@FindBy(xpath = "//div[@class=\"nI-gNb-drawer__bars\"]")private WebElement threedot;
	@FindBy(xpath = "//a[@title=\"Logout\"]") private WebElement logout;
	
	public nUpdate(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickcmpprofile()
	{
		cmpProfile.click();
	}
	
	
	
	public void clickupdate() 
	{
		update.click();
		
		
	}
	
	public void updatefile() throws AWTException
	{
		StringSelection s1=new StringSelection("D:\\ggg\\resume final\\Gourab_resume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1,null);
		Robot r1=new Robot();
		r1.delay(2000);
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void click3dot()
	{
		threedot.click();
	}
	
	public void log_out() 
	{
		logout.click();
	}

}
