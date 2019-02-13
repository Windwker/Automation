package com.automationtrain.cucumber;

import com.automationtrain.screenplay.questions.TextOfChecked;
import com.automationtrain.screenplay.questions.TextOfMessage;
import com.automationtrain.screenplay.questions.TextOfSum;
import com.automationtrain.screenplay.tasks.ClickOn;
import com.automationtrain.screenplay.tasks.NavigateTo;
import com.automationtrain.screenplay.user_interface.Button;
import com.automationtrain.screenplay.user_interface.CheckBox;
import com.automationtrain.screenplay.user_interface.InputBox;
import com.automationtrain.screenplay.user_interface.Label;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.CoreMatchers.equalTo;

public class AutomationUserSteps {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^im on the basic form demo website$")
    public void imOnTheBasicFormDemoWebsite() {
        theActorCalled("Javi").wasAbleTo(NavigateTo.theBasicFormDemoWebsite());
    }

    @When("^i enter a message on the Message input box$")
    public void iEnterAMessageOnTheMessageInputBox() {
        theActorInTheSpotlight().attemptsTo(Enter.theValue("Test").into((InputBox.MESSAGE)));
    }

    @And("^i click on Show Message button$")
    public void iClickOnShowMessageButton() {
        theActorInTheSpotlight().attemptsTo(Click.on(Button.SHOW_MESSAGE));
    }

    @Then("^i should be able to see the message i entered$")
    public void iShouldBeAbleToSeeTheMessageIEntered() {
        theActorInTheSpotlight().should(seeThat(TextOfMessage.value(), equalTo("TEST")));
    }

    @When("^i enter value A$")
    public void iEnterValueA() {
        theActorInTheSpotlight().attemptsTo(Enter.theValue("2").into(InputBox.VALUE_A));
    }

    @And("^i enter value B$")
    public void iEnterValueB() {
        theActorInTheSpotlight().attemptsTo(Enter.theValue("2").into(InputBox.VALUE_B));
    }

    @And("^i click on Get Total button$")
    public void iClickOnGetTotalButton() {
        theActorInTheSpotlight().attemptsTo(Click.on(Button.GET_TOTAL));
    }


    @Then("^i should be able to see the sum of A and B$")
    public void iShouldBeAbleToSeeTheSumOfAAndB() {
        theActorInTheSpotlight().should(seeThat(TextOfSum.value(), equalTo("4")));
    }

    @Given("^im on the basic checkbox demo website$")
    public void imOnTheBasicCheckboxDemoWebsite() {
        theActorCalled("Javi").wasAbleTo(NavigateTo.theBasicCheckboxDemoWebsite());
    }

    @When("^i click on the checkbox$")
    public void iClickOnTheCheckbox() {
        theActorInTheSpotlight().attemptsTo(Click.on(CheckBox.SINGLE_CHECKBOX));
    }

    @Then("^i should see a success message$")
    public void iShouldSeeASuccessMessage() {
        theActorInTheSpotlight().should(seeThat(the(Label.CHECKBOX_CHECKED), isVisible()));
        theActorInTheSpotlight().should(seeThat((TextOfChecked.value()), equalTo("Success - Check box is checked")));
    }

    @When("^i click each checkbox$")
    public void iClickEachCheckbox() {
        theActorInTheSpotlight().attemptsTo(ClickOn.EachCheckBox());
    }

    @Then("^i shoud see that the button is changed to Uncheck All$")
    public void iShoudSeeThatTheButtonIsChangedToUncheckAll() {
        
    }

    @When("^i click on the Check All button$")
    public void iClickOnTheCheckAllButton() {
        
    }

    @Then("^i should see that all the options gets checked$")
    public void iShouldSeeThatAllTheOptionsGetsChecked() {
        
    }

    @And("^the button is changed to Uncheck All$")
    public void theButtonIsChangedToUncheckAll() {
        
    }

    @When("^i click on the Uncheck All button$")
    public void iClickOnTheUncheckAllButton() {
        
    }

    @Then("^i should see that all the options gets unchecked$")
    public void iShouldSeeThatAllTheOptionsGetsUnchecked() {
        
    }

    @And("^the button is changed to Check All$")
    public void theButtonIsChangedToCheckAll() {
    }
}
