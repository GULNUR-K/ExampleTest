package com.demoqa.step_definitions;

import com.demoqa.pages.DroppablePage;
import com.demoqa.utilities.BrowserUtils;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DroppableStepDef {

    @Given("the user is on the Droppable page")
    public void the_user_is_on_the_Droppable_page() {
        String url4 = ConfigurationReader.get("url4");

        Driver.get().get(url4);
        String actualTitle = Driver.get().getCurrentUrl();
        Assert.assertTrue(actualTitle.contains("droppable"));
    }
    @Then("the user should be able to drag and drop the Drag me element into the specified area")
    public void the_user_should_be_able_to_drag_and_drop_the_element_into_the_specified_area() {
        //Actions actions = new Actions(Driver.get());

        WebElement source = new DroppablePage().draggable;
        WebElement target = new DroppablePage().droppable;

        BrowserUtils.waitFor(2);
        BrowserUtils.dragAndDrop(source,target);

        //actions.dragAndDrop(source,target).perform();
        BrowserUtils.waitFor(2);

        Assert.assertTrue(Driver.get().findElement(By.xpath("(//div[@id='droppable']/p)[1]")).isDisplayed());
    }
}
