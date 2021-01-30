package com.demoqa.step_definitions;

import com.demoqa.pages.DatePickerPage;
import com.demoqa.utilities.BrowserUtils;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

public class DatePickerStepDef {

    @Given("the user is on the Date Picker page")
    public void the_user_is_on_the_Date_Picker_page() {
        String url6 = ConfigurationReader.get("url6");
        Driver.get().get(url6);
        String actualTitle = Driver.get().getCurrentUrl();
        Assert.assertTrue(actualTitle.contains("date-picker"));
    }

    @Then("the user should be able to select a date using date picker from Select Date field")
    public void the_user_should_be_able_to_select_a_date_using_date_picker_from_Select_Date_field() {

        new DatePickerPage().datePickerMonthYearInput.click();

        BrowserUtils.waitFor(2);

        WebElement dropdownMonth = Driver.get().findElement(By.xpath("//div/select[@class='react-datepicker__month-select']"));
        WebElement dropdownYear = Driver.get().findElement(By.xpath("//div/select[@class='react-datepicker__year-select']"));

        Select stateDropdown1 = new Select(dropdownMonth);

        List<WebElement> options1 = stateDropdown1.getOptions();

        options1.get(1).click();

        BrowserUtils.waitFor(2);
        Select stateDropdown2 = new Select(dropdownYear);

        stateDropdown2.selectByValue("1990");

        Driver.get().findElement(By.xpath("//div/div[@aria-label='Choose Wednesday, February 21st, 1990']")).click();

        BrowserUtils.waitFor(2);

    }
    @And("the user should be able to select a month from today's date")
    public void the_user_should_be_able_to_select_a_month_from_today_s_date() {

        Driver.get().navigate().refresh();
        BrowserUtils.waitFor(2);

        String date = new DatePickerPage().datePickerMonthYearInput.getAttribute("value");

        String [] words = date.split("/");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

        System.out.println(words[0].substring(1));
//        02/01/2021

    }
}
