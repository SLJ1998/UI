package common;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ClearText {

    public static void clearText(WebElement element){

        element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        element.sendKeys(Keys.DELETE);

    }

}
