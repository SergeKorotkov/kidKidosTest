import Consts.Consts;
import Page.ContactUsPage;
import Page.MainPage;
import Utils.SharedDriver;
import Utils.UseCaseBase;
import net.bytebuddy.implementation.bytecode.Throw;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

public class ContactUsTest extends UseCaseBase {

//    private static MainPage mainPage;
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);

    private static ContactUsPage contactUsPage;



    @BeforeAll
    protected static void classSetup() {
        contactUsPage = new ContactUsPage();
    }
    @BeforeEach
    public void beforeTest() {
        contactUsPage.navigateToContactUsPage();
    }

//    @BeforeAll
//    protected static void classSetup() {
//        mainPage = new MainPage();
//    }
//
//    @BeforeEach
//    public void beforeTest() {
//        mainPage.navigateToContactUsPage();
//    }


    @Test
    public void contactUsPageTest() {
        contactUsPage.openContactUsFieldName();
        assertNotNull(contactUsPage);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Gousar", "6878782222", "a@a.ru", "", "llllllllllllljkk389399305454544lkihugyfutfddfhddchgfgf;'mz6//'l", "null"})
    public void nameInputTest(String text) {
//        ContactUsPage contactUsPage = mainPage.openContactUsFieldName();
//        assertNotNull(contactUsPage);
        contactUsPage.sendTextToName(text);
        contactUsPage.getTextFromName();
        assertEquals(text, contactUsPage.getTextFromName());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Gousar", "6878782222", "a@a.ru", "", "llllllllllllljkk38939930;'mz6//'l", "null"})
    public void messageInputTest(String text) {
//        ContactUsPage contactUsPage = mainPage.openContactUsMessageField();
//        assertNotNull(contactUsPage);
        contactUsPage.sendTextToMessageField(text);
        contactUsPage.getTextFromMessageField();
        assertEquals(text, contactUsPage.getTextFromMessageField());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Gousar", "6878782222", "a@a.ru", "", "llllllllllllljkk38939930;'mz6//'l", "null"})
    public void emailInputTest(String text) {
//        ContactUsPage contactUsPage = mainPage.openContactUsEmailField();
//        assertNotNull(contactUsPage);
        contactUsPage.sendTextToEmailField(text);
        contactUsPage.getTextFromEmailField();
        assertEquals(text, contactUsPage.getTextFromEmailField());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Wrong email", "a@a.ru", "d'artagnan@macho.com", "null"})
    public void errorMessageWrongEmailTest(String text) {
//        ContactUsPage contactUsPage = mainPage.openContactUsEmailField();
//        assertNotNull(contactUsPage);
        contactUsPage.sendTextToEmailField(text);
        contactUsPage.clickButtonSendMessage();
        WebElement error = contactUsPage.errorMessageFromEmailField();
        assertNotNull(error);
    }

    @Test
    public void errorMessageNameFieldTest() throws InterruptedException {
//        ContactUsPage contactUsPage = mainPage.openContactUsFieldName();
        contactUsPage.sendTextToMessageField("В атаку!!!");
        contactUsPage.sendTextToEmailField("d'artagnan@macho.com");
        contactUsPage.clickButtonSendMessage();
        contactUsPage.errorMessageFromALLField();
//        Thread.sleep(5000);
        assertNotNull(contactUsPage.errorMessageFromALLField());
    }

    @Test
    public void errorMessageEMailFieldTest() throws InterruptedException {
//        ContactUsPage contactUsPage = mainPage.openContactUsEmailField();
        contactUsPage.sendTextToName("Имя, сестра! Скажи мне его имя!!!");
        contactUsPage.sendTextToMessageField("Бекингем");
        contactUsPage.clickButtonSendMessage();
        contactUsPage.errorMessageFromALLField();
//        Thread.sleep(5000);
        assertNotNull(contactUsPage.errorMessageFromALLField());
    }

    @Test
    public void errorMessageFromMessageFieldTest() throws InterruptedException {
//        ContactUsPage contactUsPage = mainPage.openContactUsMessageField();
        contactUsPage.sendTextToName("Имя, сестра! Скажи мне его имя!!!");
        contactUsPage.sendTextToEmailField("d'artagnan@macho.com");
        contactUsPage.clickButtonSendMessage();
        contactUsPage.errorMessageFromALLField();
//        Thread.sleep(5000);
        assertNotNull(contactUsPage.errorMessageFromALLField());
    }

}
