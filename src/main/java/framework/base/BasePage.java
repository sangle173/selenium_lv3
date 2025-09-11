package framework.base;

import static com.codeborne.selenide.Selenide.*;

/**
 * BasePage: Parent class for all page objects.
 * Contains common methods like navigation, waits, and getting page title.
 */
public abstract class BasePage {

    /**
     * Opens a given URL in the browser.
     * @param url Full URL of the page.
     */
    public void openPage(String url) {
        open(url);
    }

    /**
     * Get current page title.
     * @return Page title string.
     */
    public String getPageTitle() {
        return title();
    }
}
