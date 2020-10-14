package Page;

import static Consts.Consts.*;

public class CreateAccountPage extends BasePage{

    public static final String CREATE_ACCOUNT_HEADER = "//h1[text()='Create Account']";

    public boolean isPageTitleVisible() {
        return elementExists(CREATE_ACCOUNT_HEADER);
    }

    public void navigateToLoginPage() {
        webDriver.get(CREATE_ACCOUNT_PAGE_URL);
    }

    public void clickButtonCreate() {
        clickElementByXpath(CREATE_BUTTON);
    }

    public void sendTextToEMail(String text) {
        findElementByXpath(CREATE_ACCOUNT_EMAIL_FIELD).sendKeys(text);
    }

    public String getTextFromEMailField() {
        findElementByXpath(CREATE_ACCOUNT_EMAIL_FIELD).getAttribute("value");
        return findElementByXpath(CREATE_ACCOUNT_EMAIL_FIELD).getAttribute("value");
    }

    public void sendTextToPasswordField(String text) {
        findElementByXpath(CREATE_ACCOUNT_PASSWORD_FIELD).sendKeys(text);
    }

    public String getTextFromPasswordField() {
        findElementByXpath(CREATE_ACCOUNT_PASSWORD_FIELD).getAttribute("value");
        return findElementByXpath(CREATE_ACCOUNT_PASSWORD_FIELD).getAttribute("value");
    }
    public void sendTextToFirstNameField(String text) {
        findElementByXpath(CREATE_ACCOUNT_FIRST_NAME_FIELD).sendKeys(text);
    }

    public String getTextFromFirstNameField() {
        findElementByXpath(CREATE_ACCOUNT_FIRST_NAME_FIELD).getAttribute("value");
        return findElementByXpath(CREATE_ACCOUNT_FIRST_NAME_FIELD).getAttribute("value");
    }
    public void sendTextToLastNameField(String text) {
        findElementByXpath(CREATE_ACCOUNT_LAST_NAME_FIELD).sendKeys(text);
    }

    public String getTextFromLastNameField() {
        findElementByXpath(CREATE_ACCOUNT_LAST_NAME_FIELD).getAttribute("value");
        return findElementByXpath(CREATE_ACCOUNT_LAST_NAME_FIELD).getAttribute("value");
    }

    public boolean errorMessageEmail() {
        return elementExists(CREATE_ACCOUNT_ERROR_EMAIL_FIELD);
    }
    public boolean errorMessagePassword() {
        return elementExists(CREATE_ACCOUNT_ERROR_PASSWORD_FIELD);
    }
}
