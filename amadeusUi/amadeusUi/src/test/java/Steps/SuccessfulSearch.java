package Steps;
import Base.Driver;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SuccessfulSearch {
    private WebDriver driver;
    HomePage homePage = new HomePage();

    @Given("User on the home page")
    public void user_on_the_home_page() {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://flights-app.pages.dev/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @And("User types istanbul to From field and clicks")
    public void user_types_istanbul_to_from_field_and_clicks() {
        homePage.searchFrom("istanbul");
    }

    @And("User tries to type istanbul to From field and clicks")
    public void user_tries_to_type_istanbul_to_from_field_and_clicks() {
        homePage.searchTo("istanbul");
    }

    @When("User types Los Angeles to To field and clicks")
    public void user_types_los_angeles_to_to_field_and_clicks() {
        homePage.searchTo("Los Angeles");

    }

    @Then("User should see the results and verify the results")
    public void user_should_see_the_results_and_verify_the_results() {

        homePage.verifyResult("2");
        driver = Driver.closeDriver();
    }



}
