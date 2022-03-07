package StepDefinitions;

import Base.TestBase;
import Utilities.Driver;
import Utilities.PropertiesReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CompleteWebFormPageStepDefs extends TestBase {

    @Given("User navigates to Formy Web Form")
    public void user_navigates_to_formy_web_form() throws InterruptedException {
        //driver.get("https://formy-project.herokuapp.com/form");
        Driver.get().get(PropertiesReader.get("url"));
        Thread.sleep(2000);

    }
    @When("User Fills the webform")
    public void user_fills_the_webform() {

    }
    @When("Users clicks submit button")
    public void users_clicks_submit_button() {

    }
    @Then("Webform should be filled and completed")
    public void webform_should_be_filled_and_completed() {

    }
}
