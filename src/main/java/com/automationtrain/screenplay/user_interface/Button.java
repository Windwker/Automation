package com.automationtrain.screenplay.user_interface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Button {
    public static Target SHOW_MESSAGE = Target.the("Show Message Button").located(By.xpath("//*[@id=\"get-input\"]/button"));
    public static Target GET_TOTAL = Target.the("Get Total Button").located(By.xpath("//*[@id=\"gettotal\"]/button"));
    public static Target CHECK_ALL = Target.the("Check All Button").located(By.id("check1"));
    public static Target FIRST_SELECTED = Target.the("First Selected Button").located(By.id("printMe"));
    public static Target GET_ALL_SELECTED = Target.the("First Selected Button").located(By.id("printAll"));
}
