import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class ManagementCourses {
    @Given("Сlick on the button with the direction of management")
    public void сlickOnTheButtonWithTheDirectionOfManagement() {
        open("https://skillfactory.ru/");
        $$("ul.directions__list li").get(6).click();
    }

    @Then("A page with management courses is opened")
    public void aPageWithManagementCoursesIsOpened() {
        switchTo().window(1);
        $("#rec520598643").shouldHave(text("Курсы по менеджменту и управлению"));
        Selenide.closeWebDriver();
    }
}
