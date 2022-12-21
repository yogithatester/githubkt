package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import UtilsLayer.HandleDropDown;
import UtilsLayer.RegisterUtilsClass;

public class RegisterPage extends BaseClass{
	public void enterFirstName(String firstname)
	{
		WebElement fname=driver.findElement(By.xpath("//input[@name='firstname']"));
		RegisterUtilsClass.checkStatusAndEnterValue(fname,firstname);
	}
	public void enterLastName(String lastname)
	{
		WebElement lname=driver.findElement(By.xpath("//input[@name='lastname']"));
		RegisterUtilsClass.checkStatusAndEnterValue(lname,lastname);
	}
	public void enterMobileNumber(String number)
	{
		WebElement mnumber=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		RegisterUtilsClass.checkStatusAndEnterValue(mnumber,number);
	}
	public void enterPassWord(String pword)
	{
		WebElement rpassword=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		RegisterUtilsClass.checkStatusAndEnterValue(rpassword,pword);
			
	}
	public String selectDate(String date)
	{
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		HandleDropDown.selectValueUsingVisibleText(day,date);
		return HandleDropDown.checkSelectedValue(day);
	}
	public String selectMonth(String months)
	{
		WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
		HandleDropDown.selectValueUsingVisibleText(month,months);
		return HandleDropDown.checkSelectedValue(month);
	}
	public String selectYear(String years)
	{
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		HandleDropDown.selectValueUsingVisibleText(year,years);
		return HandleDropDown.checkSelectedValue(year);
	}

}
