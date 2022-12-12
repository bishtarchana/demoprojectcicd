package com.cicdcheck.cicdcheck;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import static org.junit.Assert.assertTrue;

//import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public static WebDriver driver;

	@BeforeMethod
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Archana\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
    @Test
    public void Test1() {
		driver.navigate().to("https://automationTalks.com/");
		System.out.println("Test 1 title is" + driver.getTitle());
	}

    @Test
	public void Test2() {
		driver.navigate().to("https://automationTalks.com/");
		System.out.println("Test 2 title is" + driver.getTitle());
	}

    @Test
	public void Test3() {
		driver.navigate().to("https://automationTalks.com/");
		System.out.println("Test 3 title is" + driver.getTitle());
	}
    
    @AfterMethod
    public void quit() {
    	driver.quit();
    }
}
