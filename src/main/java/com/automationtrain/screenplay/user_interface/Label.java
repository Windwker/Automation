package com.automationtrain.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Label {
    public static Target MESSAGE = Target.the("Message label").located(By.id("display"));
    public static Target SUM = Target.the("Sum").located(By.id("displayvalue"));
    public static Target CHECKBOX_CHECKED = Target.the("Checked Checkbox label").located(By.id("txtAge"));
    public static Target DAY_SELECTED = Target.the("Day Selected label").located(By.className("selected-value"));
    public static Target COUNTRY_SELECTED = Target.the("Country Selected label").located(By.className("getall-selected"));
}
