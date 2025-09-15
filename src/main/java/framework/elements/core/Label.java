package framework.elements.core;

/**
 * Label element for static text
 */
public class Label extends BaseElement {
    
    public Label(String locator, String name) {
        super(locator, name);
    }

    /**
     * Get inner text (trimmed)
     */
    public String getInnerText() {
        return getText().trim();
    }

    /**
     * Check if label contains text
     */
    public boolean containsText(String text) {
        return getText().contains(text);
    }

    /**
     * Get text content (including hidden text)
     */
    public String getTextContent() {
        return getAttribute("textContent");
    }
}
