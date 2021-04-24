package hrm.main.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import hrm.drivermanager.com.InitializeDriver;

public class Login 
{	 
	public static void log_in()
	{
		InitializeDriver.driver.get("http://127.0.0.1/orangehrm/symfony/web/index.php/auth/login");
		InitializeDriver.driver.manage().window().maximize();
		InitializeDriver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		InitializeDriver.driver.findElement(By.id("txtUsername")).sendKeys("priyanka");
		InitializeDriver.driver.findElement(By.id("txtPassword")).sendKeys("priyanka123");
		InitializeDriver.driver.findElement(By.id("btnLogin")).click();
	}

}
