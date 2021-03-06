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


public class LoginPageTest extends UseCaseBase {
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);

    private static LogInPage logInPage;

    @BeforeAll
    protected static void classSetup() {
        logInPage = new LogInPage();
    }
    @BeforeEach
    public void beforeTest() {
        logInPage.navigateToLoginPage();
    }
    @Test
    public void LoginPageVisibleTest() {
        logger.info("Login page load test");
        boolean success=logInPage.isPageTitleVisible();
        LogInPage.takeScreenshot("LoginPageTest");
        assertTrue(success);
    }
    @ParameterizedTest
    @ValueSource(strings = {"Gousar", "6878782222", "a@a.ru", "", "llllllllllllljkk389399305454544lkihugyfutfddfhddchgfgf;'mz6//'l", "null"})
    public void emailInputTest(String text) {
        logInPage.sendTextToMail(text);
        logInPage.getTextFromMailField();
        assertEquals(text, logInPage.getTextFromMailField());
    }
    @ParameterizedTest
    @ValueSource(strings = {"Gousar", "6878782222", "a@a.ru", "", "llllllllllllljkk389399305454544lkihugyfutfddfhddchgfgf;'mz6//'l", "null"})
    public void passwordInputTest(String text) {
        logInPage.sendTextToPasswordField(text);
        logInPage.getTextFromPasswordField();
        assertEquals(text, logInPage.getTextFromPasswordField());
    }
    @Test
    public void errorMessageFromMessageFieldTest(){
        logInPage.sendTextToPasswordField("very difficult password with numbers and special characters");
        logInPage.sendTextToMail("d'artagnan@macho.com");
        logInPage.clickButtonSignIn();
        boolean success=logInPage.errorMessage();
        assertTrue(success);
    }
    @Test
    public void clickCreateAccountButtonTest(){
      CreateAccountPage createAccountPage=logInPage.clickButtonCreateAccount();
      boolean isLoaded=createAccountPage.isPageTitleVisible();
      assertTrue(isLoaded);
    }
}
