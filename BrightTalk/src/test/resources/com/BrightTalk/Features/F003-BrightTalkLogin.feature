@Login
Feature: BrightTalk Login
  In order to view webcasts 
  As a user I want to login to 'BrightTalk'
  I want to use my valid Credentials to login
  	
Background: I navigated to 'Brighttalk Page'
Given  I have Url 'BrightTalk - URL' - "https://www.brighttalk.com/"
 
@happypath 		
Scenario: login with Valid credentials
Given I am in home page
When  I click login 'button'
And I gave 'Email' - "testuser@gmail.com", 'password' - "password"
And I press loginbutton to 'logintoApp'
Then I should See "Welcome to BrightTALK. Get started by exploring BrightTALK for relevant videos and webinars. As you subscribe to channels this feed will populate with relevant content."

@unhappypath
Scenario: login with inValid credentials
Given I am in home page
When  I click login 'button'
And I gave 'Email' - "test@gmail.com", 'password' - "password"
And I press loginbutton to 'logintoApp'
Then I should See "Invalid Credetials"

@invalidEmail
Scenario: login with invalid e-mail ID
Given I am in home page
When  I click login 'button'
And I gave 'Email' - "test", 'password' - "password"
And I press loginbutton to 'logintoApp'
Then I should See "Not Valid E-mail"