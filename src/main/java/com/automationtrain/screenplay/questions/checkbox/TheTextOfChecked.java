package com.automationtrain.screenplay.questions.checkbox;

import com.automationtrain.screenplay.user_interface.Label;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheTextOfChecked implements Question<String> {
    @Override
    public String answeredBy(Actor theActor) {
        return Text.of(Label.CHECKBOX_CHECKED).viewedBy(theActor).asString();
    }


    public static Question<String> is(){
        return new TheTextOfChecked();
    }
}
