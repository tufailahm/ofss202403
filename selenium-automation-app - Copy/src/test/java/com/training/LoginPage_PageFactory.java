package com.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PageFactory {
	
	@FindBy(id = "user-name")
	WebElement txt_username;
	
	@FindBy(id = "password")
	WebElement txt_password;

	@FindBy(id = "login-button")
	WebElement btn_login;

	public LoginPage_PageFactory(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_username.sendKeys(password);
	}

	public void clickLogin() {
		btn_login.click();
	}

	

}
