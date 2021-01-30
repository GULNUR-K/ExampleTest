package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePickerPage {

    public DatePickerPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="datePickerMonthYearInput")
    public WebElement datePickerMonthYearInput;

    @FindBy(id="droppable")
    public WebElement droppable;
}
