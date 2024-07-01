package Library_files;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nbase {
	
	public WebDriver driver;
	public void nbrowserInitialisation()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naukri.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
