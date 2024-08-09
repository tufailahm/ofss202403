package com.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.opera.driver",
				"C:\\Users\\tufai\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		WebDriver driver = new OperaDriver();

    }
}
