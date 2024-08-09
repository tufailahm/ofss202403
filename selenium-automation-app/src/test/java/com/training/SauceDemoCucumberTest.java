package com.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemoCucumberTest {

	WebDriver driver;
	static String browser = "chrome";

	public SauceDemoCucumberTest() {
		WebDriverManager.getInstance(browser).setup();
		WebDriverManager.getInstance(browser).create();
		/*
		 * if (browser.equals("chrome")) { driver = new ChromeDriver(); } else if
		 * (browser.equals("edge")) { driver = new EdgeDriver(); } else if
		 * (browser.equals("firefox")) { driver = new FirefoxDriver(); }
		 */
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user_is_on_login_page");
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) {
		System.out.println("user_enters_username_and_password");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		System.out.println("user_click_on_login_button");
		driver.findElement(By.id("login-button")).click();

	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		System.out.println("user_is_navigated_to_the_homepage");
		String expected = "https://www.saucedemo.com/inventory.html";
		String actual = driver.getCurrentUrl();
		assertEquals(expected, actual);
		
	}
	
}
