package com.automationtrain.screenplay.tasks.dropdown;

import com.automationtrain.screenplay.user_interface.DropDown;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectJustOneCity implements Task {
    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(SelectFromOptions.byVisibleText("Florida").from(DropDown.SELECT_A_CITY));
    }

    public static SelectJustOneCity rightAway() {
        return instrumented(SelectJustOneCity.class);
    }
}
