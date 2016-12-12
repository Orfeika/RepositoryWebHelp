package RapidRecovery.com.tabs;

import RapidRecovery.com.PageObject.tabs.BootCDTab;
import RapidRecovery.com.PageObject.tabs.BaseTab;
import RapidRecovery.com.WebHelpPage;
import org.testng.annotations.BeforeMethod;

public class BootCDTest extends BaseTabTest {

    @BeforeMethod
    public void beforeMethod(){
        bootCDTab = new BootCDTab();
        bootCDTab.openTab(BaseTab.Tabs.BootCDTab);
    }

    @org.testng.annotations.Test
    public void bootCDHelp() {
        bootCDTab.checkWebHelp(BootCDTab.CSS_HELP_BOOT_CD, WebHelpPage.TEXT_CREATING_BOOT_CD);
    }

    @org.testng.annotations.Test
    public void addNewBootCDHelp() {
        bootCDTab.openCreateBootCDWindow();
        bootCDTab.checkWebHelp(BootCDTab.CSS_DIALOG_WINDOW_QUESTION_MARK,WebHelpPage.TEXT_CREATING_BOOT_CD);
        bootCDTab.closeDialogWindow();
    }


}
