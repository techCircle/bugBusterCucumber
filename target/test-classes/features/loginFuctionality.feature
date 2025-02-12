Feature: User Login Tests


Scenario: Successful login with valid credentials
					When the user enters the correct username and password
					And the user clicks on the login button
					Then the user is redirected to the homepage
					And a welcome message is displayed
					
					

Scenario: Unsuccessful login with invalid credentials
					When the user enters an incorrect username or password
					And the user clicks on the login button
					Then an error message is displayed