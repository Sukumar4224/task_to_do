package com.todo.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	static WebDriver driver;
	static Actions a;
	
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Srikrishna\\Desktop\\Sukumar\\exes\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8080/todomvc-master/");
		// a=new Actions(driver);
	}
	
	@AfterMethod 
		
	public void CloseBrowser(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.close();
	}
	
}

