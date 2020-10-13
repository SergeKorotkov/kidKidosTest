package Page;

public class Francais extends BasePage {

    public static final String FRANCAIS = "//h1[text()='French - Français']";

    public boolean isPageTitleVisible() {
        return elementExists(FRANCAIS);
    }
}
