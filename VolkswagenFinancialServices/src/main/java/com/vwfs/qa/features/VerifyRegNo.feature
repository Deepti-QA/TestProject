@AcceptanceCriteriaTest 
Feature: VWFS Vehicle Registration Number Check 
 
Scenario Outline: Verify Vehicle Registration Number 

	Given the user launches the browser 
	And User is on Dealer Portal page 
	When user enters the vehicle reg number as "<RegNumber>" 
	Then user should be able to see "<Result>" 
	Then close browser 
	
	
	Examples: 
		|RegNumber|Result                     |
		|OV12UYY  |Result for : OV12UYY       |
		|OV12UY   |Sorry record not found     |
		
		
