package framework.elements.core;

/**
 * Link element for hyperlinks
 */
public class Link extends BaseElement {
    
    public Link(String locator, String name) {
        super(locator, name);
    }

    /**
     * Get href attribute
     */
    public String getHref() {
        return getAttribute("href");
    }

    /**
     * Get link target
     */
    public String getTarget() {
        return getAttribute("target");
    }

    /**
     * Check if link opens in new window
     */
    public boolean opensInNewWindow() {
        String target = getTarget();
        return target != null && target.equals("_blank");
    }

    /**
     * Get link title (tooltip)
     */
    public String getTitle() {
        return getAttribute("title");
    }
}
