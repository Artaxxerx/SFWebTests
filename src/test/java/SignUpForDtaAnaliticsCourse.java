import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;

public class SignUpForDtaAnaliticsCourse {
    @Given("Open a page with Data Analitics courses")
    public void openAPageWithDataAnaliticsCourses() {
        open("https://skillfactory.ru/");
        $$("ul.directions__list li").get(2).click();
    }

    @And("Choose SQL course")
    public void chooseSQLCourse() {
        switchTo().window(1);
        $(".tn-elem__5690921991678946263403").click();
    }

    @And("Choose Data Analitics course")
    public void chooseDataAnaliticCourse() {
        $(".tn-elem__5231043801652779744723").click();
    }

    @And("Click on the button to enroll in the Data Analitics course")
    public void clickOnTheButtonToEnrollInTheDataAnaliticsCourse() {
        switchTo().window(2);
        $(".tn-elem__4537426051584952343910").click();
    }

    @And("Fill out the form to enroll in the Data Analitics course")
    public void fillOutTheFormToEnrollInTheDataAnaliticsCourse() {
        $("#input_1495810359387").setValue("Александр");
        $("#input_1495810354468").setValue("testmail@gmail.com");
        $(".t-input-phonemask").setValue("9093257328");
        $(byText("Отправить заявку")).click();
        
    }

    @Then("Check that the confirmation page has opened")
    public void checkThatTheConfirmationPageHasOpened() {
        $(".tn-elem__6126424051678814308235").shouldHave(text("Спасибо! Мы получили вашу заявку на курс."));
        Selenide.closeWebDriver();
    }
}
