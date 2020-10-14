package Page;

public class CreateAccountPage extends BasePage{

    public static final String CREATE_ACCOUNT_HEADER = "//h1[text()='Create Account']";

    public boolean isPageTitleVisible() {
        return elementExists(CREATE_ACCOUNT_HEADER);
    }
}
