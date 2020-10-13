package Page;

public class EBooksByLanguage extends BasePage {

    public static final String EBOOKS_BY_LANGUAGES = "//*[text()='Bulgarian-Български']";

    public boolean isPageTitleVisible() {
        return elementExists(EBOOKS_BY_LANGUAGES);
    }
}
