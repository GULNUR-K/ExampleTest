package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage extends BasePage{

    public AlertPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="timerAlertButton")
    public WebElement timerAlertButton;
}
