package com.todo.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task_Page {
	public Task_Page(WebDriver driver){
		PageFactory.initElements(driver, this);		
	}
	@FindBy(xpath=".//*[@id='new-todo']")
	private WebElement taskFeild;

	public void sendTask(String task) {
		taskFeild.sendKeys(task);
		taskFeild.sendKeys(Keys.ENTER);
	}
	@FindBy(xpath=".//*[@id='todo-list']/li/div/input")
	private WebElement select;

	public void selectTask() {
		select.click();
	}
	@FindBy(xpath=".//*[@id='toggle-all']")
	private WebElement selectAll;

	public void selectAllTask() {
		selectAll.click();
	}
	@FindBy(xpath=".//*[@id='filters']/li[3]/a")
	private WebElement complete;

	public void clickComplete() {
		complete.click();
	}


}
