
Feature: Customer login functionality

 // @Sanity
  Scenario: Verify Customer Home Page slogan Welcome david
    Given I am in landing page 
    When I Click on Login menu
    And Click on Customer Login
    Then Enter User Id 
    And I Enter Password 
    And I Click on Login Button
    Then Verify that I am in Home Page Slogan Welcome David
    
    
#called Test Step
#Gherkin Language - 
#which has few keywords ie. Feature, Scenario, Given, When, Then, And, * 
#Given - Precondition
