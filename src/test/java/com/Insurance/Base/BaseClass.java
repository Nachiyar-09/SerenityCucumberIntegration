package com.Insurance.Base;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    @Managed(uniqueSession = true)
    WebDriver browser;
}
