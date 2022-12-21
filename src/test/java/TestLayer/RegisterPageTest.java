package TestLayer;

import java.io.IOException;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import UtilsLayer.RegisterUtilsClass;

public class RegisterPageTest extends BaseClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			BaseClass.initilazation("chrome");
			RegisterPage registerpage=new RegisterPage();
			registerpage.enterFirstName("yogitha");
			registerpage.enterLastName("kada");
			registerpage.enterMobileNumber("yogitha@gmail.com");
			registerpage.enterPassWord("yogitha@12344");
			String date=registerpage.selectDate("10");
			System.out.println(date);
			String month=registerpage.selectMonth("May");
			System.out.println(month);
			String year=registerpage.selectYear("2020");
			System.out.println(year);	
			RegisterUtilsClass.takeScreenshot("a");
				
			

			
	}

}
