package Library_files;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class baseClass 
{
	public WebDriver driver;
	public void browserInitialisation()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
