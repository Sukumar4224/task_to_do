package com.todo.script;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.todo.lib.Generic;
import com.todo.pom.HomePage;
import com.todo.pom.Task_Page;







public class Task extends BaseClass{
	
	
	@Test
	
	public void singleTask() throws Exception{
		
		HomePage hp= new HomePage(driver);
		hp.clickAngularjs();
		Task_Page tp=new Task_Page(driver);
		tp.sendTask("dsjfhgjdk");
		tp.selectTask();
		tp.clickComplete();
		Thread.sleep(3000);
		
		Assert.assertTrue(driver.findElement(By.xpath("(//*[@type='checkbox'])[2]")).isSelected());
		
		
	}
	
	@Test
	public void multipalTask() throws Exception{
		String xlpath="C:\\Users\\Srikrishna\\Desktop\\Sukumar\\data\\DataBook.xlsx";
		String sheet="Sheet1";
		HomePage hp= new HomePage(driver);
		hp.clickAngularjs();
		Task_Page tp=new Task_Page(driver);
		tp.sendTask(Generic.getCellValue(xlpath, sheet, 1, 0));
		tp.sendTask(Generic.getCellValue(xlpath, sheet, 2, 0));
		tp.sendTask(Generic.getCellValue(xlpath, sheet, 3, 0));
		tp.selectAllTask();
		tp.clickComplete();
		Thread.sleep(3000);
		List<WebElement> all=driver.findElements(By.xpath(".//*[@type='checkbox']"));
		for(WebElement e:all){
			Assert.assertTrue(e.isSelected());
		}
		
		
	}
	
	

}
