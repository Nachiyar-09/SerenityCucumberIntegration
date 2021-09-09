package com.Insurance.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class EnterProductDataPage extends PageObject {
    @Step
    public String VerifyProductTabTitle() {
        $("#enterproductdata").click();
        String CurrentTabName = $("#enterproductdata").getText();
        return CurrentTabName;
    }
    @Step
    public void SelectStartDateFromPicker(String StartDate) {

        $("#startdate").sendKeys(StartDate);
    }
    @Step
    public void SelectInsuranceSumFromDrpDwn(String InsuranceSum) {
        $("#insurancesum").selectByVisibleText(InsuranceSum);
    }
    @Step
    public void SelectDamageInsuranceFromDrpDwn(String DamageInsurance) {
        $("#damageinsurance").sendKeys(DamageInsurance);
    }
   /* @Step
    public void SelectValueFromOptionalProduct(String OptionalProduct) {
        $("#//input[@name='Optional Products[]']/parent::label").sendKeys(OptionalProduct);
    }*/
   @Step
   public void ClickNextButton() {

            $("#nextselectpriceoption").click();
        }
    }
