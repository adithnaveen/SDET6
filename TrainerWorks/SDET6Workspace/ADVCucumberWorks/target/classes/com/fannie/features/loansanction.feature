@Sanity
Feature: 
		To sanction loan for working people 

# hooks are the business logic which runs before scenario's
# These are local only to the feature file 
Background: 
	Given documents are submitted 
	
Scenario Outline: 
		# Given When Then And But 
		Given the customer works "<workTime>" time
		And working in "<officeType>" office
		# this for showing you datatable 
		When credit score is more than "<cs>"
		Then Sanction loan
		But customer has to repay with in "<repayYear>" years

# this is my comment 
Examples:
|		workTime			|			officeType				|						cs			|				repayYear			|
|			full						|				govt							| 		500					|    			20								|
|			full						|       private					|      567				|        17								|
|     part          |				govt						  | 		679					| 	       15							| 
