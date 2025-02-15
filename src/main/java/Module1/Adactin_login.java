 package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_login
{
	@FindBy(xpath = "//input[@name=\"username\"]") private WebElement UN;
	@FindBy(xpath = "//input[@name=\"password\"]") private WebElement PSW;
	@FindBy(xpath = "//input[@name=\"login\"]")    private WebElement LoginBtn;
	
	public Adactin_login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterUsername(String user)
	{
		UN.sendKeys(user);
	}
	
	public void enterPassword(String password)
	{
		PSW.sendKeys(password);
	}
	
	public void clickLoginBtn()
	{
		LoginBtn.click();
	}
	
	

}
