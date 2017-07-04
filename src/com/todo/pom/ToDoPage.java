package com.todo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ToDoPage {
	
	public ToDoPage(WebDriver driver){
		PageFactory.initElements(driver, this);		
	}

}
