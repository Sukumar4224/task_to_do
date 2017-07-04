package com.todo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.todo.lib.Generic;

public class HomePage {

	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);		
	}
	
	// Headers path
	@FindBy(xpath="//*[@id='tabsContent']/paper-tab[1]/div")
		private WebElement javaScriptHeaderIcon;
	
		public void javaScriptHeader() {
			javaScriptHeaderIcon.click();
		}
		@FindBy(xpath="//a[text()='AngularJS']")
		private WebElement angularjs;
	
		public void clickAngularjs() {
			angularjs.click();
		}
		
	@FindBy(xpath="//*[@id='tabsContent']/paper-tab[2]/div")
		private WebElement compile_To_Js_HeaderIcon;
	
		public void compile_To_Js_Header() {
			compile_To_Js_HeaderIcon.click();
	}
	
	@FindBy(xpath="//*[@id='tabsContent']/paper-tab[3]/div")
		private WebElement lab_HeaderIcon;
	
		public void lab_Header() {
			lab_HeaderIcon.click();
	}
		
	//subHeader path
		@FindBy(xpath="//div[1]/ul/li[1]/a")
		private WebElement backBone_js;
	
		public void backBone_js_link() {
			backBone_js.click();
	}
		
		@FindBy(xpath="//div[1]/ul/li[2]/a")
		private WebElement angular_js;
	
		public void angular_js_link() {
			angular_js.click();
	}
		@FindBy(xpath="//div[1]/ul/li[3]/a")
		private WebElement ember_js;
	
		public void ember_js_link() {
			ember_js.click();
	}
		@FindBy(xpath="//div[1]/ul/li[4]/a")
		private WebElement knockout_js;
	
		public void knockout_js_link() {
			knockout_js.click();
	}
//
		@FindBy(xpath="//div[1]/ul/li[5]/a")
		private WebElement doJo;
	
		public void doJo_link() {
			doJo.click();
	}
		
		@FindBy(xpath="//div[1]/ul/li[6]/a")
		private WebElement knockback_js;
	
		public void knockback_js_link() {
			knockback_js.click();
	}
		@FindBy(xpath="//div[1]/ul/li[7]/a")
		private WebElement can_js;
	
		public void can_js_link() {
			can_js.click();
	}
		@FindBy(xpath="//div[1]/ul/li[8]/a")
		private WebElement polymer;
	
		public void polymer_link() {
			polymer.click();
	}
		
//
		@FindBy(xpath="//div[1]/ul/li[9]/a")
		private WebElement react;
	
		public void react_link() {
			react.click();
	}
		
		@FindBy(xpath="//div[1]/ul/li[10]/a")
		private WebElement mithril;
	
		public void mithril_link() {
			mithril.click();
	}
		@FindBy(xpath="//div[1]/ul/li[11]/a")
		private WebElement ampersand;
	
		public void ampersand_link() {
			ampersand.click();
	}
		@FindBy(xpath="//div[1]/ul/li[12]/a")
		private WebElement flight;
	
		public void flight_link() {
			flight.click();
	}
		
//
		
		@FindBy(xpath="//div[1]/ul/li[13]/a")
		private WebElement vue_js;
	
		public void vue_js_link() {
			vue_js.click();
	}
		
		@FindBy(xpath="//div[1]/ul/li[14]/a")
		private WebElement marionette_js;
	
		public void marionette_js_link() {
			marionette_js.click();
	}
		@FindBy(xpath="//div[1]/ul/li[15]/a")
		private WebElement troop_js;
	
		public void troop_js_link() {
			troop_js.click();
	}
	

}
