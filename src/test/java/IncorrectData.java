import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class IncorrectData {
    @Given("Fill incorrect data into the form on the main page")
    public void fillIncorrectDataIntoTheFormOnTheMainPage() {
        open("https://skillfactory.ru/");
        $x("//input[@name='name']").setValue("Александр@mail.com");
        $x("//input[@name='email']").setValue("testmail");
        $x("//input[@type='tel']").setValue("9093257328");
    }

    @And("Click the send button")
    public void clickTheSendButton() {
        $(".tn-form__submit").click();
    }

    @Then("Get a message about incorrectly entered data")
    public void getAMessageAboutIncorrectlyEnteredData() {
        $(".tn-form__errorbox-popup").shouldBe(visible);
        Selenide.closeWebDriver();
    }
}
