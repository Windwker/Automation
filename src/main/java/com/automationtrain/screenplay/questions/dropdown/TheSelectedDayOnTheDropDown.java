package com.automationtrain.screenplay.questions.dropdown;

import com.automationtrain.screenplay.user_interface.DropDown;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Value;

public class TheSelectedDayOnTheDropDown implements Question<String> {
    @Override
    public String answeredBy(Actor theActor) {
        return Value.of(DropDown.SELECT_A_DAY).viewedBy(theActor).asString();
            }

    public static Question<String> is(){
        return new TheSelectedDayOnTheDropDown();
    }
}
