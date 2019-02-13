package com.automationtrain.screenplay.questions;

import com.automationtrain.screenplay.user_interface.Label;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TextOfSum implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(Label.SUM).viewedBy(actor).asString();
    }

    public static Question<String> value(){
        return new TextOfSum();
    }
}
