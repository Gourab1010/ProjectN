package Module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class nLogin {
	
	@FindBy(xpath = "//a[@title=\"Jobseeker Login\"]")private WebElement login;
	@FindBy(xpath = "(//input[@type=\"text\"])[1]")private WebElement un;
	@FindBy(xpath = "//input[@type=\"password\"]")private WebElement pass;
	@FindBy(xpath = "//button[@class=\"btn-primary loginButton\"]")private WebElement btn;
	
	
	
	public nLogin( WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clicknlogin()
	{
		login.click();
	}
	
	public void entuserid(String uid)
	{
		un.sendKeys(uid);
	}
	
	public void entpass(String npass)
	{
		pass.sendKeys(npass);
	}
	
	public void submit()
	{
		btn.click();
	}
	
	

}
