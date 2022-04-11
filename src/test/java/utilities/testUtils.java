package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BaseTest;

public class testUtils extends BaseTest {
	
	public void getScreenshot() throws IOException{
		
		Date currentDate = new Date();
		String screenShotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");
		File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShotFile, new File(".//screenshot//"+screenShotFileName+".png"));
		
		
		
	}


}
