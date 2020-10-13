package Page;

public class BooksByLanguagesFrench extends BasePage {
    public static final String LANGUAGES_FRENCH = "//h1[text()='French - Français']";

    public boolean isPageTitleVisible() {
        return elementExists(LANGUAGES_FRENCH);
    }
}
