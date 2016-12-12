package RapidRecovery.com.tabs;
import RapidRecovery.com.PageObject.tabs.BaseTab;
import RapidRecovery.com.PageObject.tabs.EncryptionKeyTab;
import RapidRecovery.com.WebHelpPage;
import org.testng.annotations.BeforeMethod;

public class EncryptionKeysTabTestTab extends BaseTabTest {


    @BeforeMethod
    public void beforeMethod() {
        encryptionKeyTab = new EncryptionKeyTab();
        encryptionKeyTab.openTab(BaseTab.Tabs.EncryptionKeyTab);
    }

    @org.testng.annotations.Test
    public void encryptionKeyWebHelp() {
        encryptionKeyTab.checkWebHelp(EncryptionKeyTab.CSS_HELP_ENCRYPION_KEY, webHelpPage.getLocalizedText(WebHelpPage.TEXT_ENCRYPTION_KEY));
    }
    @org.testng.annotations.Test
    public void addEncryptionKeyWebHelp() {
        encryptionKeyTab.openAddEncryptionKeyWindow();
        encryptionKeyTab.checkWebHelp(EncryptionKeyTab.CSS_DIALOG_WINDOW_QUESTION_MARK,webHelpPage.getLocalizedText(WebHelpPage.TEXT_ADDING_ENCRYPTION_KEY));
        encryptionKeyTab.closeDialogWindow();

    }





}
