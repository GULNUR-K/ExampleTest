package com.demoqa.step_definitions;

import com.demoqa.pages.ToolTipsPage;
import com.demoqa.utilities.BrowserUtils;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ToolTipsStepDef {

    @Given("the user is on the Tool Tips page")
    public void the_user_is_on_the_Tool_Tips_page() {
        String url3 = ConfigurationReader.get("url3");
        Driver.get().get(url3);
        String actualTitle = Driver.get().getCurrentUrl();
        Assert.assertTrue(actualTitle.contains("tool-tips"));
    }

    @And("the user should be able to hover over the Hover me to see button")
    public void the_user_should_be_able_to_hover_over_the_button() {

        WebElement button=new ToolTipsPage().toolTipButton;
        BrowserUtils.hover(button);

        BrowserUtils.waitFor(2);
        WebElement element=Driver.get().findElement(By.xpath("//div/div[.='You hovered over the Button']"));
        Assert.assertEquals("You hovered over the Button", element.getText());
    }
    @Then("the user should be able to hover over the Hover me to see field")
    public void the_user_should_be_able_to_hover_over_the_field() {

        WebElement button=new ToolTipsPage().toolTipTextField;
        BrowserUtils.hover(button);

        BrowserUtils.waitFor(2);
        WebElement element=Driver.get().findElement(By.xpath("//div/div[.='You hovered over the text field']"));
        Assert.assertEquals("You hovered over the text field", element.getText());
    }
}
