package hu.unideb.inf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class CommonStepDefs extends AbstractStepDefs{

    @Given("the home page is opened")
    public void theHomePageIsOpened() {
        homePage.openPage();
    }

    @Given("the {string} button is clicked")
    public void theButtonIsClicked(String arg0) {
        homePage.clickButton(arg0);
    }

    @And("the {string} field is filled with {string}")
    public void theFieldIsFilledWith(String arg0, String arg1) {
        homePage.fillOutField(arg0, arg1);
    }

    @Then("the {string} message is shown")
    public void theMessageIsShown(String arg0) {
        Assertions.assertEquals(arg0, homePage.getMessage(arg0));
    }

    @And("the {string} buttons are clicked")
    public void theButtonsAreClicked(String arg0) {
        homePage.clickButtons(arg0);
    }
}
