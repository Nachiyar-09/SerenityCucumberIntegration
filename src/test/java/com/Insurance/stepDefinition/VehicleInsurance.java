package com.Insurance.stepDefinition;

import com.Insurance.Base.BaseClass;
import com.Insurance.Pages.EnterInsurantDataPage;
import com.Insurance.Pages.EnterProductDataPage;
import com.Insurance.Pages.EnterVehicleDataPage;
import com.Insurance.ResusableComponent.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class VehicleInsurance extends BaseClass {
    @Managed(uniqueSession = true)
    WebDriver browser;

    @Steps
    CommonMethods commonMethods;
    @Steps
    EnterVehicleDataPage vehicleDataPage;
    @Steps
    EnterInsurantDataPage insurantDataPage;
    @Steps
    EnterProductDataPage productDataPage;



    @Given("User navigates to the applications")
    public void userNavigatesToTheApplications() {

        vehicleDataPage.open();
    }

    @When("User clicks on the Motorcycle option from the header respective fields should be displayed")
    public void userClicksOnTheMotorcycleOptionFromTheHeaderRespectiveFieldsShouldBeDisplayed() {
        vehicleDataPage.HitTheMotorCycleLink();
    }

    @And("User should select a value as {string} Make dropdown")
    public void userShouldSelectAValueAsMakeDropdown(String MakeValueTobeSelected) {
        vehicleDataPage.SelectMakeValueFromDrpDwn(MakeValueTobeSelected);
    }

    @And("User should select value as {string} Model dropdown")
    public void userShouldSelectValueAsModelDropdown(String ModelValueTobeSelected) {
        vehicleDataPage.SelectModelValueFromDrpDwn(ModelValueTobeSelected);
    }

    @And("user should enter values as {string}  cylinder capacity field")
    public void userShouldEnterValuesAsCylinderCapacityField(String CylinderCapacity) {
        vehicleDataPage.EnterValueInCylinderCapacity(CylinderCapacity);
    }

    @And("User must enter value as {string} engine performance field")
    public void userMustEnterValueAsEnginePerformanceField(String EnginePerf) {
        vehicleDataPage.EnterValueInEnginePerformance(EnginePerf);
    }

    @And("user should select date as {string} DOM field")
    public void userShouldSelectDateAsDOMField(String DateOfManufacture) {
        vehicleDataPage.SelectDateFromDatePicker(DateOfManufacture);
    }

    @And("user should able select a value {string} from seats drop down")
    public void userShouldAbleSelectAValueFromSeatsDropDown(String seats) {
        vehicleDataPage.selectNumberOfSeats(seats);
    }

    @And("User should enter a value as{string} in List price field")
    public void userShouldEnterAValueAsInListPriceField(String ListPrice) {
        vehicleDataPage.EnterValueInLastPriceField(ListPrice);
    }

    @And("User should enter value as {string} in Annual Mileage field")
    public void userShouldEnterValueAsInAnnualMileageField(String AnnualMileage) {
        vehicleDataPage.EnterValueInAnnualMileageField(AnnualMileage);
    }

    @Then("user should able to click on the next button")
    public void userShouldAbleToClickOnTheNextButton() {
        vehicleDataPage.ClickNextButton();
    }


    // ------------User will provide values in the Insurant data ------------------------//

    @Given("User should be navigated to insurance data page")
    public void userShouldBeNavigatedToInsuranceDataPage() {
        vehicleDataPage.open();

        vehicleDataPage.HitTheMotorCycleLink();
        insurantDataPage.VerifyInsurantTabTitle();
    }

    @And("user should enter value as {string} first name field")
    public void userShouldEnterValueAsFirstNameField(String firstname) {

        insurantDataPage.EnterFirstname(firstname);
    }

    @And("use should enter values as {string}  last name field")
    public void useShouldEnterValuesAsLastNameField(String LastName) {
        insurantDataPage.EnterLastName(LastName);
    }

    @And("user should select date as {string} DOB datePicker")
    public void userShouldSelectDateAsDOBDatePicker(String DOB) {
        insurantDataPage.PickTheDOBFromPicker(DOB);
    }

  /*  @And("user should select values from the available {string} gender option")
    public void userShouldSelectValuesFromTheAvailableGenderOption(String gender) {
        insurantDataPage.SelectValueFromGender(gender);
        //commonMethods.selectRadioButton
    }*/

    @And("user should enter values as {string} address field")
    public void userShouldEnterValuesAsAddressField(String StreetAddress) {
        insurantDataPage.EnterValuesInStreetAddress(StreetAddress);
    }

    @And("user should select values as {string} country dropdown")
    public void userShouldSelectValuesAsCountryDropdown(String Country) {
        insurantDataPage.SelectValueFromCountryDrpDown(Country);
    }

    @And("user should enter values as {string} zipcode field")
    public void userShouldEnterValuesAsZipcodeField(String ZipCode) {
        insurantDataPage.EnterValueInZipCode(ZipCode);
    }

    @And("user should enter values as {string} city field")
    public void userShouldEnterValuesAsCityField(String City) {
        insurantDataPage.EnterValueInCity(City);
    }

    @And("user should select values as {string} occupation dropdown field")
    public void userShouldSelectValuesAsOccupationDropdownField(String Occupation) {
        insurantDataPage.SelectValueFromOccupationDrpDwn(Occupation);
    }

   /* @And("user should select the values as {string} hobbies checkbox field")
    public void userShouldSelectTheValuesAsHobbiesCheckboxField(String Hobbies) {
        insurantDataPage.SelectHobbiesFromCheckBox(Hobbies);
    }*/

    @And("user should enter values as {string} website field")
    public void userShouldEnterValuesAsWebsiteField(String WebSite) {
        insurantDataPage.EnterValueInWebSite(WebSite);
    }

    @Then("user should click on the NEXT button available")
    public void userShouldClickOnTheNEXTButtonAvailable() {
        insurantDataPage.ClickNextButton();
    }




    // ------------------User now provides value in the Product data fields------------------------//

    @Given("User should able to navigate to product data tab upon clicking next button from insurance data tab")
    public void userShouldAbleToNavigateToProductDataTabUponClickingNextButtonFromInsuranceDataTab() {
        vehicleDataPage.open();

        vehicleDataPage.HitTheMotorCycleLink();
        productDataPage.VerifyProductTabTitle();
    }

    @And("User should able to select {string} from the start date picker option")
    public void userShouldAbleToSelectFromTheStartDatePickerOption(String StartDate) {
        productDataPage.SelectStartDateFromPicker(StartDate);
    }

    @And("user should select {string} option from the Insurance sum dropdown field")
    public void userShouldSelectOptionFromTheInsuranceSumDropdownField(String InsuranceSum) {
        productDataPage.SelectInsuranceSumFromDrpDwn(InsuranceSum);
    }

    @And("user should select {string} option from the damage insurance dropdown")
    public void userShouldSelectOptionFromTheDamageInsuranceDropdown(String DamageInsurance) {
        productDataPage.SelectDamageInsuranceFromDrpDwn(DamageInsurance);
    }

   /* @And("user should select {string} from the optional products check box available")
    public void userShouldSelectFromTheOptionalProductsCheckBoxAvailable(String OptionalProduct) {
        productDataPage.SelectValueFromOptionalProduct(OptionalProduct);
    }*/

    @Then("user should click on the NEXT button available in the page")
    public void userShouldClickOnTheNEXTButtonAvailableInThePage() {
        productDataPage.ClickNextButton();
    }

}

