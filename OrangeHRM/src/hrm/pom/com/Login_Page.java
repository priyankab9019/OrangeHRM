package hrm.pom.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Login_Page 
{
	public WebElement Username(WebDriver driver)
	{
		return driver.findElement(By.id("txtUsername"));
	}
	public WebElement Password(WebDriver driver)
	{
		return driver.findElement(By.id("txtPassword"));
	}
	public WebElement LoginButton(WebDriver driver)
	{
		return driver.findElement(By.id("btnLogin"));
	}
}
