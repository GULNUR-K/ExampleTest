package com.demoqa.step_definitions;

import com.demoqa.pages.AlertPage;
import com.demoqa.utilities.BrowserUtils;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertStepPage {

    WebDriver driver;

    @Given("the user is on the alert page")
    public void the_user_is_on_the_alert_page() {
        String url2 = ConfigurationReader.get("url2");

        Driver.get().get(url2);

        String actualTitle = Driver.get().getCurrentUrl();

        Assert.assertTrue(actualTitle.contains("alerts"));
    }

    @Given("the user should be able to click second button")
    public void the_user_should_be_able_to_click_second_button() {

        new AlertPage().timerAlertButton.click();

        BrowserUtils.waitFor(5);
    }
    @Then("alert is displayed after five second")
    public void alert_is_displayed_after_second()  {

        BrowserUtils.waitFor(5);
        Alert alert = driver.switchTo().alert();

        Assert.assertEquals("This alert appeared after 5 seconds", alert.getText());

        alert.accept();
    }

    @Then("the user accept the alert")
    public void the_user_accept_the_alert() {

//        BrowserUtils.waitFor(3);
//        Alert alert = driver.switchTo().alert();
//
//        BrowserUtils.waitFor(3);
//
//        System.out.println("alert.getText() = " +alert.getText());
//        alert.accept();
//
//        BrowserUtils.waitFor(3);
    }

}
