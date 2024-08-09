package com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//POM
public class LoginPage {

	WebDriver driver;
	By txt_username = By.id("user-name");
	By txt_password = By.id("password");
	By btn_login = By.id("login-button");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(btn_login).click();
	}

}
