package dashBoard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.Base1;
import pomClasses.LoginPage;

public class VerifyUserCanAddStocksToWatchList extends Base1
{
  
  LoginPage lp;
  
  @BeforeClass
  public void beforeClass() throws IOException
  {
	  getDriver();
  }
  @BeforeMethod
	public void beforeMethod() throws IOException, InterruptedException 
  	{
		lp = new LoginPage(driver);
		lp.enterUserName();
		lp.enterPassword();
		lp.clickOnLoginBtn();
	}
  @Test
  public void f() 
  {
	  
  }
}
