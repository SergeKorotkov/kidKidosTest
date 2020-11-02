package Page;

import Consts.Consts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Consts.Consts.LOGIN_EMAIL_FIELD;

public class MainPage extends BasePage{

    private static final String LOGO_IMG = "//img[@itemprop='logo']";
    private static final String CONTACT_US_OPTION = "//a[text()='Contact us']";
    private static final String BLOG_OPTION = "//a[text()='Blog'][@class='site-nav__link site-nav__link--main']";
    private static final String FAQS_OPTION = "//a[text()='FAQs']";
    private static final String BOOKS_BY_LANGUAGE_OPTION = "//a[text()='Books by language']";
    private static final String EBOOKS_BY_LANGUAGE_OPTION = "//a[@aria-controls='SiteNavLabel-ebooks-by-language']";
    private static final String ESPANOL_OPTION = "//a[text()='Español']";
    private static final String FRANCAIS_OPTION = "//a[text()='Français']";
    private static final String CHINA_OPTION = "//a[text()='中文']";
    private static final String ALL_LANGUAGES_OPTION = "//a[@aria-controls='SiteNavLabel-all-languages']";
    private static final String EBOOKS_BY_ARABIAN_OPTION = "(//*[text()='Arabic - عربي'])[2]";
    private static final String EBOOKS_BY_BULGARIAN_OPTION = "(//*[text()='Bulgarian-Български'])[2]";
    private static final String BOOKS_BY_DANISH_OPTION = "(//*[@class='collection-grid-item__title'])[contains(text(),'Danish - Dansk')]";
    private static final String BOOKS_BY_French_OPTION = "(//*[@class='collection-grid-item__title'])[contains(text(),'French - Français')]";
    private static final String RESOURCES_OPTION = "//a[@aria-controls='SiteNavLabel-resources']";
    private static final String RESOURCES_VIDEOS_OPTION = "//*[text()='Videos']";
    private static final String RESOURCES_BLOG_OPTION = "//*[text()='Blog']";
    private static final String FIRST_NAME_XPATH = "//input[@name='field[3]']";
    private static final String YOUR_MESSAGE_XPATH = "//*[@data-name ='your_message']";
    private static final String EMAIL_XPATH = "//*[@name='email']";
    private static final String Main_PAGE_ICON_LOGIN = "//*[@class='icon icon-login']";
    private static final String Main_PAGE_ICON_CART = "//*[@class='icon icon-cart']";
    private static final String Main_PAGE_ICON_CURRENCY = "//*[@class='currency-converter-currency-button-text']";
    private static final String Main_PAGE_ICON_CURRENCY_CAD = "//*[text()='CAD']";
    private static final String Main_PAGE_ICON_CURRENCY_EUR = "//*[text()='EUR']";
    private static final String CART_HEADER = "//h1[text()='Your cart']";
    private static final String LOGIN_HEADER = "//h1[text()='Login']";


    public void navigateToMainPage(){
        webDriver.get(Consts.MAIN_URL);
    }


    public boolean isLogoVisible(){
        boolean isVisible =  elementExists(LOGO_IMG);
        return isVisible;
    }
    public boolean isPageIconLoginVisible() {
        return elementExists(Main_PAGE_ICON_LOGIN);
    }

    public boolean isPageIconCartVisible() {
        return elementExists(Main_PAGE_ICON_CART);
    }
    public boolean isPageIconCurrencyVisible() {
        return elementExists(Main_PAGE_ICON_CURRENCY);
    }
    public void clickIconCurrency() {
        clickElementByXpath(Main_PAGE_ICON_CURRENCY);
    }
    public void clickIconCart() {
        clickElementByXpath(Main_PAGE_ICON_CART);
    }
    public void clickIconLogin() {
        clickElementByXpath(Main_PAGE_ICON_LOGIN);
    }
    public boolean isPageLoginDisplayed() {
        return elementExists(LOGIN_HEADER);
    }
    public boolean isPageCartDisplayed() {
        return elementExists(CART_HEADER);
    }
    public boolean isPageIconCurrencyCAD() {
        return elementExists(Main_PAGE_ICON_CURRENCY_CAD);
    }
    public boolean isPageIconCurrencyEUR() {
        return elementExists(Main_PAGE_ICON_CURRENCY_EUR);
    }


