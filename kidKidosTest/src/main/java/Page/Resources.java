package Page;

public class Resources extends BasePage {

    public static final String RESOURCES = "//*[text()='Videos']";

    public boolean isPageTitleVisible() {
        return elementExists(RESOURCES);
    }
}
