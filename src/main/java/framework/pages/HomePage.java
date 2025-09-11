package framework.pages;

import com.codeborne.selenide.SelenideElement;
import framework.base.BasePage;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BasePage {

    // Locators
    private final SelenideElement logo = $(".logo img");  // top left logo
    private final SelenideElement myAccountDropdown = $("a[title='My account']");

    // Actions
    public boolean isLogoVisible() {
        return logo.isDisplayed();
    }

    public void openMyAccountMenu() {
        myAccountDropdown.click();
    }
}
