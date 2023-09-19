import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class DataAnaliticsCourses {
    @Given("Сlick on the button with the direction of data analitics")
    public void сlickOnTheButtonWithTheDirectionOfDataAnalitics() {
        open("https://skillfactory.ru/");
        $$("ul.directions__list li").get(2).click();
    }

    @Then("A page with data analitics courses is opened")
    public void aPageWithDataAnaliticsCoursesIsOpened() {
        switchTo().window(1);
        $(".tn-elem__5690921991678366726776").shouldHave(text("Курсы по аналитике данных"));
        Selenide.closeWebDriver();
    }
}
