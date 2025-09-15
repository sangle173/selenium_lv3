package framework.elements.selectable;

import framework.elements.core.BaseElement;

/**
 * Checkbox element wrapper
 */
public class CheckBox extends BaseElement {
    public CheckBox(String locator, String name) {
        super(locator, name);
    }

    /**
     * Check the checkbox
     */
    public void check() {
        if (!isChecked()) {
            click();
        }
    }

    /**
     * Uncheck the checkbox
     */
    public void uncheck() {
        if (isChecked()) {
            click();
        }
    }

    /**
     * Check if the checkbox is checked
     */
    public boolean isChecked() {
        return element.isSelected();
    }

    /**
     * Toggle checkbox state
     */
    public void toggle() {
        click();
    }

    @Override
    public String toString() {
        return String.format("Checkbox '%s' [%s]", getName(), isChecked() ? "checked" : "unchecked");
    }
}
