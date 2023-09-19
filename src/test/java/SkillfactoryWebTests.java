import io.cucumber.java.en.Then;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.*;

public class SkillfactoryWebTests {


    @Then("Heading is visible")
    public void mainPageIsDisplayed() {
        $$(".main__header").shouldHave(texts("ОНЛАЙН-КУРСЫ\n" +
                "БЕСПЛАТНО\n" +
                "ЦЕНТР КАРЬЕРЫ\n" +
                "КОНТАКТЫ\n" +
                "МЕДИА\n" +
                "КОРПОРАТИВНОЕ ОБУЧЕНИЕ"));
    }
}
