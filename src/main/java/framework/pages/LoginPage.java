package framework.pages;

import com.codeborne.selenide.SelenideElement;
import framework.base.BasePage;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends BasePage {

    // Locators
    private final SelenideElement usernameField = $("#username");
    private final SelenideElement passwordField = $("#password");
    private final SelenideElement loginButton = $("#login");

    // Actions
    public void login(String username, String password) {
        usernameField.setValue(username);
        passwordField.setValue(password);
        loginButton.click();
    }
}
