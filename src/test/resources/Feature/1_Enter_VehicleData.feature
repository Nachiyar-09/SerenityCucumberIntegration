@VehicleData
Feature: To verify the Vehicle data functionality in the application
  Scenario: Check for all possible scenarios with vehicle data page
    Given User navigates to the applications
    When User clicks on the Motorcycle option from the header respective fields should be displayed
    And User should select a value as "Ford" Make dropdown
    And User should select value as "Three-Wheeler" Model dropdown
    And user should enter values as "500"  cylinder capacity field
    And User must enter value as "500" engine performance field
    And user should select date as "12/15/1993" DOM field
    And user should able select a value "2" from seats drop down
    And User should enter a value as"1000" in List price field
    And User should enter value as "1000" in Annual Mileage field
    Then user should able to click on the next button