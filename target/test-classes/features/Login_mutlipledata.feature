Feature: Login Functionality with multiple sets of data
	
	Scenario Outline: Login with multiple users
		Given user is on login page
		When user enters username "<username>" 
		And user enters password "<password>"
		And user clicks login button
		Then user should navigate to home page
	Examples:
	|username        |  password      | 
	|  standard_user |  secret_sauce | 
	|  standard_user |  standard_user1 | 
