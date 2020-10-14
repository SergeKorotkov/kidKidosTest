package Consts;

public class Consts {
    public static final String MAIN_URL = "https://kidkiddos.com";
    public static final String CONTACT_US_PAGE_URL = "https://kidkiddos.com/pages/contact-us";
    public static final String LOGIN_PAGE_URL = "https://kidkiddos.com/account/login";
    public static final String CREATE_ACCOUNT_PAGE_URL = "https://kidkiddos.com/account/register";
    public static final String FIRST_NAME_XPATH = "//input[@name='field[3]']";
    public static final String YOUR_MESSAGE_XPATH = "//*[@data-name ='your_message']";
    public static final String EMAIL_XPATH = "//*[@name='email']";
    public static final String ERROR_NAME_XPATH = "(//*[text()='This field is required.'])[0]";
    public static final String ERROR_ALL_FIELDS_XPATH = "//*[text()='This field is required.']";
    public static final String ERROR_WRONG_EMAIL_XPATH = "//*[text() ='Enter a valid email address.']";
    public static final String BUTTON_SEND_XPATH = "//button[@id='_form_44_submit']";
    public static final String CONTACT_US_OPTION = "//a[text()='Contact us']";
    public static final String LOGIN_OPTION = "//*[@class='site-header__account']";
    public static final String SIGN_IN_BUTTON = "//*[@value='Sign In']";
    public static final String LOGIN_EMAIL_FIELD = "//*[@name='customer[email]']";
    public static final String LOGIN_PASSWORD_FIELD = "//*[@name='customer[password]']";
    public static final String LOGIN_INCORRECT_EMAIL_MESSAGE = "//*[text()='Incorrect email or password.']";
    public static final String LOGIN_FORGOT_PASSWORD_BUTTON = "//a[@id='RecoverPassword']";
    public static final String CREATE_ACCOUNT_BUTTON = "//a[@id='customer_register_link']";
    public static final String CREATE_BUTTON = "//*[@value='Create']";
    public static final String CREATE_ACCOUNT_FIRST_NAME_FIELD = "//*[@name='customer[first_name]']";
    public static final String CREATE_ACCOUNT_LAST_NAME_FIELD = "//*[@name='customer[last_name]']";
    public static final String CREATE_ACCOUNT_EMAIL_FIELD = "//*[@name='customer[email]']";
    public static final String CREATE_ACCOUNT_PASSWORD_FIELD = "//*[@name='customer[password]']";
    public static final String CREATE_ACCOUNT_ERROR_PASSWORD_FIELD = "//*[text()='Password can't be blank.']";
    public static final String CREATE_ACCOUNT_ERROR_EMAIL_FIELD = "//*[text()='Email can't be blank.']";
}