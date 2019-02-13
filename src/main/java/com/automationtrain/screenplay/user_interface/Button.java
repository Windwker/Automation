package com.automationtrain.screenplay.user_interface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Button {
    public static Target SHOW_MESSAGE = Target.the("Show Message Button").located(By.xpath("//*[@id=\"get-input\"]/button"));
    public static Target GET_TOTAL = Target.the("Get Total Button").located(By.xpath("//*[@id=\"gettotal\"]/button"));
}
