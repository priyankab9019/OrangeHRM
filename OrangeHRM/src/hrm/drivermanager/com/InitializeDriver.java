package hrm.drivermanager.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InitializeDriver 
{
	public static WebDriver driver;
	public static void OpenBrowser(String Browser)
	{
		switch(Browser)
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver","D:\\Study software\\Chrome Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		break;
		case "ie":
		DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
	 	 // ieCapabilities.setCapability("nativeEvents", false);    
	/*  	  ieCapabilities.setCapability("unexpectedAlertBehaviour", "accept");
	  	  ieCapabilities.setCapability("ignoreProtectedModeSettings", true);	  
	  	  ieCapabilities.setCapability("enablePersistentHover", true);
	  	ieCapabilities.setCapability("allowBlockedContent", true);
	  	ieCapabilities.setCapability("allow-blocked-content", true);
	  	  ieCapabilities.setCapability("disable-popup-blocking", true); */
			System.setProperty("webdriver.ie.driver","D:\\Study software\\IE Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		break;
		default:
			System.out.println("Browser not found");
		}
		
	}

}
