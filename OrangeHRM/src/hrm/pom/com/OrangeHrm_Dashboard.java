package hrm.pom.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrm_Dashboard 
{
	public WebElement Welcm_Admin(WebDriver driver)
	{
		return driver.findElement(By.id("welcome"));
	}
	public void Logout_Button(WebDriver driver)
	{
		Select selct=new Select(driver.findElement(By.id("welcome-menu")));
		selct.selectByVisibleText("Logout");
	}
}
