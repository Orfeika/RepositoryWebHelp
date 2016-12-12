package RapidRecovery.com.tabs;



import RapidRecovery.com.PageObject.tabs.CoreHomeTab;
import RapidRecovery.com.WebHelpPage;
import org.testng.annotations.BeforeMethod;

public class CoreHomeTabTest extends BaseTabTest {
    @BeforeMethod
    public void beforeMethod() {
        coreHomeTab = new CoreHomeTab();
        coreHomeTab.openHomePage();

    }


    @org.testng.annotations.Test
    public void coreSummaryWebHelp() {
        coreHomeTab.checkWebHelp(CoreHomeTab.CSS_SUMMARY_HELP, webHelpPage.getLocalizedText(WebHelpPage.TEXT_SUMMARY_TAB));
    }

    @org.testng.annotations.Test
    public void coreHelpMenu() {
        coreHomeTab.openHelpDropdown();
        coreHomeTab.checkWebHelp(CoreHomeTab.CSS_HELP_MENU_HELP,webHelpPage.getLocalizedText(WebHelpPage.TEXT_INTRODUCTION));
    }



}
