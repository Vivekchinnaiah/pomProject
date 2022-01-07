package com.SwagLabs.TestCases;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import com.Swag.utilities.baseClass;
import com.SwagLabs.PageObjects.LoginPage;

import junit.framework.Assert;

public class LoginToApplication extends baseClass {
	
	LoginPage lp= new LoginPage();
	
	@Test(priority=0)
	public  void validLogin(){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(lp.username).clear();
		driver.findElement(lp.username).sendKeys(prop.getProperty("username"));		
		driver.findElement(lp.password).clear();
		driver.findElement(lp.password).sendKeys(prop.getProperty("password"));	
		driver.findElement(lp.login).click();
		String actual=driver.getTitle();
		String expected="Swag Labs";	
		Assert.assertEquals(expected, actual);	
	}
	
	@Test(priority=1)
	public  void inValidLogin(){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(lp.username).sendKeys("admin");
		driver.findElement(lp.password).sendKeys("admin");
		driver.findElement(lp.login).click();
		String errorText="Epic sadface: Username and password do not match any user in this service";
		String actualErrorText=driver.findElement(lp.errorText).getText();
		if(actualErrorText.contains(errorText)){
			Assert.fail("Invalid Crednetials. Please use Valid Credentials");
		}	
	}
		
}
