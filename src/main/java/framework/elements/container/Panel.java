package framework.elements.container;

import framework.elements.core.BaseElement;
import com.codeborne.selenide.Condition;

/**
 * Panel/Section element wrapper
 */
public class Panel extends BaseElement {
    private final String expandButtonLocator;
    private final String collapseButtonLocator;
    private final String contentLocator;
    
    public Panel(String panelLocator, String expandButtonLocator, 
                String collapseButtonLocator, String contentLocator, String name) {
        super(panelLocator, name);
        this.expandButtonLocator = expandButtonLocator;
        this.collapseButtonLocator = collapseButtonLocator;
        this.contentLocator = contentLocator;
    }

    /**
     * Expand the panel
     */
    public void expand() {
        if (!isExpanded()) {
            element.$(expandButtonLocator).click();
            element.$(contentLocator).shouldBe(Condition.visible);
        }
    }

    /**
     * Collapse the panel
     */
    public void collapse() {
        if (isExpanded()) {
            element.$(collapseButtonLocator).click();
            element.$(contentLocator).shouldBe(Condition.hidden);
        }
    }

    /**
     * Check if panel is expanded
     */
    public boolean isExpanded() {
        return element.$(contentLocator).is(Condition.visible);
    }

    /**
     * Toggle panel state
     */
    public void toggle() {
        if (isExpanded()) {
            collapse();
        } else {
            expand();
        }
    }

    /**
     * Get panel title
     */
    public String getTitle() {
        return element.$("[role='heading']").getText();
    }

    /**
     * Get panel content
     */
    public String getContent() {
        return element.$(contentLocator).getText();
    }

    /**
     * Wait for panel to be expanded
     */
    public void waitForExpanded() {
        element.$(contentLocator).shouldBe(Condition.visible);
    }

    /**
     * Wait for panel to be collapsed
     */
    public void waitForCollapsed() {
        element.$(contentLocator).shouldBe(Condition.hidden);
    }
}
