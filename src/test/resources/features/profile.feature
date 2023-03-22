Feature: Test Profile functionality

  Background:
	  Given user is on homepage of trello
Scenario: Check if profile can be accessed
	When user clicks on the profile
	Then user should see account options



