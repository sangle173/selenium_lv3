package demo;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HelloTest {
    @BeforeClass
    public void setup() {
        Configuration.browser = "chrome";
    }

    @Test
   public void openGoogleAndSearch() {
        open("https://google.com");
        $("[name='q']").setValue("Selenide").pressEnter();
        $$("#search a").findBy(text("selenide.org")).shouldBe();
   }
}
