package RapidRecovery.com.tabs;

import RapidRecovery.com.PageObject.tabs.BaseTab;
import RapidRecovery.com.PageObject.tabs.RetentionPolicyTab;
import RapidRecovery.com.WebHelpPage;
import org.testng.annotations.BeforeMethod;

public class RetentionPolicyTabTest extends BaseTabTest {

    @BeforeMethod
    public void beforeMethod() {
        retentionPolicyTabTab = new RetentionPolicyTab();
        retentionPolicyTabTab.openTab(BaseTab.Tabs.RetentionPolicyTab);
    }

     @org.testng.annotations.Test
    public void retentionPolicyWebHelp() {
                retentionPolicyTabTab.checkWebHelp(RetentionPolicyTab.CSS_HELP_RETENTION_POLICY, webHelpPage.getLocalizedText(WebHelpPage.TEXT_CORE_RETENTION_POLICY));
    }



}

