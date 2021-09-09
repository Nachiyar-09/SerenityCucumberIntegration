package com.Insurance.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class EnterVehicleDataPage extends PageObject {
    @Step
    public void HitTheMotorCycleLink() {

        $("#nav_motorcycle").click();
    }
    @Step
    public String VerifyTabTitle() {
        String CurrentTabName = $("#entervehicledata").getText();
        return CurrentTabName;
    }
    @Step
    public void SelectMakeValueFromDrpDwn(String MakeValueTobeSelected) {
        $("#make").selectByVisibleText(MakeValueTobeSelected);
    }
    @Step
    public void SelectModelValueFromDrpDwn(String ModelValueTobeSelected) {
        $("#model").selectByVisibleText(ModelValueTobeSelected);
    }
    @Step
    public void EnterValueInCylinderCapacity(String CylinderCapacity) {
        $("#cylindercapacity").sendKeys(CylinderCapacity);
    }
    @Step
    public void EnterValueInEnginePerformance(String EnginePerf) {

        $("#engineperformance").sendKeys(EnginePerf);
    }
    @Step
    public void SelectDateFromDatePicker(String DateOfManufacture) {
        $("#dateofmanufacture").sendKeys(DateOfManufacture);
    }
    @Step
    public void EnterValueInLastPriceField(String ListPrice) {
        $("#listprice").sendKeys(ListPrice);
    }
    @Step
    public void EnterValueInAnnualMileageField(String AnnualMileage) {
        $("#annualmileage").sendKeys(AnnualMileage);
    }
    @Step
    public void ClickNextButton() {
        $("#nextenterinsurantdata").click();
    }

    @Step
    public void selectNumberOfSeats(String seats) {
        $("#numberofseatsmotorcycle").sendKeys(seats);
    }


}

