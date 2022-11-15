package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeView {

    public static Target loginLink = Target
            .the("login link")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"Login Screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));

}
