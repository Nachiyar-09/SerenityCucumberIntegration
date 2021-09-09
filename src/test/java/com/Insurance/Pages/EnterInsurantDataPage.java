package com.Insurance.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class EnterInsurantDataPage extends PageObject {
    @Step
    public String VerifyInsurantTabTitle() {
        $("#enterinsurantdata").click();
        String CurrentTabName = $("#enterinsurantdata").getText();
        return CurrentTabName;
    }
    @Step
    public void EnterFirstname(String firstname) {

        $("#firstname").sendKeys(firstname);
    }
    @Step
    public void EnterLastName(String LastName) {

        $("#lastname").sendKeys(LastName);
    }
    @Step
    public void PickTheDOBFromPicker(String DOB) {

        $("#birthdate").sendKeys(DOB);
    }
    @Step
    public String SelectValueFromGender(String gender) {
        $("#//input[@name='Gender']/parent::label").sendKeys(gender);
        return gender;
    }
    @Step
    public void EnterValuesInStreetAddress(String StreetAddress) {

        $("#streetaddress").sendKeys(StreetAddress);
    }
    @Step
    public void SelectValueFromCountryDrpDown(String Country) {

        $("#country").sendKeys(Country);
    }
    @Step
    public void EnterValueInZipCode(String ZipCode) {

        $("#zipcode").sendKeys(ZipCode);
    }
    @Step
    public void EnterValueInCity(String City) {

        $("#city").sendKeys(City);
    }
    @Step
    public void SelectValueFromOccupationDrpDwn(String Occupation) {
        $(
                "#occupation").sendKeys(Occupation);
    }
    @Step
    public void EnterValueInWebSite(String WebSite) {

        $("#website").sendKeys(WebSite);
    }
    @Step
    public void SelectHobbiesFromCheckBox(String Hobbies) {
        $("#//*[@id=\\\"insurance-form\\\"]/div/section[2]/div[10]/label").sendKeys(Hobbies);
    }
    @Step
    public void ClickNextButton() {

        $("#nextenterproductdata").click();
    }
}
