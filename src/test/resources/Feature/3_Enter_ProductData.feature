@ProductData
Feature: To test the components available under product data
  Scenario: Enter Product data under test
    Given User should able to navigate to product data tab upon clicking next button from insurance data tab
    And User should able to select "07/11/2021" from the start date picker option
    And user should select "7.000.000,00" option from the Insurance sum dropdown field
    And user should select "Partial Coverage" option from the damage insurance dropdown
    Then user should click on the NEXT button available in the page