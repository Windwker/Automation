package com.automationtrain.screenplay.questions.checkbox;

import com.automationtrain.screenplay.user_interface.CheckBox;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class TheStatusOfTheCheckboxes implements Question {
int counter ;
String statusOfCheckbox;
    @Override
    public String answeredBy(Actor theActor) {

       List<WebElementFacade> list = (CheckBox.MULTIPLE_CHECKBOX.resolveAllFor(theActor));
        for (WebElementFacade webElement: list
             ) {
            if (webElement.isSelected()){
            counter++;
            }
        }
        if (counter == list.size()){
            statusOfCheckbox = "Checked";
        }else {
            statusOfCheckbox = "Not every checkbox is Checked";
        }


        return statusOfCheckbox;
    }


    public static Question<String> is(){
        return new TheStatusOfTheCheckboxes();
    }

}
