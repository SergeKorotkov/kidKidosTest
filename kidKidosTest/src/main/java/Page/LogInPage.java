package Page;

import static Consts.Consts.*;

public class LogInPage extends BasePage {

    public void navigateToLoginPage() {
        webDriver.get(LOGIN_PAGE_URL);
    }

    public static final String LOGIN = "//h1[text()='Login']";

    public boolean isPageTitleVisible() {
        return elementExists(LOGIN);
    }

    public void clickButtonSignIn() {
        clickElementByXpath(SIGN_IN_BUTTON);
    }
    public CreateAccountPage clickButtonCreateAccount() {
        clickElementByXpath(CREATE_ACCOUNT_BUTTON);
        return new CreateAccountPage();
    }

    public void sendTextToMail(String text) {
        findElementByXpath(LOGIN_EMAIL_FIELD).sendKeys(text);
    }

    public String getTextFromMailField() {
        findElementByXpath(LOGIN_EMAIL_FIELD).getAttribute("value");
        return findElementByXpath(LOGIN_EMAIL_FIELD).getAttribute("value");
    }

    public void sendTextToPasswordField(String text) {
        findElementByXpath(LOGIN_PASSWORD_FIELD).sendKeys(text);
    }

    public String getTextFromPasswordField() {
        findElementByXpath(LOGIN_PASSWORD_FIELD).getAttribute("value");
        return findElementByXpath(LOGIN_PASSWORD_FIELD).getAttribute("value");
    }

    public boolean errorMessage() {
        return elementExists(LOGIN_INCORRECT_EMAIL_MESSAGE);
    }

}
