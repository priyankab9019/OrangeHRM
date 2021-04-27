package hrm.test.com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hrm.drivermanager.com.InitializeDriver;
import hrm.main.com.Login;
import hrm.utility.com.PropertyManager;

public class TC001_Login 
{
	WebDriver driver;
	String uName=PropertyManager.getData("username","config");
	String pwd=PropertyManager.getData("password","config");
	String baseURL=PropertyManager.getData("URL","config");
	Login loginObj=new Login();
	 @BeforeTest
	  public void beforeTest() 
	  {
		 InitializeDriver.OpenBrowser("chrome");		 
	  }
	 @Test
	 public void loginHRM()
	 {
		 loginObj.log_in(uName, pwd, baseURL);		 
	 }
	 @AfterTest
	 public void LogoutHRM()
	 {
		 
	 }
}
