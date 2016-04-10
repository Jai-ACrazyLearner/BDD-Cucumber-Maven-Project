@contentExplorer
Feature: BrightTalk Communities
  In order to show what BrightTalk can offer to BroadCaster to target Audiences
  As a user visted to 'BrightTalk'
  I want to see list of "DepartMents" so that I can select suited bright talk Community
  	
  	Background: I navigated to 'Brighttalk Page'
  		Given  I have Url 'BrightTalk - URL' - "https://www.brighttalk.com/"	
  				
	@VerifyingAsValidPage
	Scenario: As a user I want to be in BrightTalk Home Page	
		Given I am on the Brightlak home page
		When I See the page
		Then I should see displayed 'image' file with 'id' logo "brighttalkhomepage/images/logo-transparent"
		Then Under the 'span' tag I should see 'display' text saying "minutes of professional ideas and insights shared on BrightTALK"
		
	@VerifyingExploreContentModules
	Scenario: As a user I want to see list of 'BrightTalk Communities'	
		Given I am on the Brightlak home page
		When I click link 'ExploreContent' button 'id' - "exploreCommunitiesLink"
		Then I should see all list of Comunities 
	

					
		
		
		
				
				
				 
		
		
	 	
	  	
		
		
		
		