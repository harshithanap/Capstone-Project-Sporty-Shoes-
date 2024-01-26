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
Feature: Delete a shoe from the store
  I want to test the functionality of deleting a shoe from the store

  @tag1
  Scenario: Delete a shoe from the website Given Open the API base URL
    And there is an existing shoe with ID 101
    When hit the DELETE request for the shoe with ID 101 Then the response code should be 200
    And the response should indicate successful deletion
