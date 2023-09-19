import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class CareerCenterPage {
    @Given("Click the career center button in the header")
    public void clickTheCareerCenterButtonInTheHeader() {
        open("https://skillfactory.ru/");
        $$(".main__header li").get(2).click();
    }

    @Then("The career center page has opened")
    public void theCareerCenterPageHasOpened() {
        switchTo().window(1);
        $(".tn-elem__3508653801628851978862").shouldHave(text("Центр карьеры"));
        Selenide.closeWebDriver();
    }
}
