package com.Insurance.ResusableComponent;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CommonMethods extends PageObject {

    public Object selectRadioButton;

    @Step
    public static void selectDropDownAction(WebElement element, String ValueToBeSelected) throws Exception {
        Select sel = new Select(element);
        try {
            sel.selectByVisibleText(ValueToBeSelected);
        } catch (Exception e) {
            throw new Exception("value not present in WebElement");
        }
    }
  @Step
    public static void selectCheckBoxOption(List<WebElement> element, String check) {
        String[] Arraycheck = check.split(",");
        for (String str : Arraycheck) {
            for (WebElement ele : element) {
                if (ele.getText().equalsIgnoreCase(str)) {
                    ele.click();
                    break;
                }
            }
        }
    }
          @Step
    public static void selectRadioButton(List<WebElement> element, String valueToBeSelected) {
        for (WebElement ele : element)
            if (ele.getText().equalsIgnoreCase(valueToBeSelected)) {
                ele.click();
                break;
            }
    }
}
