package com.automationtrain.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DropDown {
    public static Target SELECT_A_DAY = Target.the("Day Dropdown").located(By.id("select-demo"));
    public static Target SELECT_A_CITY = Target.the("City Drowpdown").located(By.id("multi-select"));
}
