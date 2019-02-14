package com.automationtrain.screenplay.questions.checkbox;

import com.automationtrain.screenplay.user_interface.Button;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Value;

public class TheTextOfCheckBoxButton implements Question<String> {
    @Override
    public String answeredBy(Actor theActor) {
        return Value.of(Button.CHECK_ALL).viewedBy(theActor).asString();
    }

    public static Question<String> is(){
        return new TheTextOfCheckBoxButton();
    }
}
