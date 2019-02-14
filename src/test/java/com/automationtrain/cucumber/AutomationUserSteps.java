package com.automationtrain.cucumber;

import com.automationtrain.screenplay.questions.checkbox.TheStatusOfTheCheckboxes;
import com.automationtrain.screenplay.questions.checkbox.TheTextOfCheckBoxButton;
import com.automationtrain.screenplay.questions.checkbox.TheTextOfChecked;
import com.automationtrain.screenplay.questions.dropdown.TheCountryOnTheDropDown;
import com.automationtrain.screenplay.questions.dropdown.TheSelectedDayOnTheDropDown;
import com.automationtrain.screenplay.questions.dropdown.TheTextOfTheSelectedCountry;
import com.automationtrain.screenplay.questions.dropdown.TheTextOfTheSelectedDay;
import com.automationtrain.screenplay.questions.simpleform.TheTextOfMessage;
import com.automationtrain.screenplay.questions.simpleform.TheTextOfSum;
import com.automationtrain.screenplay.tasks.ClickOn;
import com.automationtrain.screenplay.tasks.NavigateTo;
import com.automationtrain.screenplay.tasks.dropdown.SelectJustOneCity;
import com.automationtrain.screenplay.tasks.dropdown.SelectTheDay;
import com.automationtrain.screenplay.user_interface.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.SelectedVisibleTextValue;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class AutomationUserSteps {

    @Before
    public void setTheStage() {
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
        theActorInTheSpotlight().should(seeThat(TheTextOfMessage.is(), equalTo("TEST")));
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
        theActorInTheSpotlight().should(seeThat(TheTextOfSum.is(), equalTo("4")));
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
        theActorInTheSpotlight().should(seeThat((TheTextOfChecked.is()), equalTo("Success - Check box is checked")));
    }

    @When("^i click each checkbox$")
    public void iClickEachCheckbox() {

        theActorInTheSpotlight().attemptsTo(ClickOn.EachCheckBox());
    }

    @Then("^i should see that the button is changed to Uncheck All$")
    public void iShouldSeeThatTheButtonIsChangedToUncheckAll() {
        theActorInTheSpotlight().should(seeThat(TheTextOfCheckBoxButton.is(),equalTo("Uncheck All")));
    }

    @When("^i click on the Check All button$")
    public void iClickOnTheCheckAllButton() {
        theActorInTheSpotlight().attemptsTo(Click.on((Button.CHECK_ALL)));
    }

    @Then("^i should see that all the options gets checked$")
    public void iShouldSeeThatAllTheOptionsGetsChecked() {
        theActorInTheSpotlight().should(seeThat(TheStatusOfTheCheckboxes.is() , equalTo("Checked")));
    }

    @And("^the button is changed to Uncheck All$")
    public void theButtonIsChangedToUncheckAll() {
        theActorInTheSpotlight().should(seeThat(TheTextOfCheckBoxButton.is(), equalTo("Uncheck All")));
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

    @Given("^im on the basic select dropdown demo website$")
    public void imOnTheBasicSelectDropdownDemoWebsite() {
        theActorCalled("Javi").wasAbleTo(NavigateTo.theBasicSelectDropdownDemoWebsite());
    }

    @When("^i select an option from the Select List Demo$")
    public void iSelectAnOptionFromTheSelectListDemo() {
        theActorInTheSpotlight().attemptsTo(SelectTheDay.thursday());
    }

    @Then("^i should be able to check the selection$")
    public void iShouldBeAbleToCheckTheSelection() {
        theActorInTheSpotlight().should(seeThat(TheSelectedDayOnTheDropDown.is(), equalTo("Thursday")));
        theActorInTheSpotlight().should(seeThat(TheTextOfTheSelectedDay.is(), equalTo("Day selected :- Thursday")));
    }


    @When("^i select only an option from the Multi Select List$")
    public void iSelectOnlyAnOptionFromTheMultiSelectList() {
        theActorInTheSpotlight().attemptsTo(SelectJustOneCity.rightAway());
    }

    @And("^i press First Selected button$")
    public void iPressFirstSelectedButton() {
        theActorInTheSpotlight().attemptsTo(Click.on((Button.FIRST_SELECTED)));
        
    }

    @Then("^i should see the only option i selected$")
    public void iShouldSeeTheOnlyOptionISelected() {
        theActorInTheSpotlight().should(seeThat(TheTextOfTheSelectedCountry.is(), equalTo("First selected option is : Florida" )));
    }

    @And("^i press Get All Selected button$")
    public void iPressGetAllSelectedButton() {
        
    }

    @When("^i select several options from the Multi Select List$")
    public void iSelectSeveralOptionsFromTheMultiSelectList() {
        
    }

    @Then("^i should see the first option i selected$")
    public void iShouldSeeTheFirstOptionISelected() {
        
    }

    @Then("^i should see all the options i selected listed in order of selection$")
    public void iShouldSeeAllTheOptionsISelectedListedInOrderOfSelection() {
    }
}
