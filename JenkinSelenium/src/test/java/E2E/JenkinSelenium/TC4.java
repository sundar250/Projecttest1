package E2E.JenkinSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC4 {
	
	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("uname1");
		
		driver.findElement(By.id("pass")).sendKeys("pass1");
		driver.quit();
	}

}
