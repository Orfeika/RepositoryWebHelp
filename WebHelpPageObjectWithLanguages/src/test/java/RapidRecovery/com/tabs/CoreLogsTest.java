package RapidRecovery.com.tabs;
import RapidRecovery.com.PageObject.tabs.BaseTab;
import RapidRecovery.com.PageObject.tabs.CoreLogsTab;
import RapidRecovery.com.WebHelpPage;

public class CoreLogsTest extends BaseTabTest {
    public void beforeMethod(){
        coreLogsTab = new CoreLogsTab();
        coreLogsTab.openTab(BaseTab.Tabs.CoreLogs);
    }
      @org.testng.annotations.Test
    public void coreLogsWebHelp() {
          coreLogsTab.checkWebHelp(CoreLogsTab.CSS_HELP_CORE_LOGS, WebHelpPage.TEXT_DOWNLOAD_CORE_LOGS);
    }
}
