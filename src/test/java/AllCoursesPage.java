import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AllCoursesPage {
    @Given("The {string} button is clicked")
    public void clickAllCoursesButton(String allCourses) {
        $x("//span[text()='Все курсы']").click();
    }

    @Then("A page with all courses is opened")
    public void openAllCoursesPage() {
        switchTo().window(1);
        $(".t758__link-item_active").shouldHave(text("Онлайн-курсы IT-профессий"));
    }
}
