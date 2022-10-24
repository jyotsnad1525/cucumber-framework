package com.salesforcepom.steps;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sfpom.test.home.HomePage;

import com.sfpom.test.login.ForgotPassWordPage;
import com.sfpom.test.login.LoginPage;

import commonutilities.CommonUtilities;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SFPOMStepdef {
	
	  WebDriver driver; 
	  LoginPage login; 
	  HomePage home;
	  ForgotPassWordPage forgotpw;
	  

		/*
		 * CommonUtilities CU=new CommonUtilities(); Properties
		 * applicationPropertiesFile=CU.loadFile("applicationProperties"); String url=
		 * CU.getApplicationProperty("url",applicationPropertiesFile); String username=
		 * CU.getApplicationProperty("username", applicationPropertiesFile); String
		 * password= CU.getApplicationProperty("password", applicationPropertiesFile);
		 * String Emppassword=CU.getApplicationProperty("emptypassword",
		 * applicationPropertiesFile);
		 */
	  @Before(order=0) public void setUp1() {
	  WebDriverManager.chromedriver().setup(); driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  }
	 

	@Given("User open salesforce application")
	public void user_open_salesforce_application() {
	  driver.get("https://login.salesforce.com/");
	}

	@When("User on {string}")
	public void user_on(String page) {
		 if(page.equalsIgnoreCase("loginpage"))
		    	login=new LoginPage(driver);
		    else if(page.equalsIgnoreCase("homepage"))
		    	home=new HomePage(driver);
	}

	@When("User enters value into text box username as {string}")
	public void user_enters_value_into_text_box_username_as(String string) {
		login.enterUsername("jyo@techarch.com");
	}
	@When("user not enters value into text box password {string}")
	public void user_not_enters_value_into_text_box_password(String string) {
	   login.enterPassword(" ");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		login.clickLogin();
		System.out.println("login button clicked");
	}

	@Then("user should get the error message as {string}")
	public void user_should_get_the_error_message_as(String string) {
	    login.readErrormessage();
	}
	@When("User enters value into text box password as {string}")
	public void user_enters_value_into_text_box_password_as(String string) {
	   login.enterPassword("abcdefg1234");
	    
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() {
	   home.TitleOfTheHomePage();
	}
	
	@When("clicks on {string}")
	public void clicks_on(String string) {
	    login.clickLogin();
	}

	@When("User clicks on {string}")
	public void user_clicks_on(String string) {
	    login.checkBox();
	}

	@Then("verify {string} displayed")
	public void verify_displayed(String string) {
	    login.UsernameVerify();
	}
	@Then("verify error message displayed")
	public void verify_error_message_displayed() {
	 login.errorMessage();
	}
	@When("User enter value into {string}")
	public void user_enter_value_into(String string) {
	 forgotpw.UserID();
	}

	@When("User click on {string}")
	public void user_click_on(String string) {
	    forgotpw.continueClick();
	}

	@Then("Verify {string} displayed")
	public void verify_displayed1(String string) {
	  forgotpw.validateMessage();
	}



}
