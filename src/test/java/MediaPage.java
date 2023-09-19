import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class MediaPage {
    @Given("Click the button with media in the header")
    public void clickTheButtonWithMediaInTheHeader() {
        open("https://skillfactory.ru/");
        $$(".main__header li").get(4).click();
    }

    @Then("A page with media is opened")
    public void aPageWithMediaIsOpened() {
        switchTo().window(1);
        $("#header").shouldBe(visible);
        Selenide.closeWebDriver();
    }
}
