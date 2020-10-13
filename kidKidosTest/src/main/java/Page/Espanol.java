package Page;

public class Espanol extends BasePage {

    public static final String ESPANOL = "//h1[text()='Spanish - Español']";

    public boolean isPageTitleVisible() {
        return elementExists(ESPANOL);
    }
}
