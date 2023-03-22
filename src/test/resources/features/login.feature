Feature: Test login functionality

Scenario: Check login is successful with valid credentials
	Given user is on login page
	When user enters email "callumgill99@outlook.com"
	And user clicks continue
	And user enters password "Test1234"
	Then user navigated to the home

Scenario: Check login is unsuccessful with invalid credentials
	Given user is on login page
	When user enters email "callumgill99@outlook.com"
	And user clicks continue
	And user enters incorrect password "Test12345"
	Then user is shown incorrect message

