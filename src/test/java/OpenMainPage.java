import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class OpenMainPage {
    @BeforeAll
    @Given("Main page {string} is open")
    public void mainPageIsOpen(String url) {
        open(url);
        Configuration.browserSize = "1920x1080";

    }
}
