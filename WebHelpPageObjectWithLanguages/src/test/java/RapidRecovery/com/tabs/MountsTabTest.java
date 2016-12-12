package RapidRecovery.com.tabs;
import RapidRecovery.com.PageObject.tabs.BaseTab;
import RapidRecovery.com.PageObject.tabs.MountsTab;
import RapidRecovery.com.WebHelpPage;
import org.testng.annotations.BeforeMethod;

public class MountsTabTest extends BaseTabTest {


    @BeforeMethod
    public void beforeMethod(){
        mountsTab = new MountsTab();
        mountsTab.openTab(BaseTab.Tabs.MountsTab);
    }

    @org.testng.annotations.Test
    public void localMountWebHelp() {
        mountsTab.checkWebHelp(MountsTab.CSS_lOCAL_MOUNTS, WebHelpPage.TEXT_DISMOUNTING_RP);
    }
    @org.testng.annotations.Test
    public void remoteMountWebHelp() {
        mountsTab.checkWebHelp(MountsTab.CSS_REMOTE_MOUNTS,WebHelpPage.TEXT_DISMOUNTING_RP);
    }

}
