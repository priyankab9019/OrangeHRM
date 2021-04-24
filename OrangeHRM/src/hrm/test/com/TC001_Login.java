package hrm.test.com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hrm.drivermanager.com.InitializeDriver;
import hrm.main.com.Login;

public class TC001_Login 
{
	WebDriver driver;
	Login loginObj=new Login();
	 @BeforeTest
	  public void beforeTest() 
	  {
		 InitializeDriver.OpenBrowser("chrome");		 
	  }
	 @Test
	 public void loginHRM()
	 {
		 loginObj.log_in();		 
	 }
	 @AfterTest
	 public void LogoutHRM()
	 {
		 
	 }

}
