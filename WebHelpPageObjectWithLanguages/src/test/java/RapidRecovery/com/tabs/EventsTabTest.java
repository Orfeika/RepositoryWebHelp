package RapidRecovery.com.tabs;

import RapidRecovery.com.PageObject.enums.LocalizedLanguages;
import RapidRecovery.com.PageObject.tabs.BaseTab;
import RapidRecovery.com.WebHelpPage;
import org.testng.annotations.BeforeMethod;

public class EventsTabTest extends BaseTabTest {
    private final LocalizedLanguages language;

    public EventsTabTest(LocalizedLanguages language) {
        this.language = language;
    }

    @BeforeMethod
    public void beforeMethod() {
            tab = new BaseTab();
            tab.openTab(BaseTab.Tabs.EventsTab);
    }


    @org.testng.annotations.Test
    public void coreSummaryWebHelp() {
        tab.checkWebHelp(BaseTab.CSS_SUMMARY_HELP, webHelpPage.getLocalizedText(WebHelpPage.TEXT_EVENTS));
    }
}
