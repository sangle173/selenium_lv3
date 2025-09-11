package tests;

import com.codeborne.selenide.Configuration;
import framework.utils.ConfigReader;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import static com.codeborne.selenide.Selenide.*;

public abstract class BaseTest {

    @BeforeClass
    public void setUp() {
        Configuration.browser = ConfigReader.get("browser");
        Configuration.timeout = Long.parseLong(ConfigReader.get("timeout"));

        if (Boolean.parseBoolean(ConfigReader.get("headless"))) {
            Configuration.headless = true;
        }
    }

    @AfterClass
    public void tearDown() {
        closeWebDriver();
    }
}
