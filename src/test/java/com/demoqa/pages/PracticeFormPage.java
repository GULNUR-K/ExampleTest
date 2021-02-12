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

    @FindBy(xpath="(//div[@class=' css-1hwfws3'])[1]")
    public WebElement state;

    @FindBy(css = ".css-26l3qy-menu")
    public WebElement stateMenu;

    @FindBy(xpath = "(//div[@class=' css-1wy0on6'])[2]")
    public WebElement city;

    @FindBy(xpath="//div/button[text()='Submit']")
    public WebElement submit;

    @FindBy(xpath = "//div[@class='modal-title h4']")
    public WebElement alert;

    @FindBy(id="closeLargeModal")
    public WebElement closeLargeModal;

}