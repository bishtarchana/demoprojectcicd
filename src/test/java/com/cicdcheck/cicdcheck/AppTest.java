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
		System.setProperty("webdriver.chrome.driver", "./src/test/lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
    @Test
    public void Test1() {
    	launchWebsite("https://automationTalks.com/","Test 1 title is");
	}

    @Test
	public void Test2() {
    	launchWebsite("https://automationTalks.com/","Test 2 title is");
	}

    @Test
	public void Test3() {
    	launchWebsite("https://automationTalks.com/","Test 3 title is");
	}
    
    public void launchWebsite(String url, String textToPrint) {
    	driver.navigate().to(url);
		System.out.println(textToPrint + driver.getTitle());
    }
    
    @AfterMethod
    public void quit() {
    	driver.quit();
    }
}
