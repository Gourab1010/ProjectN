package Module1;
//with ddf means from xl data 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Adactin_homepage 
{
	
	@FindBy(xpath ="//input[@name=\"username_show\"]" ) private WebElement userShow;
	@FindBy(xpath = "//a[@href=\"Logout.php\"]")        private WebElement logoutbtn;
	@FindBy(xpath = "//a[text()='Click here to login again']") private WebElement clickloginagain;
	
	
	@FindBy(xpath = "//*[@id='location']") private WebElement location;
	@FindBy(xpath = "//*[@id='hotels']") private WebElement hotels;
	@FindBy(xpath = "//*[@id='room_type']") private WebElement room_type;
	@FindBy(xpath = "//*[@id='room_nos']") private WebElement room_nos;
	@FindBy(xpath = "//*[@id='datepick_in']") private WebElement datepick_in;
	@FindBy(xpath = "//*[@id='datepick_out']") private WebElement datepick_out ;
	@FindBy(xpath = "//*[@id='adult_room']") private WebElement adult_room;
	@FindBy(xpath = "//*[@id='child_room']") private WebElement child_room ;
	@FindBy(xpath = "//*[@id='Submit']") private WebElement Submit ;
	
	
	@FindBy(xpath = "//*[@id='radiobutton_0']") private WebElement radiobutton_0 ;
	@FindBy(xpath = "//*[@id='continue']") private WebElement continuebtn;
	@FindBy(xpath = "//*[@id='first_name']") private WebElement first_name ;
	@FindBy(xpath = "//*[@id='last_name']") private WebElement last_name;
	@FindBy(xpath = "//*[@id='address']") private WebElement address ;
	@FindBy(xpath = "//*[@id='cc_num']") private WebElement cc_num;
	@FindBy(xpath = "//*[@id='cc_type']") private WebElement cc_type;
	@FindBy(xpath = "//*[@id='cc_exp_month']") private WebElement cc_exp_month ;
	@FindBy(xpath = "//*[@id='cc_exp_year']") private WebElement cc_exp_year ;
	@FindBy(xpath = "//*[@id='cc_cvv']") private WebElement cc_cvv ;
	@FindBy(xpath = "//*[@id='book_now']") private WebElement book_nowbtn;
		
	public Adactin_homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public String getUsername()
	{
		String s1=userShow.getAttribute("value");
		String[ ] a1 =s1.split(" ");
		String AN=a1[1];
		return AN;
		
	}
	public void loginagain()
	{
		clickloginagain.click();
	}
	
	
	public void selectHotelocation (String loc)
	{
		Select s1=new Select(location);
		s1.selectByVisibleText(loc);
		
	}
public void selectHotelName (String ho)
	{
	Select s1=new Select(hotels);
	s1.selectByVisibleText(ho);
		
	}
public void selectRoom_type (String rt)
	{
	Select s1=new Select(room_type);
	s1.selectByVisibleText(rt);
	}
public void  selectRoom_nos(String rn)
	{
	Select s1=new Select(room_nos);
	s1.selectByVisibleText(rn);
	}
public void enterDateck_in (String edn)
	{
	datepick_in.clear();
	datepick_in.sendKeys(edn);
	
	}
public void enterDateck_out (String edo)
	{
	datepick_out.clear();
	datepick_out.sendKeys(edo);
	
	}
public void   selectadult_room(String ar)
	{
	Select s1=new Select(adult_room);
	s1.selectByVisibleText(ar);
	}
public void selectchild_room (String cr)
	{
	Select s1=new Select(child_room);
	s1.selectByVisibleText(cr);
	}
public void enterSubmitbtn  ()
	{
	Submit.click();
	}


public void clickRadiobutton ()
	{
	radiobutton_0.click();
	}
public void  enterContinuebtn()
	{
	continuebtn.click();
	}
public void enterFirst_name (String fn)
	{
    first_name.sendKeys(fn);
	}
public void  enterLast_name(String ln)
	{
	last_name.sendKeys(ln);
	}
public void  enterAddress(String ea)
	{
	address.sendKeys(ea);
	}
public void  enterCC_num(String ecn)
	{
	cc_num.sendKeys(ecn);
	}
public void  enterCC_type(String ect)
	{
	cc_type.sendKeys(ect);
	}
public void  enterCC_exp_month (String ccxm)
	{
	cc_exp_month.sendKeys(ccxm);
	}
public void  enterCC_exp_year ( String ccxy)
	{
	cc_exp_year.sendKeys(ccxy);
	}
public void  enterCC_cvv (String cvv)
	{
	cc_cvv.sendKeys(cvv);
	}
public void clickBook_nowbtn()
	{
	book_nowbtn.click();
	}

	
	
	
	public void clickLogoutBtn()
	{
		logoutbtn.click();
		
	}
	

}
