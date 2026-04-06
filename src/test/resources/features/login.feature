Feature: Login Functionality
	
	Background:
		Given user is on login page
		When user enters username "standard_user" 
		And  user enters password "secret_sauce"
		And user clicks login button

	@smoke
	Scenario: valid login
			Then user should navigate to home page
	@regression @smoke
	Scenario: valid login_validpasword
		Then user should navigate to home page	
	@smoke	
	Scenario: valid login_invalidpasword
		Then user should navigate to home page	
		
	Scenario Outline: Login with multiple users
		
		Then user should navigate to home page
	Examples:
	|username        |  password      | 
	|  standard_user |  secret_sauce | 
	|  standard_user |  standard_user1 | 		