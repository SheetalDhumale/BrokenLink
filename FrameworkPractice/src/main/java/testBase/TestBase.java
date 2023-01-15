package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	public static WebDriver driver;
	@BeforeMethod
	public void setup(String br)
	{
		driver = new ChromeDriver();
		driver.get("https:www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
