package hrm.main.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import hrm.drivermanager.com.InitializeDriver;
import hrm.pom.com.Login_Page;

public class Login 
{	 
	Login_Page LoginPage=new Login_Page();
	public void log_in()
	{
		InitializeDriver.driver.get("http://127.0.0.1/orangehrm/symfony/web/index.php/auth/login");
		InitializeDriver.driver.manage().window().maximize();
		InitializeDriver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage.Username(InitializeDriver.driver).sendKeys("priyanka");		
		LoginPage.Password(InitializeDriver.driver).sendKeys("priyanka123");
		LoginPage.LoginButton(InitializeDriver.driver).click();
	}

}
