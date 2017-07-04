package com.todo.lib;



import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Generic {
	
	 
	public void  mouseOver(Actions a,WebElement element) throws Exception{
		
		Thread.sleep(5000);
		a.moveToElement(element).perform();
		
	}
	public static String getCellValue(String path,String sheet,int row,int col) throws Exception{
		String task;
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		task=wb.getSheet(sheet).getRow(row).getCell(col).toString();
		return task;
		}
	
	

}
