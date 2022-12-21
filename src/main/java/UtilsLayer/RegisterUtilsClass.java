package UtilsLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class RegisterUtilsClass extends BaseClass {
	public static void checkStatusAndEnterValue(WebElement wb,String value)
	{
		if((wb.isDisplayed()&&wb.isEnabled()))
		{
			wb.sendKeys(value);
		}
	}
	public static void takeScreenshot(String name) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File t=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"\\Screenshots\\"+name+".png");
		
		FileUtils.copyFile(t,dest);
	}
}
