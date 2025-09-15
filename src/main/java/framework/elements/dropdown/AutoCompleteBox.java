package framework.elements.dropdown;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import framework.elements.core.BaseElement;
import static com.codeborne.selenide.Selenide.$$;

/**
 * AutoComplete element with suggestions list
 */
public class AutoCompleteBox extends BaseElement {
    private final ElementsCollection suggestions;
    
    public AutoCompleteBox(String inputLocator, String suggestionsLocator, String name) {
        super(inputLocator, name);
        this.suggestions = $$(suggestionsLocator);
    }

    /**
     * Type text and select first suggestion
     * @param text Text to type
     */
    public void typeAndSelectFirst(String text) {
        waitForVisible();
        element.setValue(text);
        suggestions.first().click();
    }

    /**
     * Type text and select suggestion by index
     * @param text Text to type
     * @param index Index of suggestion to select
     */
    public void typeAndSelect(String text, int index) {
        waitForVisible();
        element.setValue(text);
        suggestions.get(index).click();
    }

    /**
     * Type text and select suggestion by exact text
     * @param text Text to type
     * @param suggestionText Exact text of suggestion to select
     */
    public void typeAndSelectByText(String text, String suggestionText) {
        waitForVisible();
        element.setValue(text);
        suggestions.findBy(com.codeborne.selenide.Condition.exactText(suggestionText)).click();
    }

    /**
     * Type text and select suggestion that contains text
     * @param text Text to type
     * @param containsText Text that suggestion should contain
     */
    public void typeAndSelectByContains(String text, String containsText) {
        waitForVisible();
        element.setValue(text);
        suggestions.findBy(com.codeborne.selenide.Condition.text(containsText)).click();
    }

    /**
     * Get number of suggestions
     */
    public int getSuggestionsCount() {
        return suggestions.size();
    }

    /**
     * Get all suggestion texts
     */
    public java.util.List<String> getSuggestionTexts() {
        return suggestions.texts();
    }
}
