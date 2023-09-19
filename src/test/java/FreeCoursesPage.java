import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class FreeCoursesPage {
    @Given("Click the button with free courses in the header")
    public void clickTheButtonWithFreeCoursesInTheHeader() {
        open("https://skillfactory.ru/");
        $$(".main__header li").get(1).click();
    }

    @Then("A page with free courses is opened")
    public void aPageWithFreeCoursesIsOpened() {
        switchTo().window(1);
        $(".tn-elem__6143823031678713723704").shouldHave(text("Бесплатные курсы,"));
    }
}
