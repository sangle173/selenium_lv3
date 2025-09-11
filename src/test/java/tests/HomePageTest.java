package tests;

import framework.pages.HomePage;
import framework.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageLoads() {
        String baseUrl = ConfigReader.get("base.url");

        HomePage home = new HomePage();
        home.openPage(baseUrl);

        // Verify logo is displayed
        Assert.assertTrue(home.isLogoVisible(), "Logo should be visible on Home Page");
    }
}
