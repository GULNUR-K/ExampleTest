package com.demoqa.step_definitions;

import com.demoqa.pages.PracticeFormPage;
import com.demoqa.utilities.BrowserUtils;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class RegisterStepDef {


    @Given("the student is on the practice form page")
    public void the_student_is_on_the_practice_form_page() {

        String url1 = ConfigurationReader.get("url1");

        Driver.get().get(url1);

        String actualTitle = Driver.get().getTitle();

        Assert.assertEquals("ToolsQA",actualTitle);
    }

    @Given("the student should be able to enter all details into inboxes using following information")
    public void the_student_should_be_able_to_enter_all_details_into_inboxes_using_following_information(Map<String, String> table) {

    }

    @Then("the student should be able to select gender {string} and hobbies {string}")
    public void the_student_should_be_able_to_select_gender_and_hobbies(String string, String string2) {

    }

    @Then("The student should able to upload a picture")
    public void the_student_should_able_to_upload_a_picture() {

    }

    @Then("select state {string} and city {string}")
    public void select_state_and_city(String string, String string2) {

    }

    @Then("The student should be able to submit")
    public void the_student_should_be_able_to_submit() {

    }

    @Then("message Thanks for submitting the form should be displayed on new popup")
    public void message_Thanks_for_submitting_the_form_should_be_displayed_on_new_popup() {

    }


    @Then("Message will not be displayed if mandatory fields have not been entered correctly")
    public void message_will_not_be_displayed_if_mandatory_fields_have_not_been_entered_correctly() {


    }
}