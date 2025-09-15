package framework.elements.control;

import framework.elements.core.BaseElement;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.interactions.Actions;

/**
 * Slider element wrapper
 */
public class Slider extends BaseElement {
    
    public Slider(String locator, String name) {
        super(locator, name);
    }

    /**
     * Move slider to specific percentage
     * @param percentage Value from 0 to 100
     */
    public void slideTo(int percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Percentage must be between 0 and 100");
        }

        int width = element.getSize().getWidth();
        int xOffset = (int) (width * (percentage / 100.0)) - (width / 2);

        new Actions(Selenide.webdriver().object())
            .clickAndHold(element)
            .moveByOffset(xOffset, 0)
            .release()
            .perform();
    }

    /**
     * Get current value
     */
    public String getValue() {
        return element.getValue();
    }

    /**
     * Move slider by offset
     */
    public void moveByOffset(int xOffset) {
        new Actions(Selenide.webdriver().object())
            .clickAndHold(element)
            .moveByOffset(xOffset, 0)
            .release()
            .perform();
    }

    /**
     * Get min value
     */
    public String getMin() {
        return getAttribute("min");
    }

    /**
     * Get max value
     */
    public String getMax() {
        return getAttribute("max");
    }

    /**
     * Get step value
     */
    public String getStep() {
        return getAttribute("step");
    }
}
