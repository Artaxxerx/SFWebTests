import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class HigherEducation {
    @Given("Сlick on the button with the direction of higher education")
    public void сlickOnTheButtonWithTheDirectionOfHigherEducation() {
        open("https://skillfactory.ru/");
        $$("ul.directions__list li").get(4).click();
    }

    @Then("A page with higher education is opened")
    public void aPageWithHigherEducationIsOpened() {
        switchTo().window(1);
        $(".tn-elem__6171541411689594433384").shouldHave(text("Высшее образование "));
        Selenide.closeWebDriver();
    }
}
