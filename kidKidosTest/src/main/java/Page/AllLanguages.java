package Page;

public class AllLanguages extends BasePage {

    public static final String ALL_LANGUAGES = "//*[text()='Find your language']";

    public boolean isPageTitleVisible() {
        return elementExists(ALL_LANGUAGES);
    }
}
