package Page;

public class FAQs extends BasePage {

    public static final String FAQS_HEADER = "//a[text()='FAQs']";

    public boolean isPageTitleVisible() {
        return elementExists(FAQS_HEADER);
    }
}
