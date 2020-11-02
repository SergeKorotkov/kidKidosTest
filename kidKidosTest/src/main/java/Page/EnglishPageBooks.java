package Page;

import Consts.Consts;

import static Consts.Consts.*;

public class EnglishPageBooks extends BasePage{

    public void navigateToEnglishPage() {
        webDriver.get(ENGLISH_PAGE_URL);
    }
    public void clearQuantityCartField(){
        findElementByXpath(QUANTITY_FIELD_CART_PAGE).clear();
    }
    public boolean isPageTitleVisible() {
        return elementExists(ENGLISH_PAGE_HEADER);
    }
    public void clickAmandaBookButton() {
        clickElementByXpath(AMANDA_ENGLISH_BOOK);
    }
    public boolean isAmandaBookVisibleInCart() {
        return elementExists(AMANDA_BOOK_IN_CART_PAGE);
    }
    public boolean isMyMomBookVisibleInCart() {
        return elementExists(MY_MOM_BOOK_IN_CART_PAGE);
    }
    public boolean isWheelsFrenchBookVisibleInCart() {
        return elementExists(WHEELS_FRENCH_BOOK_IN_CART_PAGE);
    }
    public boolean isWheelsSpanishBookVisibleInCart() {
        return elementExists(WHEELS_SPANISH_BOOK_IN_CART_PAGE);
    }
    public boolean isILoveBookVisibleInCart() {
        return elementExists(I_LOVE_BOOK_IN_CART_PAGE);
    }
    public boolean isBoxerBookVisibleInCart() {
        return elementExists(BOXER_BOOK_IN_CART_PAGE);
    }
    public void clickAddToCartButton() {
        clickElementByXpath(ADD_TO_CART_BUTTON);
    }
    public void clickWheelsFrenchBook() {
        clickElementByXpath(WHEELS_FRENCH_BOOK);
    }
    public void sendQuantityToField(String quantity) {
        findElementByXpath(QUANTITY_FIELD_BOOKS_PAGE).clear();
        findElementByXpath(QUANTITY_FIELD_BOOKS_PAGE).sendKeys(quantity);
    }
    public String getValueFromQuantityField() {
        findElementByXpath(QUANTITY_FIELD_CART_PAGE).getAttribute("value");
        return findElementByXpath(QUANTITY_FIELD_CART_PAGE).getAttribute("value");
    }
    public void addAmandaBookToCart(String quantity){
        clickElementByXpath(AMANDA_ENGLISH_BOOK);
        findElementByXpath(QUANTITY_FIELD_BOOKS_PAGE).clear();
        findElementByXpath(QUANTITY_FIELD_BOOKS_PAGE).sendKeys(quantity);
        clickElementByXpath(ADD_TO_CART_BUTTON);
    }
    public void addMyMomBookToCart(String quantity){
        clickElementByXpath(MY_MOM_ENGLISH_BOOK);
        findElementByXpath(QUANTITY_FIELD_BOOKS_PAGE).clear();
        findElementByXpath(QUANTITY_FIELD_BOOKS_PAGE).sendKeys(quantity);
        clickElementByXpath(ADD_TO_CART_BUTTON);
    }
    public void addWheelsFrenchBookToCart(String quantity){
        clickElementByXpath(FRANCAIS_BUTTON);
        clickElementByXpath(WHEELS_FRENCH_BOOK);
        findElementByXpath(QUANTITY_FIELD_BOOKS_PAGE).clear();
        findElementByXpath(QUANTITY_FIELD_BOOKS_PAGE).sendKeys(quantity);
        clickElementByXpath(ADD_TO_CART_BUTTON);
    }
    public void addWheelsSpanishBookToCart(String quantity){
        clickElementByXpath(SPANISH_BUTTON);
        clickElementByXpath(WHEELS_SPANISH_BOOK);
        findElementByXpath(QUANTITY_FIELD_BOOKS_PAGE).clear();
        findElementByXpath(QUANTITY_FIELD_BOOKS_PAGE).sendKeys(quantity);
        clickElementByXpath(ADD_TO_CART_BUTTON);
    }
    public void addDifferentEnglishBooksToCart(String qnAmanda,String qnILove,String qnBoxer){
        clickElementByXpath(MY_MOM_ENGLISH_BOOK);
        findElementByXpath(QUANTITY_FIELD_BOOKS_PAGE).clear();
        findElementByXpath(QUANTITY_FIELD_BOOKS_PAGE).sendKeys(qnAmanda);
        clickElementByXpath(ADD_TO_CART_BUTTON);
        webDriver.get(ENGLISH_PAGE_URL);
        clickElementByXpath(I_LOVE_TO_SHARE_ENGLISH_BOOK);
        findElementByXpath(QUANTITY_FIELD_BOOKS_PAGE).clear();
        findElementByXpath(QUANTITY_FIELD_BOOKS_PAGE).sendKeys(qnILove);
        clickElementByXpath(ADD_TO_CART_BUTTON);
        webDriver.get(ENGLISH_PAGE_URL);
        clickElementByXpath(Boxer_AND_BRANDON_ENGLISH_BOOK);
        findElementByXpath(QUANTITY_FIELD_BOOKS_PAGE).clear();
        findElementByXpath(QUANTITY_FIELD_BOOKS_PAGE).sendKeys(qnBoxer);
        clickElementByXpath(ADD_TO_CART_BUTTON);
    }

}
