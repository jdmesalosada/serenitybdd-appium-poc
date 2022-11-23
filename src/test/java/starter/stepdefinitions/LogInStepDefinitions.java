package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.questions.LoggedInQuestions;
import starter.questions.StaticQuestions;
import starter.tasks.Login;
import starter.tasks.NavigateTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

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
                NavigateTo.login()
        );
    }

    @When("he sends his credentials")
    public void sends_his_credentials() {
        theActorInTheSpotlight().attemptsTo(
                Login.withAdminUser("alice", "mypassword")
        );
    }

    @Then("he should see the dashboard")
    public void should_see_the_dashboard() {
        String expectedWelcomeText = "You are logged in as alice";

        theActorInTheSpotlight().should(
                seeThat("the welcome text", LoggedInQuestions.value(),
                        equalTo(expectedWelcomeText))
        );

        theActorInTheSpotlight().should(
                seeThat("the  title text", StaticQuestions.getTitle(),
                        equalTo("Secret Area")),
                seeThat("the  logout text", StaticQuestions.getLogoutText(),
                        equalTo("Logout"))
        );
    }
}
