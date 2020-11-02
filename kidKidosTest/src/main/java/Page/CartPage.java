package Page;

import static Consts.Consts.*;

public class CartPage extends BasePage{
    public void navigateToCartPage() {
        webDriver.get(CART_PAGE_URL);
    }
    public static final String CART_HEADER = "//h1[text()='Your cart']";

    public boolean isPageTitleVisible() {
        return elementExists(CART_HEADER);
    }
    public boolean isAmandaBookVisibleInCart() {
        return elementExists(AMANDA_BOOK_IN_CART_PAGE);
    }

    public void sendQuantityToField(String quantity) {
        findElementByXpath(QUANTITY_FIELD_CART_PAGE).sendKeys(quantity);
    }
    public String getTextFromQuantityField() {
        findElementByXpath(QUANTITY_FIELD_CART_PAGE).getAttribute("value");
        return findElementByXpath(QUANTITY_FIELD_CART_PAGE).getAttribute("value");
    }
}
