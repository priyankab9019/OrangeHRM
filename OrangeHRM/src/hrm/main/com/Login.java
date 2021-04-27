package hrm.main.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import hrm.commonAction.com.OtherAction;
import hrm.drivermanager.com.InitializeDriver;
import hrm.pom.com.Login_Page;

public class Login 
{	 
	Login_Page LoginPage=new Login_Page();
	OtherAction actionObj=new OtherAction();
	public void log_in(String uName,String pwd,String baseURL)
	{
		InitializeDriver.driver.get(baseURL);
		InitializeDriver.driver.manage().window().maximize();
		InitializeDriver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage.Username(InitializeDriver.driver).sendKeys(uName);		
		LoginPage.Password(InitializeDriver.driver).sendKeys(pwd);
		LoginPage.LoginButton(InitializeDriver.driver).click();
		//actionObj.takeScreenShot();
	}

}
