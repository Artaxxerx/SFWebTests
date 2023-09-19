import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PythonDeveloperCourse {
    @And("Open a page with Python Developer course")
    public void PythonDeveloperCoursePage() {
        $(".tn-elem__6093552071678946007997").click();
        $(".tn-elem__5690865761678946007997").click();
        $(".tn-elem__6399917761679952802625").click();
    }

    @And("The application form for the course is filled in")
    public void fillTheApplicationForm() {
        switchTo().window(2);
        $x("//input[@name='name']").setValue("Александр");
        $x("//input[@name='email']").setValue("testmail@gmail.com");
        $x("//input[@type='tel']").setValue("9093257328");
    }

    @And("The application has been sent")
    public void sendTheApplicationForm() {
        $(byText("Отправить")).click();
    }

    @Then("The confirmation page opened")
    public void confirmationPage() {
        $x("//span").shouldHave(text("Спасибо! Мы получили вашу заявку на курс."));
        Selenide.closeWebDriver();
    }
}
