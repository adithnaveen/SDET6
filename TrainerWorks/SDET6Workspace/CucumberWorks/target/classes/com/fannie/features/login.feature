@Smoke
Feature: 
			login feature 
			
Scenario: 
	Given Browser is open  
	When user name and password is entered
	|		username		|		password		|  designation   |
	|		harry						| 	peter					|  engineer				|
	|		ben							|  password		|  team leader		|
	|		gayathri				|		hello					|  business analyst |
	And click on submit 
	Then Validate the user details 

	
	
	