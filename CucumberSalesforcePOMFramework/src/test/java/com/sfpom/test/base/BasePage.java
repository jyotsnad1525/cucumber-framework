package com.sfpom.test.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	
	public BasePage(WebDriver driver1) {
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	
	
	public static void closeDriver() {
		driver.close();
	}
	
	public static void closeAllDriver() {
		driver.quit();
	}
	
	public static void enterText(WebElement element,String text) {
		waitUntilVisible(element);
		if(element.isDisplayed()) {
			clearElement(element);
			element.sendKeys(text);
			System.out.println("pass: text entered");
			
		}
		else {
			System.out.println("fail: element not displayed");
		}
	}
	public static void clickElement(WebElement element) {
		if(element.isDisplayed()) {
			element.click();
			System.out.println("pass: element clicked");
		}
		else {
			System.out.println("fail: element not displayed");
		}
	}
	
	public static void clearElement(WebElement element) {
		if(element.isDisplayed()) {
			element.clear();
			System.out.println("pass: element cleared");
		}
		else {
			System.out.println("fail: element not displayed");
		}
	}

	
	public static void selectByTextData(WebElement element,String text) {
		Select selectCity = new Select(element);
		selectCity.selectByVisibleText(text);
		
	}
	public static void selectByIndexData(WebElement element,int index) {
		Select selectCity = new Select(element);
		selectCity.selectByIndex(index);
	}
	public static void selectByValueData(WebElement element,String text) {
		Select selectCity = new Select(element);
		selectCity.selectByValue(text);
	}
	
	public static String getTitleOfThePage() {
		return driver.getTitle();
	}
	
	public static void waitUntilVisibilityOf(By locator, String objName) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	
	
	}
	public static void waitUntilVisible(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void validateText(WebElement element,String expectedText) {
		String text=element.getText();
		System.out.println("text obtained is " +text);
		if(text.contains(expectedText)) {
			System.out.println("expected text is  obtained");
		}else {
			System.out.println("expected text is not  obtained");
		}
	
	
	
	
	
	
	
	}
	
}
