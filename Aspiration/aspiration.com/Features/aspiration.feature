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

Feature: Aspiration Login
  
  Scenario: Spend and Save 
    Given I want launch chrome browser
   
    When I open aspiration home page
    
    Then I check products under Spend and Save
    Then I check two card products 
    Then I check email sign up
    Then I check Aspiration Plus monthly and yearly plan
    Then I check the monthly plan 
    Then I check the yearly plan 
    
    
    And close the browser
  