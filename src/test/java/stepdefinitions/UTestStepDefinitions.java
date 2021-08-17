package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UTestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.OpenUp;
import tasks.Record;

import java.util.List;

public class UTestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage((new OnlineCast()));
    }

    @Given("^than Carlos wants to register as user on Utest$")
    public void thanCarloswantstoregisterasuseronUtest(List<UTestData> uTestData) throws Exception {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage(), Record.
                onThePage(uTestData.set().setStrFname(),uTestData.set().setStrLname(),uTestData.set().setStrEmailAdd(),uTestData.set().setStrMonth(),
                uTestData.set().setStrDay(),uTestData.set().setStrYear(),uTestData.set().setStrCity(),uTestData.set().setStrZipCode(),
                uTestData.set().setStrCountry(),uTestData.set().setStrYourComputer(),uTestData.set().setStrVersion(),uTestData.set().setStrLanguage(),
                uTestData.set().setStrYourMobilDevice(),uTestData.set().setStrModel(),uTestData.set().setStrOperatingSystem(),
                uTestData.set().setStrPassword(),uTestData.set().setStrConfirmPassword()));

    }

    @When("^I should accept the conditions$")
    public void Ishouldaccepttheconditions(List<UTestData> uTestData) throws Exception {
        OnStage.theActorCalled("Carlos").wasAbleTo(Record.class(), Record.onThePage(uTestData.set().setStrCheckCode1(),
            uTestData.set().setStrCheckCode2());

    }

    @Then("^Ishouldpressbuttontoprocesssuccesfully")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(List<UTestData> uTestData) throws Exception {
        OnStage.theActorCalled("Carlos").wasAbleTo(Record.class(), Record.()));

    }
}
