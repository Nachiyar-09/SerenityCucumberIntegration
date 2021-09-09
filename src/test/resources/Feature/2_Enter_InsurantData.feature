@InsurantData
Feature: To test the components present in this insurance data tab
  Scenario: Insurance data tab under test
    Given User should be navigated to insurance data page
    And user should enter value as "Raghul" first name field
    And use should enter values as "Kumar"  last name field
    And user should select date as "12/15/1993" DOB datePicker
    And user should enter values as "Ruby Homes" address field
    And user should select values as "India" country dropdown
    And user should enter values as "123456" zipcode field
    And user should enter values as "Chennai" city field
    And user should select values as "Farmer" occupation dropdown field
    And user should enter values as "www.google.com" website field
    Then user should click on the NEXT button available