import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class DesignCourses {
    @Given("Сlick on the button with the direction of design")
    public void сlickOnTheButtonWithTheDirectionOfDesign() {
        open("https://skillfactory.ru/");
        $$("ul.directions__list li").get(5).click();
    }

    @Then("A page with design courses is opened")
    public void aPageWithDesignCoursesIsOpened() {
        switchTo().window(1);
        $(".tn-elem__6034761701678366726776").shouldHave(text("Обучение в крупнейшей профильной онлайн-школе дизайна Contented *"));
        Selenide.closeWebDriver();
    }
}
