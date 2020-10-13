package Page;


import Consts.Consts;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Consts.Consts.*;

public class ContactUsPage extends BasePage {


    public void navigateToContactUsPage() {
        webDriver.get(Consts.CONTACT_US_PAGE_URL);
    }

    public static final String CONTACT_US_HEADER = "//h1[text()='Contact us']";

    public boolean isPageTitleVisible() {
        return elementExists(CONTACT_US_HEADER);
    }

    public void clickButtonSendMessage() {
        clickElementByXpath(BUTTON_SEND_XPATH);
    }

    public void sendTextToName(String text) {
        findElementByXpath(FIRST_NAME_XPATH).sendKeys(text);
    }

    public String getTextFromName() {
        findElementByXpath(FIRST_NAME_XPATH).getAttribute("value");
        return findElementByXpath(FIRST_NAME_XPATH).getAttribute("value");
    }

    public void sendTextToMessageField(String text) {
        findElementByXpath(YOUR_MESSAGE_XPATH).sendKeys(text);
    }

    public String getTextFromMessageField() {
        findElementByXpath(YOUR_MESSAGE_XPATH).getAttribute("value");
        return findElementByXpath(YOUR_MESSAGE_XPATH).getAttribute("value");
    }

    public void sendTextToEmailField(String text) {
        findElementByXpath(EMAIL_XPATH).sendKeys(text);
    }

    public String getTextFromEmailField() {
        findElementByXpath(EMAIL_XPATH).getAttribute("value");
        return findElementByXpath(EMAIL_XPATH).getAttribute("value");
    }

    public WebElement errorMessageFromEmailField() {
        WebElement err = webDriver.findElement(By.xpath(ERROR_WRONG_EMAIL_XPATH));
        return err;
    }

    public WebElement errorMessageFromNameField() {
        WebElement err = webDriver.findElement(By.xpath(ERROR_NAME_XPATH));
        return err;
    }

    public WebElement errorMessageFromALLField() {
        WebElement err = webDriver.findElement(By.xpath(ERROR_ALL_FIELDS_XPATH));
        return err;
    }



    public ContactUsPage openContactUsFieldName() {
        clickElementByXpath(FIRST_NAME_XPATH);
        return new ContactUsPage();
    }



}
