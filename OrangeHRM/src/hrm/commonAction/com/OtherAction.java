package hrm.commonAction.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import hrm.drivermanager.com.InitializeDriver;

public class OtherAction 
{
	public static void takeScreenShot()
	{
		try
		{
		File scrFile=((TakesScreenshot)InitializeDriver.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\EclipseProgramsPath\\OrangeHRM\\ScreenShot\\test.png"));	
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
