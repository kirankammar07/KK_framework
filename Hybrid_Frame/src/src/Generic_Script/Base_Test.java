package src.Generic_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_const{
	public WebDriver driver;
	@BeforeMethod
	public void openApp() {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(base_url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		@AfterMethod
		{
			public void closeApp(ITestResult res)
			{
				if(ITestResult.FAILURE==res.getStatus();
				{
					TakeScreenShot.getPhoto(driver);
					
				}
				driver.close()
			}
		}
}
