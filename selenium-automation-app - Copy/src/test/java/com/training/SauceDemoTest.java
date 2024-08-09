package com.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemoTest {

	WebDriver driver;
	static String browser = "chrome";

	@BeforeAll
	public static void setUp() {
		if (browser.equals("opera")) {
			System.out.println("Setting up opera");

			} else {
			WebDriverManager.getInstance(browser).setup();
		}
	}

	@BeforeEach
	void setup() {
		// driver = WebDriverManager.getInstance(browser).create();

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("opera")) {
			System.out.println("Setup opera");

			/*
			 * System.setProperty("webdriver.opera.driver",
			 * "C:\\Users\\tufai\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe"
			 * ); ChromeOptions options = new ChromeOptions(); options.setBinary(
			 * "C:\\Users\\tufai\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe"
			 * ); // options.add_experimental_option("w3c", true) driver = new
			 * ChromeDriver(options);
			 */

			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * "C:/Users/tufai/Downloads/operadriver_win64/operadriver_win64/operadriver.exe"
			 * ); WebDriver driver = new ChromeDriver();
			 * driver.get("https://www.google.com");
			 * driver.findElement(By.name("q")).sendKeys("Selenium");
			 */
			
			String operaChromiumDriver = "C:\\Users\\tufai\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe";
			String operaBrowserLocation = "C:/Users/tufai/AppData/Local/Programs/Opera/opera.exe";

			System.setProperty("webdriver.opera.driver", operaChromiumDriver);
  
			
			/*
			 * DesiredCapabilities capabilities = DesiredCapabilities.opera();
			 * 
			 * ChromeOptions options = new ChromeOptions();
			 * options.setBinary("/path/to/opera");
			 * 
			 * capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			 * 
			 * driver = new RemoteWebDriver(new URL("http://127.0.0.1:9515"),capabilities);
			 */
			
		}
	}

	@AfterEach
	void teardown() {
		// driver.quit();
	}

	@Test
	@DisplayName("Checking with valid credentials")
	void test() throws InterruptedException {
		
		  driver.get("https://www.saucedemo.com"); driver.manage().window().maximize();
		  driver.findElement(By.id("user-name")).sendKeys("standard_user");
		  driver.findElement(By.id("password")).sendKeys("secret_sauce");
		  driver.findElement(By.id("login-button")).click(); 
		  String expected =
		  "https://www.saucedemo.com/inventory.html"; String actual =
		  driver.getCurrentUrl(); Thread.sleep(2000); 
		  assertEquals(expected,actual); //
		//  to do how to retrieve actual URL
		 	}
}








