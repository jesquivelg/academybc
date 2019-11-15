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
Feature: Login Feature
  As a user i should be able to log in so i can see my profile page

  @ValidLogin
  Scenario: As a user i should be able to log in with valid credentials
     
    Given User click on Sign in
    When User enters valid email address "aa@aaa.com"
    And User enters valid password "askldkas"
    And User clicks Sign in
    Then User should be in profile page

@InvalidCredentials
  Scenario: As a user i should not be able to log in with invalid credentials
    Given User click on Sign in
    When User enters invalid email address "oli@aaa.com"
    And User enters invalid password "12345"
    And User clicks Sign in
    Then User see authentication failed error
 
@BlankCredentials
  Scenario: As a user i should not be able to log in without credentials
    Given User click on Sign in
    When User clicks Sign in
    Then User see authentication failed error
    
@InvalidEmail
  Scenario: As a user i should not be able to log in with blank email
    Given User click on Sign in
    When User enters invalid password "askldkas"
    And User clicks Sign in
    Then User see email is needed error "An email address required."
    
@InvalidPassword
  Scenario: As a user i should not be able to log in with blank password
    Given User click on Sign in
    When User enters invalid email address "aa@aaa.com"
    And User clicks Sign in
    Then User see email is needed error "Password is required."    
