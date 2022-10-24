package com.sfpom.test.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sfpom.test.base.BasePage;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver){
		super(driver);
	}
    @FindBy(id="username")WebElement username;
    @FindBy(id="password")WebElement password;
    @FindBy(xpath="//input[@id='Login']")WebElement loginbutton;
    @FindBy(id="error")WebElement errormessage;
    @FindBy(xpath="//input[@id='rememberUn']")WebElement checkbox;
    @FindBy(xpath="//span[@id='idcard-identity']")WebElement username1;
	@FindBy(id="error")WebElement error;
	@FindBy(xpath="//a[@id='forgot_password_link']")WebElement forgotpassword;
	
	public void enterUsername(String usrname) {
		enterText(username,usrname);
	}
	
	public void enterPassword(String passwrd) {
		enterText(password,passwrd);
	}
	
	public void clickLogin() {
		clickElement(loginbutton);
	}
	
	public void readErrormessage() {
		validateText(errormessage,"Please enter your password.");
	}
	
	public void checkBox() {
		clickElement(checkbox);
		}
	public void UsernameVerify() {
		validateText(username1,"jyo@teckarch.com");
	}
	
	public void errorMessage() {
		validateText(error,"Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
	}
	public void forgotPW() {
		clickElement(forgotpassword);
	}
	
}
