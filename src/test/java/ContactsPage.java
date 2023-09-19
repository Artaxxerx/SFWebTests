import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class ContactsPage {
    @Given("Click the button with contacts in the header")
    public void clickTheButtonWithContactsInTheHeader() {
        open("https://skillfactory.ru/");
        $$(".main__header li").get(3).click();
    }

    @Then("A page with contacts is opened")
    public void aPageWithContactsIsOpened() {
        switchTo().window(1);
        $(".tn-elem__6188039681689908553383").shouldHave(text("Контактные телефоны"));
        Selenide.closeWebDriver();
    }
}
