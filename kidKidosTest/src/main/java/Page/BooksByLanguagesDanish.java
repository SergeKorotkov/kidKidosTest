package Page;

public class BooksByLanguagesDanish extends BasePage {
    public static final String LANGUAGES_DANISH = "//h1[text()='Danish - Dansk']";

    public boolean isPageTitleVisible() {
        return elementExists(LANGUAGES_DANISH);
    }
}
