package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolTipsPage {
    public ToolTipsPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="toolTipButton")
    public WebElement toolTipButton;

    @FindBy(id="toolTipTextField")
    public WebElement toolTipTextField;

}
