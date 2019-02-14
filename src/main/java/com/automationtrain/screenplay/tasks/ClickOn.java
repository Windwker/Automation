package com.automationtrain.screenplay.tasks;

import com.automationtrain.screenplay.user_interface.CheckBox;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOn implements Task {
    @Override
    public <T extends Actor> void performAs(T theActor) {

       CheckBox.MULTIPLE_CHECKBOX.resolveAllFor(theActor).stream().forEach(WebElementFacade::click);
    }

    public static ClickOn EachCheckBox() {
        return instrumented(ClickOn.class);
    }
}
