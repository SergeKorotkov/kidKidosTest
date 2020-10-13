package Page;

public class EBooksBulgarian extends BasePage {

    public static final String LANGUAGES_BULGARIAN = "//h1[text()='eBooks in Bulgarian-Български']";

    public boolean isPageTitleVisible() {
        return elementExists(LANGUAGES_BULGARIAN);
    }
}
