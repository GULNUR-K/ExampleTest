package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DroppablePage {

    public DroppablePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="draggable")
    public WebElement draggable;

    @FindBy(id="droppable")
    public WebElement droppable;
}
