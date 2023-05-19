package hu.unideb.inf;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class ShoppingStepDefs extends AbstractStepDefs{

    @Then("the {string} should read {string}")
    public void theLabelShouldRead(String arg0, String arg1) {
        Assertions.assertEquals(arg1, homePage.getLabel(arg0));
    }
}
