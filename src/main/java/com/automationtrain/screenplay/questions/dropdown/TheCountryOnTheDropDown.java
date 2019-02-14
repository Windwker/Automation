package com.automationtrain.screenplay.questions.dropdown;

import com.automationtrain.screenplay.user_interface.DropDown;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.SelectedVisibleTextValue;

public class TheCountryOnTheDropDown implements Question<String> {
    @Override
    public String answeredBy(Actor theActor) {
        return SelectedVisibleTextValue.of(DropDown.SELECT_A_CITY).viewedBy(theActor).asString();
    }


    public static Question<String> selected(){
        return new TheCountryOnTheDropDown();
    }

}
