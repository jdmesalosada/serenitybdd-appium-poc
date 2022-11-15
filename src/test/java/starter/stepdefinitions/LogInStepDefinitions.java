package starter.stepdefinitions;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import starter.tasks.Login;
import starter.tasks.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LogInStepDefinitions {


    //@Managed(driver = "Appium")
   // public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("John Wick wants to create a new post")
    public void john_want_to_create_a_new_post() {
        theActorCalled("Jhon").attemptsTo(
                new NavigateTo()
        );
    }

    @When("he sends his credentials")
    public void sends_his_credentials(){
        theActorInTheSpotlight().attemptsTo(
                new Login()
        );
    }
}
