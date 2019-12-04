package com.git33;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	private WebDriver driver;


	  @BeforeClass
	  public void setUp() throws Exception {
		  System.setProperty("webdriver.chrome.driver", "D:\\wqh\\eclipse\\com.git33\\src\\test\\resources\\chromedriver782.exe");
			
			 driver = new ChromeDriver();
		
		// System.setProperty("webdriver.gecko.driver", "D:\\wqh\\eclipse\\git22\\src\\test\\resources\\geckodriver66.exe");
		
	 //   driver = new FirefoxDriver();
	
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testUntitledTestCase() throws Exception {
			driver.get("http://ask.testfan.cn/");
			driver.manage().window().maximize();
		  
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.quit();
	    
	  }

}
