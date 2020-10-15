package Page;

public class CartPage extends BasePage{
    public static final String CART_HEADER = "//h1[text()='Your cart']";

    public boolean isPageTitleVisible() {
        return elementExists(CART_HEADER);
    }
}
