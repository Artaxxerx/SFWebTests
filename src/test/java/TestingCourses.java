import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestingCourses {
    @Given("Сlick on the button with the direction of testing")
    public void сlickOnTheButtonWithTheDirectionOfTesting() {
        open("https://skillfactory.ru/");
        $$("ul.directions__list li").get(3).click();
    }

    @Then("A page with testing courses is opened")
    public void aPageWithTestingCoursesIsOpened() {
        switchTo().window(1);
        $(".tn-elem__5652708631678366726776").shouldHave(text("Курсы по тестированию"));
        Selenide.closeWebDriver();
    }
}
