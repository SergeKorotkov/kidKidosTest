
import Page.CreateAccountPage;
import Page.EnglishPageBooks;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddBooksToCartTest extends UseCaseBase {
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);

    private static EnglishPageBooks englishPageBooks;

    @BeforeAll
    protected static void classSetup() {
        englishPageBooks = new EnglishPageBooks();
    }

    @BeforeEach
    public void beforeTest() {
        englishPageBooks.navigateToEnglishPage();
    }


    @Test
    public void addOneBookQuantityTest() {
        englishPageBooks.addMyMomBookToCart("1");
        assertEquals("1", englishPageBooks.getValueFromQuantityField());
        boolean success = englishPageBooks.isMyMomBookVisibleInCart();
        assertTrue(success);
    }

    @Test
    public void addManyBooksQuantityTest() {
        englishPageBooks.addAmandaBookToCart("15");
        boolean success = englishPageBooks.isAmandaBookVisibleInCart();
        assertTrue(success);
        assertEquals("15", englishPageBooks.getValueFromQuantityField());
    }

    @Test
    public void addManyDifferentEnglishBooksToCart() {
        englishPageBooks.addDifferentEnglishBooksToCart("1", "1", "1");
        boolean successAmanda = englishPageBooks.isMyMomBookVisibleInCart();
        boolean successILove = englishPageBooks.isILoveBookVisibleInCart();
        boolean successBoxer = englishPageBooks.isBoxerBookVisibleInCart();
        assertTrue(successAmanda);
        assertTrue(successILove);
        assertTrue(successBoxer);
    }
    @Test
    public void addDifferentLanguagesBookTest() {
        englishPageBooks.addWheelsFrenchBookToCart("1");
        boolean successFrench = englishPageBooks.isWheelsFrenchBookVisibleInCart();
        englishPageBooks.addWheelsSpanishBookToCart("1");
        boolean successSpanish = englishPageBooks.isWheelsSpanishBookVisibleInCart();
        assertTrue(successFrench);
        assertTrue(successSpanish);

    }
}
