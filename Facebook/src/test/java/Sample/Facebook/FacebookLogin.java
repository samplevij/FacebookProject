package Sample.Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookLogin {


	WebDriver driver;	

	public void launchBrowser() {
			System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32\\\\chromedriver.exe");
			// Initialize browser
			WebDriver driver= new ChromeDriver();	
		driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);		
	}
	@Test()
	public void testcase() {
	
	driver.findElement(By.id("email")).sendKeys("Znishu@yahoo.com");
	driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);	
	driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("12345");	
	driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);	

	driver.close();	
	}

}


// THis testing is completed
//As first step we have added our project to git