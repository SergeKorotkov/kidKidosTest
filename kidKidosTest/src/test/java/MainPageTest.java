
import Page.*;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainPageTest extends UseCaseBase {
    private static MainPage mainPage;
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }



    @Test
    public void mainPageLoadTest() {
        logger.info("Main page load test");
        Boolean success = mainPage.isLogoVisible();
        BasePage.takeScreenshot("MainPageTest");
        assertTrue(success);
    }

    @Test
    public void openContactUsPage() {
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        boolean isLoaded = contactUsPage.isPageTitleVisible();
        assertTrue(isLoaded);
    }

    @Test
    public void openBlog() {
        Blog blog = mainPage.openBlogTab();
        boolean isLoaded = blog.isPageTitleVisible();
        assertTrue(isLoaded);
    }
    @Test
    public void openFaqs() {
        FAQs faQs = mainPage.openFaqsTab();
        boolean isLoaded = faQs.isPageTitleVisible();
        assertTrue(isLoaded);
    }
    @Test
    public void openBooks() {
        BooksByLanguage booksByLanguage = mainPage.openBooksTab();
        boolean isLoaded = booksByLanguage.isPageTitleVisible();
        assertTrue(isLoaded);
    }
    @Test
    public void openEBooks() {
        EBooksByLanguage ebooksByLanguage = mainPage.openEBooksTab();
        boolean isLoaded = ebooksByLanguage.isPageTitleVisible();
        assertTrue(isLoaded);
    }
    @Test
    public void openEspanol() {
      Espanol espanol = mainPage.openEspanolTab();
        boolean isLoaded = espanol.isPageTitleVisible();
        assertTrue(isLoaded);
    }
    @Test
    public void openFrancais() {
        Francais francais = mainPage.openFrancaisTab();
        boolean isLoaded = francais.isPageTitleVisible();
        assertTrue(isLoaded);
    }
    @Test
    public void openChina() {
        China china = mainPage.openChinaTab();
        boolean isLoaded = china.isPageTitleVisible();
        assertTrue(isLoaded);
    }
    @Test
    public void openResources() {
       Resources resources = mainPage.openResourcesTab();
        boolean isLoaded = resources.isPageTitleVisible();
        assertTrue(isLoaded);
    }
    @Test
    public void openAllLanguages() {
        AllLanguages allLanguages = mainPage.openAllLanguagesTab();
        boolean isLoaded = allLanguages.isPageTitleVisible();
        assertTrue(isLoaded);
    }
}
