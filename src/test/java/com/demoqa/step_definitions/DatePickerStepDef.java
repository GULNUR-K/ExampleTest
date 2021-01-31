package com.demoqa.step_definitions;

import com.demoqa.pages.DatePickerPage;
import com.demoqa.utilities.BrowserUtils;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.Calendar;
import java.util.Date;

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

        //I got just one random date
        String month="April";
        String year="1996";
        int day=13;

        new DatePickerPage().datePickerMonthYearInput.click();

        BrowserUtils.waitFor(2);

        WebElement dropdownMonth = Driver.get().findElement(By.xpath("//select/option[text()='"+month+"']"));
        WebElement dropdownYear = Driver.get().findElement(By.xpath("//select/option[text()='"+year+"']"));

        dropdownMonth.click();
        dropdownYear.click();
        BrowserUtils.waitFor(1);

        try {
            WebElement dropdownDay=Driver.get().findElement(By.xpath("(//div[@class='react-datepicker__week']/div[text()='"+day+"'])[1]"));
            dropdownDay.click();
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            WebElement dropdownDay=Driver.get().findElement(By.xpath("(//div[@class='react-datepicker__week']/div[text()='"+day+"'])[1]"));
            dropdownDay.click();
        }
        BrowserUtils.waitFor(2);
    }
    @Ignore
    @And("the user should be able to select a date from today's date")
    public void the_user_should_be_able_to_select_a_date_from_today_s_date() {

        Driver.get().navigate().refresh();
        BrowserUtils.waitFor(2);

//        Calendar cal = Calendar.getInstance();
//        cal.add(Calendar.MONTH, -1);
//        Date result = cal.getTime();

        String date1 = new DatePickerPage().datePickerMonthYearInput.getAttribute("value");
        System.out.println("date1 = " + date1);
        String [] date2 = date1.split("/");

        int day=Integer.parseInt(date2[1]);
        int month=Integer.parseInt(date2[0]);
        int year=Integer.parseInt(date2[2]);

        if(month==1){
            month=11;
            year=year-1;
        }else if(month>1) {
            month = month - 2;
        }
        new DatePickerPage().datePickerMonthYearInput.click();

        BrowserUtils.waitFor(1);
        WebElement dropdownMonth = Driver.get().findElement(By.xpath("//select/option[@value='"+month+"']"));
        WebElement dropdownYear = Driver.get().findElement(By.xpath("//select/option[text()='"+year+"']"));

        dropdownMonth.click();
        dropdownYear.click();
        BrowserUtils.waitFor(1);
        if(day>=25 && day<31 && !(month==2)) {
            try {
                WebElement dropdownDay = Driver.get().findElement(By.xpath("(//div[@class='react-datepicker__week']/div[text()='" + day + "'])[2]"));
                dropdownDay.click();
            } catch (org.openqa.selenium.StaleElementReferenceException ex) {
                WebElement dropdownDay = Driver.get().findElement(By.xpath("(//div[@class='react-datepicker__week']/div[text()='" + day + "'])[2]"));
                dropdownDay.click();
            }
        }else if(day<25){
            try {
                WebElement dropdownDay = Driver.get().findElement(By.xpath("(//div[@class='react-datepicker__week']/div[text()='" + day + "'])[1]"));
                dropdownDay.click();
            } catch (org.openqa.selenium.StaleElementReferenceException ex) {
                WebElement dropdownDay = Driver.get().findElement(By.xpath("(//div[@class='react-datepicker__week']/div[text()='" + day + "'])[1]"));
                dropdownDay.click();
            }
        }else if(day==31 && !(month==2)) {
            try {
                WebElement dropdownDay = Driver.get().findElement(By.xpath("//div[@class='react-datepicker__week']/div[text()='" + day + "']"));
                dropdownDay.click();
            } catch (org.openqa.selenium.StaleElementReferenceException ex) {
                WebElement dropdownDay = Driver.get().findElement(By.xpath("//div[@class='react-datepicker__week']/div[text()='" + day + "']"));
                dropdownDay.click();
            }
        }else if(day>=29 && month==2){
            day=28;
            try {
                WebElement dropdownDay = Driver.get().findElement(By.xpath("(//div[@class='react-datepicker__week']/div[text()='" + day + "'])[2]"));
                dropdownDay.click();
            } catch (org.openqa.selenium.StaleElementReferenceException ex) {
                WebElement dropdownDay = Driver.get().findElement(By.xpath("(//div[@class='react-datepicker__week']/div[text()='" + day + "'])[2]"));
                dropdownDay.click();
            }
        }
        // I did not count leap years.may be later :)
        BrowserUtils.waitFor(4);
        String date3 = new DatePickerPage().datePickerMonthYearInput.getAttribute("value");
        System.out.println("date3 = " + date3);
        //you can see dates on console
    }
}
