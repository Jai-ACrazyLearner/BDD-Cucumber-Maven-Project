@Signup
Feature:  Signup For bright Talk Account
  In order to show what BrightTalk can offer to BroadCaster to target Audiences
  As a user visted to 'BrightTalk'
  I want to signup for the account to view and share content 
  	
Background: I want to signUp
Given  I have Url 'BrightTalk - URL' - "https://www.brighttalk.com/"
  			
  			
Scenario: Signup for first time with valid Email ID
Given  I go to the signup page
And I fill in the following:  
	| First name 		| Fname 					|
	| Last name 		| Lname						|
	| Time Zone 		| United States - New York 	|
	| Email 			| testinguser@gmail.com		|
	| Password 			| testpassword 				|
	| Confirm password 	| testpassword 				|
When I press button 'Proceeed'	
Then I should see "BrightTALK webinars and videos"

Scenario: Signup with the wrongfromat emil-id with valid Email ID
Given  I go to the signup page
And I fill in the following:  
	
	| First name 		| Fname 					|
	| Last name 		| Lname						|
	| Time Zone 		| United Kingdom - London 	|
	| Email 			| testinguser@gmail.com		|
	| Password 			| testpassword 				|
	| Confirm password 	| testpassword 				|
	
When I press button 'Proceeed'
Then I should see "given Email is Alredy Registered please try with new E-mail id"
