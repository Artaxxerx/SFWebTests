import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class CorporateEducation {
    @Given("Click the button with corporate education in the header")
    public void clickTheButtonWithCorporateEducationInTheHeader() {
        open("https://skillfactory.ru/");
        $$(".main__header li").get(5).click();
    }

    @Then("A page with corporate education is opened")
    public void aPageWithCorporateEducationIsOpened() {
        switchTo().window(1);
        $(".tn-elem__4243637071627315336472").shouldHave(text("лидер онлайн-образования в России"));
        Selenide.closeWebDriver();
    }
}
