package Page;

public class ResourcesBlog extends BasePage {

    public static final String RESOURCES_BLOG = "//h1[text()='Blog']";

    public boolean isPageTitleVisible() {
        return elementExists(RESOURCES_BLOG);
    }
}
