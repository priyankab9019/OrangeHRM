package hrm.main.com;

import org.openqa.selenium.WebDriver;

import hrm.drivermanager.com.InitializeDriver;
import hrm.pom.com.OrangeHrm_Dashboard;

public class DashBoard 
{
	OrangeHrm_Dashboard DashBoardObj=new OrangeHrm_Dashboard();
	public void Logout()
	{
		DashBoardObj.Welcm_Admin(InitializeDriver.driver).click();
		//DashBoardObj.Logout_Button(InitializeDriver.driver).
	}

}
