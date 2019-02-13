package com.automationtrain.screenplay.tasks;

import com.automationtrain.screenplay.user_interface.CheckBox;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromTarget;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOn implements Task {
    @Override
    public <T extends Actor> void performAs(T theActor) {
        for (Target checkbox: CheckBox.MULTIPLE_CHECKBOX
             ) {
            theActor.attemptsTo(Click.on(checkbox));
        }

    }

    public static ClickOn EachCheckBox() {
        return instrumented(ClickOn.class);
    }
}
