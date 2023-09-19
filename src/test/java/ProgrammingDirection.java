import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ProgrammingDirection {
    @Given("Сlick on the button with the direction of programming")
    public void сlickOnTheButtonWithTheDirectionOfProgramming() {
        open("https://skillfactory.ru/");
        $$("ul.directions__list li").first().click();
    }

    @Then("A page with programming courses is opened")
    public void aPageWithProgrammingCoursesIsOpened() {
        switchTo().window(1);
        $(".tn-elem__5690865761678366726776").shouldHave(text("Курсы программирования"));
        Selenide.closeWebDriver();
    }
}
