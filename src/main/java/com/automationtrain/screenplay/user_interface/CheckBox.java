package com.automationtrain.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckBox {
    public static Target SINGLE_CHECKBOX = Target.the("Single Checkbox").located(By.id("isAgeSelected"));
    public static List<Target>  MULTIPLE_CHECKBOX = Arrays.asList(Target.the("List").located(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/ul")));


}