    public ContactUsPage openContactUsTab(){
        clickElementByXpath(CONTACT_US_OPTION);
        return new ContactUsPage();
    }

    public Blog openBlogTab() {
        clickElementByXpath(BLOG_OPTION);
        return new Blog();
    }
    public FAQs openFaqsTab() {
        clickElementByXpath(FAQS_OPTION);
        return new FAQs();
    }
    public BooksByLanguage openBooksTab() {
        clickElementByXpath(BOOKS_BY_LANGUAGE_OPTION);
        return new BooksByLanguage();
    }
    public EBooksByLanguage openEBooksTab() {
        clickElementByXpath(EBOOKS_BY_LANGUAGE_OPTION);
        return new EBooksByLanguage();
    }

    public Espanol openEspanolTab() {
        clickElementByXpath(ESPANOL_OPTION);
        return new Espanol();
    }
    public Francais openFrancaisTab() {
        clickElementByXpath(FRANCAIS_OPTION);
        return new Francais();
    }
    public China openChinaTab() {
        clickElementByXpath(CHINA_OPTION);
        return new China();
    }
    public AllLanguages openAllLanguagesTab() {
        clickElementByXpath(ALL_LANGUAGES_OPTION);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ALL_LANGUAGES_OPTION)));
        clickElementByXpath(ALL_LANGUAGES_OPTION);
        return new AllLanguages();
    }

    public Resources openResourcesTab() {
        clickElementByXpath(RESOURCES_OPTION);
        return new Resources();
    }
    public LangeArab openEBooksArabianTab() {
        clickElementByXpath(EBOOKS_BY_LANGUAGE_OPTION);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(EBOOKS_BY_LANGUAGE_OPTION)));
        clickElementByXpath(EBOOKS_BY_ARABIAN_OPTION);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(EBOOKS_BY_ARABIAN_OPTION)));
        return new LangeArab();
    }
    public EBooksBulgarian openEBooksBulgarianTab() {
        clickElementByXpath(EBOOKS_BY_LANGUAGE_OPTION);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BOOKS_BY_LANGUAGE_OPTION)));
        clickElementByXpath(EBOOKS_BY_BULGARIAN_OPTION);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(EBOOKS_BY_BULGARIAN_OPTION)));
        return new EBooksBulgarian();
    }
    public BooksByLanguagesDanish openBooksByLanguagesDanishTab() {
        clickElementByXpath(BOOKS_BY_LANGUAGE_OPTION);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BOOKS_BY_LANGUAGE_OPTION)));
        clickElementByXpath(BOOKS_BY_DANISH_OPTION);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BOOKS_BY_DANISH_OPTION)));
        return new BooksByLanguagesDanish();
    }
    public BooksByLanguagesFrench openBooksByLanguagesFrenchTab() {
        clickElementByXpath(BOOKS_BY_LANGUAGE_OPTION);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BOOKS_BY_LANGUAGE_OPTION)));
        clickElementByXpath(BOOKS_BY_French_OPTION);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BOOKS_BY_French_OPTION)));
        return new BooksByLanguagesFrench();
    }
    public ResourcesVideos openResourcesVideos() {
        clickElementByXpath(RESOURCES_OPTION);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(RESOURCES_OPTION)));
        clickElementByXpath(RESOURCES_VIDEOS_OPTION);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(RESOURCES_VIDEOS_OPTION)));
        return new ResourcesVideos();
    }
    public ResourcesBlog openResourcesBlog() {
        clickElementByXpath(RESOURCES_OPTION);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(RESOURCES_OPTION)));
        clickElementByXpath(RESOURCES_BLOG_OPTION);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(RESOURCES_BLOG_OPTION)));
        return new ResourcesBlog();
    }

}