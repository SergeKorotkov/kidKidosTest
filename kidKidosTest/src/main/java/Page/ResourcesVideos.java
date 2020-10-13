package Page;

public class ResourcesVideos extends BasePage {

    public static final String RESOURCES_VIDEOS = "//h1[text()='Fun and Educational Videos for Kids']";

    public boolean isPageTitleVisible() {
        return elementExists(RESOURCES_VIDEOS);
    }
}
