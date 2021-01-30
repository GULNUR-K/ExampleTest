package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalDialogsPage {

    public ModalDialogsPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="showSmallModal")
    public WebElement showSmallModal;

    @FindBy(xpath = "//div[@class='modal-body']")
    public WebElement modalBody;

    @FindBy(id = "closeSmallModal")
    public WebElement closeSmallModal;

}
