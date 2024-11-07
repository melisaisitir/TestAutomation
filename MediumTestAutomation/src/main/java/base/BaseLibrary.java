package base;

import io.qameta.allure.Allure;
import org.openqa.selenium.WebElement;

public class BaseLibrary {

    public static void log(String message){

        Allure.step (message);
        System.out.println ( message );

    }

    public void click(WebElement element, String name){

        element.click ();
        log ("Element tiklanildi:" +name);

    }
}
