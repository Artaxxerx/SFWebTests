import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class WebDesignCourse {
    @Given("Open a page with Design courses")
    public void openAPageWithDesignCourses() {
        open("https://skillfactory.ru/");
        $$("ul.directions__list li").get(5).click();
    }

    @And("Choose WEB design course")
    public void chooseWEBDesignCourse() {
        switchTo().window(1);
        $(".tn-elem__6016804201679951747146").click();
    }

    @And("Click on the button to enroll in the WEB Design course")
    public void clickOnTheButtonToEnrollInTheWEBDesignCourse() {
        switchTo().window(2);
        $x("//a[text()='записаться']").click();
    }

    @And("Fill out the form to enroll in the WEB Design course")
    public void fillOutTheFormToEnrollInTheWEBDesignCourse() {
        $("#input_1495810359387").setValue("Александр");
        $("#input_1495810354468").setValue("testmail@gmail.com");
        $(".t-input-phonemask").setValue("9093257328");
        $(".t-form__submit").click();
    }

    @Then("Confirmation of successful sending has been received")
    public void confirmationOfSuccessfulSendingHasBeenReceived() {
        $(".t-form__successbox").shouldBe(visible);
    }
}
