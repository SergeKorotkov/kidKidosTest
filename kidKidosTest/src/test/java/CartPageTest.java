import Page.CartPage;
import Page.CreateAccountPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CartPageTest extends UseCaseBase {
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);

    private static CartPage cartPage;

    @BeforeAll
    protected static void classSetup() {
        cartPage = new CartPage();
    }
    @BeforeEach
    public void beforeTest() {
        cartPage.navigateToCartPage();
    }
}
