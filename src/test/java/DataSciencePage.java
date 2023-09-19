import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DataSciencePage{


    @Given("Open a drop-down list with all courses")
    public void openADropDownListWithAllCourses() {
        open("https://skillfactory.ru/");
        $$(".main__header li").first().hover();
    }

    @And("Select Data Science item")
    public void selectDataScienceItem() {
        $$("ul.t978__menu li").get(6).click();
        switchTo().window(1);
    }

    @Then("A page with courses on data science has opened")
    public void aPageWithCoursesOnDataScienceHasOpened() {
        $(".tn-elem__5690927861678366726776").shouldHave(text("Курсы по Data Science"));
        Selenide.closeWebDriver();
    }
}
