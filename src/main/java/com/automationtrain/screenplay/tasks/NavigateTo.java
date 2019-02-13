package com.automationtrain.screenplay.tasks;

import com.automationtrain.screenplay.pages.BasicCheckboxDemoWebsite;
import com.automationtrain.screenplay.pages.BasicFormDemoWebsite;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class NavigateTo implements Task {
    private static Class page;
    @Override
    public <T extends Actor> void performAs(T theActor) {

        theActor.attemptsTo(Open.browserOn().the(page));
    }


    public static NavigateTo theBasicFormDemoWebsite(){
        page = BasicFormDemoWebsite.class;
        return instrumented(NavigateTo.class, page);
    }

    public static NavigateTo theBasicCheckboxDemoWebsite(){
        page = BasicCheckboxDemoWebsite.class;
        return instrumented(NavigateTo.class, page);
    }


}
