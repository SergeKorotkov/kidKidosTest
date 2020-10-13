package Page;

public class LangeArab extends BasePage {

    public static final String LANGUAGES_ARABIC = "//h1[text()='eBooks in Arabic - عربي']";

    public boolean isPageTitleVisible() {
        return elementExists(LANGUAGES_ARABIC);
    }
}
