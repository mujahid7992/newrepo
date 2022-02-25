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
Feature: Login
  Scenario: Login
    Given i launch fb application
    And click on login
    When enter "valid" user name 
    And enter "valid" password
    And click on login button
    Then user "shouldbe" able to login successfully
    
    
  Scenario: Login with invalid credentials
    Given i launch fb application
    And click on login
    When enter "invalid" user name 
    And enter "invalid" password
    And click on login button
    Then user "shouldbe" able to login successfully
   

 