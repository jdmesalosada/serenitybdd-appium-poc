package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoggedInAreaView {

    public static Target welcomeText = Target
            .the("welcome text")
            .located(By.xpath("//android.widget.TextView[contains(@text, 'You are logged in')]"));

    public static Target title = Target
            .the("title")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Secret')]"));

    public static Target logOutButton = Target
            .the("welcome text")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Logout')]"));

}
