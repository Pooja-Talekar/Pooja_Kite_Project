package baseClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;



public class Base1 
{
	protected WebDriver driver;
	  
	  public WebDriver getDriver() throws IOException 
	  {
		  System.setProperty("webdriver.chrome.driver","E:\\Velocity Study Material\\IMP Software\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--disable-notifications");
		  driver.manage().window().maximize();
		  driver.get("https://kite.zerodha.com/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  Reporter.log("Launching Browser", true);
		  
		  return driver;
	  }
}	  
