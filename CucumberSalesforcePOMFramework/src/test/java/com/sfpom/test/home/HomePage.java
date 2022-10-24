package com.sfpom.test.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sfpom.test.base.BasePage;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver1) {
		super(driver1);
		
	}
	@FindBy(xpath="//span[@id='userNavLabel']")WebElement usemenu;
	@FindBy(xpath="//a[contains(text(),'Logout')]")WebElement logout;
	
	
	public String TitleOfTheHomePage() {
		String title=getTitleOfThePage();
		System.out.println("title of the page"+title);
		return title;
}
	
	public void userMenu() {
		clickElement(usemenu);
	}
	
	public void logOut() {
		clickElement(logout);
	}
}
