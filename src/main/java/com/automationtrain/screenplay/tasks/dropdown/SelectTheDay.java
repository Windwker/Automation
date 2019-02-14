package com.automationtrain.screenplay.tasks.dropdown;

import com.automationtrain.screenplay.user_interface.DropDown;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectTheDay implements Task {
    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(SelectFromOptions.byVisibleText("Thursday").from(DropDown.SELECT_A_DAY));
    }

    public static SelectTheDay thursday(){
        return instrumented(SelectTheDay.class);
    }

}
