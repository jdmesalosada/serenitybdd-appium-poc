package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import starter.ui.LoggedInAreaView;

public class StaticQuestions {

    public static Question<String> getTitle(){
        return actor -> Text.of(LoggedInAreaView.title).answeredBy(actor);
    }

    public static Question<String> getLogoutText(){
        return actor -> Text.of(LoggedInAreaView.logOutButton).answeredBy(actor);
    }
}
