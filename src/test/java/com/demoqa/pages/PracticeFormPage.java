package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeFormPage {

    public PracticeFormPage(){
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(id="firstName")
    public WebElement firstName;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement submit;

    @FindBy(xpath = "//head/title[.='ToolsQA']")
    public  WebElement subTitle;

    public void login(String userNameStr, String passwordStr) {
        //this.userName.sendKeys(userNameStr);
        this.password.sendKeys(passwordStr);
        this.submit.click();
        // verification that we logged
    }
}