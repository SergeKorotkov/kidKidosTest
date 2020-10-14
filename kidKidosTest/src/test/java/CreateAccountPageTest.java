import Page.CreateAccountPage;
import Page.LogInPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CreateAccountPageTest extends UseCaseBase {
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);

    private static CreateAccountPage createAccountPage;

    @BeforeAll
    protected static void classSetup() {
        createAccountPage = new CreateAccountPage();
    }
    @BeforeEach
    public void beforeTest() {
        createAccountPage.navigateToLoginPage();
    }
    @Test
    public void CreateAccountPageVisibleTest() {
        logger.info("Create Account Page load test");
        boolean success=createAccountPage.isPageTitleVisible();
        CreateAccountPage.takeScreenshot("CreateAccountPageTest");
        assertTrue(success);
    }
    @ParameterizedTest
    @ValueSource(strings = {"Gousar", "6878782222", "a@a.ru", "", "llllllllllllljkk389399305454544lkihugyfutfddfhddchgfgf;'mz6//'l", "null"})
    public void emailInputTest(String text) {
        createAccountPage.sendTextToEMail(text);
        createAccountPage.getTextFromEMailField();
        assertEquals(text, createAccountPage.getTextFromEMailField());
    }
    @ParameterizedTest
    @ValueSource(strings = {"Gousar", "6878782222", "a@a.ru", "", "llllllllllllljkk389399305454544lkihugyfutfddfhddchgfgf;'mz6//'l", "null"})
    public void passwordInputTest(String text) {
        createAccountPage.sendTextToPasswordField(text);
        createAccountPage.getTextFromPasswordField();
        assertEquals(text, createAccountPage.getTextFromPasswordField());
    }
    @ParameterizedTest
    @ValueSource(strings = {"Gousar", "6878782222", "a@a.ru", "", "llllllllllllljkk389399305454544lkihugyfutfddfhddchgfgf;'mz6//'l", "null"})
    public void firstNameInputTest(String text) {
        createAccountPage.sendTextToFirstNameField(text);
        createAccountPage.getTextFromFirstNameField();
        assertEquals(text, createAccountPage.getTextFromFirstNameField());
    }
    @ParameterizedTest
    @ValueSource(strings = {"Gousar", "6878782222", "a@a.ru", "", "llllllllllllljkk389399305454544lkihugyfutfddfhddchgfgf;'mz6//'l", "null"})
    public void lastNameInputTest(String text) {
        createAccountPage.sendTextToLastNameField(text);
        createAccountPage.getTextFromLastNameField();
        assertEquals(text, createAccountPage.getTextFromLastNameField());
    }
    @Test
    public void errorMessageFromEmailFieldTest(){
        createAccountPage.clickButtonCreate();
        boolean success=createAccountPage.errorMessageEmail();
        assertTrue(success);
    }
    @Test
    public void errorMessageFromPasswordFieldTest(){
        createAccountPage.clickButtonCreate();
        boolean success=createAccountPage.errorMessagePassword();
        assertTrue(success);
    }
}
