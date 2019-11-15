#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Cart Feature
	As a user i should be able to add items to my cart
	
  @AddItemsCart
  Scenario: As a user i should be able to add items to my cart
  	Given User should be logged 
  	When User click on women
    And User click add an article to cart
    And User click proceed to checkout
    Then User should see one item in cart "1 Product"

    
    