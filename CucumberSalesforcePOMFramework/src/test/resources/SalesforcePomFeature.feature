
Feature: Login to salesforce application
 Background: 
  Given User open salesforce application
  
  Scenario: Login with valid username and empty password
   
    When User on "LoginPage"
    When User enters value into text box username as "jyo@teckarch.com"
    When user not enters value into text box password " "
    When clicks on "login button"
    Then user should get the error message as "Please enter your password"
    
   Scenario: Login with valid credentials
   
   When User on "LoginPage"
   When User enters value into text box username as "jyo@teckarch.com"
   When User enters value into text box password as "abcdefg1234"
   When clicks on "login button" 
   When User on "HomePage"
   Then home page is displayed
   
  Scenario:check Remember Me
  When User on "LoginPage"
  When User enters value into text box username as "jyo@teckarch.com"
  When User enters value into text box password as "abcdefg1234"
  When User clicks on "Remember me check box"
  When clicks on "login button"
  When User on "HomePage"
  When User clicks on "User Menu"
  When User clicks on "Logout"
  When User on "LoginPage"
  Then verify "Username" displayed
  
  Scenario:Wrong login credentials
  When User on "LoginPage"
  When User enters value into text box username as "jyo@teckarch.com"
  When User enters value into text box password as "wrongpassword"
  When clicks on "login button" 
  Then verify error message displayed
   
   Scenario:Forgot password
   When User on "LoginPage"
   When User clicks on "ForgotPassword"
   When User enters value into text box username as "jyo@teckarch.com"
   When User click on "Continue"
   Then Verify "conformation message" displayed
   
   
   
   
   
   
   
   
   
  