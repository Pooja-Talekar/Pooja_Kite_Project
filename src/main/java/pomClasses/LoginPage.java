package pomClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilClasses.Util1;

public class LoginPage extends Util1
{
	@FindBy(xpath="//input[@id='userid']")private WebElement userIDInput ;
	@FindBy(xpath="//input[@id='password']")private WebElement passwordInput ;
	@FindBy(xpath="//button[@type='submit']")private WebElement sublitBtn ;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName() throws IOException
	{
		userIDInput.sendKeys(getDataFromConfig("id"));
	}
	public void enterPassword() throws IOException, InterruptedException
	{
		Thread.sleep(1000);
		passwordInput.sendKeys(getDataFromConfig("password"));
	}
	public void clickOnLoginBtn()
	{
		sublitBtn.click();
		
	}
	
}

