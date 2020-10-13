package Page;


public class BooksByLanguage extends BasePage {

    public static final String BOOKS_BY_LANGUAGES = "//h1[text()='Find your language']";

    public boolean isPageTitleVisible() {
        return elementExists(BOOKS_BY_LANGUAGES);
    }
}
