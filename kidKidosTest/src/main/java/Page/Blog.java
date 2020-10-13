package Page;

public class Blog extends BasePage {

    public static final String BLOG_HEADER = "//a[text()='Blog'][@class='site-nav__link site-nav__link--main']";

    public boolean isPageTitleVisible() {

        return elementExists(BLOG_HEADER);
    }
}
