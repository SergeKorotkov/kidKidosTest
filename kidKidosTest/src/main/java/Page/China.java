package Page;

public class China extends BasePage {

    public static final String CHINA = "//h1[text()='Mandarin Chinese - 中文']";

    public boolean isPageTitleVisible() {
        return elementExists(CHINA);
    }
}
