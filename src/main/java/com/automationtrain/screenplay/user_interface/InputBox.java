package com.automationtrain.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InputBox {
    public static Target MESSAGE = Target.the("Enter message text box").located(By.id("user-message"));
    public static Target VALUE_A = Target.the("Enter message text box").located(By.id("sum1"));
    public static Target VALUE_B = Target.the("Enter message text box").located(By.id("sum2"));
}
