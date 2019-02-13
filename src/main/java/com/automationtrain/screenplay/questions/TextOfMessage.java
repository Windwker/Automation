package com.automationtrain.screenplay.questions;

import com.automationtrain.screenplay.user_interface.Label;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TextOfMessage implements Question<String> {
    @Override
    public String answeredBy(Actor theActor) {
        return Text.of(Label.MESSAGE).viewedBy(theActor).asString();
    }

    public static Question<String> value(){
        return new TextOfMessage();
    }
}
