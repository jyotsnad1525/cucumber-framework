package com.sfpom.test.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sfpom.test.base.BasePage;

public class ForgotPassWordPage extends BasePage {
	public ForgotPassWordPage (WebDriver driver){
		super(driver);
	}
	@FindBy(xpath="//input[@id='un']")WebElement userid;
    @FindBy(xpath="//input[@id='continue']")WebElement cont;
    @FindBy(xpath="//h1[@id='header']")WebElement message;

     public void UserID() {
	 enterText(userid,"jyo@teckarch.com");

 }
     public void continueClick() {
    	 clickElement(cont);
     }
     
     public void validateMessage() {
    	 validateText(message,"Check Your Email");
     }
 }