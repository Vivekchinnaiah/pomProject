package com.SwagLabs.PageObjects;

import org.openqa.selenium.By;



public class LoginPage   {

	public   By username = By.xpath("//input[@id='user-name']");
	public   By password = By.xpath("//input[@id='password']");
	public   By login = By.xpath("//input[@id='login-button']");
	public 	 By errorText= By.xpath("//h3[@data-test='error']");

}
