
import Page.*;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MainPageDropMenuTest extends UseCaseBase{
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
    public void openEBooksByLanguagesBulgarianMenu() {
        EBooksBulgarian eBooksBulgarian = mainPage.openEBooksBulgarianTab();
        boolean isLoaded = eBooksBulgarian.isPageTitleVisible();
        assertTrue(isLoaded);
    }
    @Test
    public void openEBooksByLanguagesArabianMenu() {
        LangeArab langeArab = mainPage.openEBooksArabianTab();
        boolean isLoaded = langeArab.isPageTitleVisible();
        assertTrue(isLoaded);
    }
    @Test
    public void openBooksByLanguagesDanish() {
        BooksByLanguagesDanish booksByLanguagesDanish = mainPage.openBooksByLanguagesDanishTab();
        boolean isLoaded =booksByLanguagesDanish.isPageTitleVisible();
        assertTrue(isLoaded);
    }
    @Test
    public void openBooksByLanguagesFrench() {
        BooksByLanguagesFrench booksByLanguagesFrench = mainPage.openBooksByLanguagesFrenchTab();
        boolean isLoaded =booksByLanguagesFrench.isPageTitleVisible();
        assertTrue(isLoaded);
    }
    @Test
    public void openResourcesVideos() {
        ResourcesVideos resourcesVideos = mainPage.openResourcesVideos();
        boolean isLoaded =resourcesVideos.isPageTitleVisible();
        assertTrue(isLoaded);
    }
    @Test
    public void openResourcesBlog() {
        ResourcesBlog resourcesBlog = mainPage.openResourcesBlog();
        boolean isLoaded =resourcesBlog.isPageTitleVisible();
        assertTrue(isLoaded);
    }
}
