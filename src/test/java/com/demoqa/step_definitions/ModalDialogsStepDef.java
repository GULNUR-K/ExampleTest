package com.demoqa.step_definitions;

import com.demoqa.pages.ModalDialogsPage;
import com.demoqa.utilities.BrowserUtils;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class ModalDialogsStepDef {

    @Given("the user is on the Modal Dialogs page")
    public void the_user_is_on_the_Modal_Dialogs_page() {
        String url5 = ConfigurationReader.get("url5");
        Driver.get().get(url5);
        String actualTitle = Driver.get().getCurrentUrl();
        //System.out.println("actualTitle = " + actualTitle);
        Assert.assertTrue(actualTitle.contains("modal-dialogs"));
    }
    @And("the user should be able to select Small modal button")
    public void the_user_should_be_able_to_select_Small_modal_button() {

        new ModalDialogsPage().showSmallModal.click();
        BrowserUtils.waitFor(2);
    }
    @Then("the user should be able to close the modal")
    public void the_user_should_be_able_to_close_the_modal() {

        System.out.println(new ModalDialogsPage().modalBody.getText());
        Assert.assertTrue(new ModalDialogsPage().modalBody.isDisplayed());

        BrowserUtils.waitFor(2);
        new ModalDialogsPage().closeSmallModal.click();

        BrowserUtils.waitFor(2);
    }
}
