@Api
Feature: Title of your feature
  I want to use this template for my feature file
	
	@ignore
  @GetWithoutParams
  Scenario: User should be able to get all the employees
    When User send a get request to "/api/users"
    Then User should get status code "200"
    And Response data should have an email

  @GetWithParams
  Scenario: User should be able to get an id
  Given User send an id "2"
    When User send a get request to "/api/users"
    Then User should get status code "200"
    And Response data should be a json
