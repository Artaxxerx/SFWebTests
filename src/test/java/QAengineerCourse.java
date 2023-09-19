import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class QAengineerCourse {
    @Given("Open a page with Testing courses")
    public void openAPageWithTestingCourses() {
        open("https://skillfactory.ru/");
        $$("ul.directions__list li").get(3).click();
    }

    @And("Choose a selenium webdriver course")
    public void chooseASeleniumWebdriverCourse() {
        switchTo().window(1);
        $(".tn-elem__5652708631678946007997").click();
    }

    @And("Choose a qa engineer in java")
    public void chooseAQaEngineerInJava() {
        $(".tn-elem__5206446541652779877327").click();
    }

    @And("Click on the button to enroll in the course")
    public void clickOnTheButtonToEnrollInTheCourse() {
        switchTo().window(2);
        $(".tn-elem__3596564571596261549401").click();
    }

    @And("Fill out the form to enroll in the course")
    public void fillOutTheFormToEnrollInTheCourse() {
        $("#input_1495810359387").setValue("Александр");
        $("#input_1495810354468").setValue("testmail@gmail.com");
        $(".t-input-phonemask").setValue("9093257328");
        $(byText("Отправить заявку")).click();
    }

    @Then("A page with confirmation opened")
    public void aPageWithConfirmationOpened() {
        $(".tn-elem__6007027961678814308235").shouldHave(text("Спасибо! Мы получили вашу заявку на курс."));
        Selenide.closeWebDriver();
    }
}
