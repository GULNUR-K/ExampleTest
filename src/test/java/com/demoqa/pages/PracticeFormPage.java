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

    @FindBy(id="lastName")
    public WebElement lastName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(id="userNumber")
    public WebElement userNumber;

    @FindBy(id="dateOfBirthInput")
    public WebElement dateOfBirthInput;

    @FindBy(id="subjectsInput")
    public  WebElement subjectsInput;

    @FindBy(id="currentAddress")
    public  WebElement currentAddress;

    @FindBy(xpath="//div/label[@for='gender-radio-1']")
    public WebElement genderRadio1;

    @FindBy(xpath="//div/label[@for='gender-radio-2']")
    public WebElement genderRadio2;

    @FindBy(xpath="//div/label[@for='gender-radio-3']")
    public WebElement genderRadio3;

    @FindBy(xpath="//div/label[@for='hobbies-checkbox-1']")
    public WebElement hobbiesCheckbox1;

    @FindBy(xpath="//div/label[@for='hobbies-checkbox-2']")
    public WebElement hobbiesCheckbox2;

    @FindBy(xpath="//div/label[@for='hobbies-checkbox-3']")
    public WebElement hobbiesCheckbox3;

    @FindBy(id="uploadPicture")
    public  WebElement uploadPicture;

    @FindBy(xpath=" (//div[@class=' css-1hwfws3'])[1]")
    public  WebElement state;

    @FindBy(id="submit")
    public WebElement submit;

    @FindBy(xpath = "//div[@class='modal-title h4']")
    public WebElement allert;

    @FindBy(id="closeLargeModal")
    public WebElement closeLargeModal;


    public void login(String userNameStr, String passwordStr) {
        //this.userName.sendKeys(userNameStr);
        //this.password.sendKeys(passwordStr);
        //this.submit.click();
        // verification that we logged
    }
}