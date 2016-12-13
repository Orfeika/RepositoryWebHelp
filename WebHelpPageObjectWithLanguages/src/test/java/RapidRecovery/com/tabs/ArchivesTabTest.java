package RapidRecovery.com.tabs;

import RapidRecovery.com.PageObject.enums.LocalizedLanguages;
import RapidRecovery.com.PageObject.tabs.ArchivesTab;
import RapidRecovery.com.PageObject.tabs.BaseTab;
import RapidRecovery.com.WebHelpPage;
import RapidRecovery.com.util.ConfigurationFileLoader;
import RapidRecovery.com.util.DriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public class ArchivesTabTest extends BaseTabTest {
    private LocalizedLanguages language;

    public ArchivesTabTest(LocalizedLanguages language) {
        this.language = language;
    }

    @BeforeClass
    public void beforeClass() {
        driver = DriverManager.getInstance().createDriver();
        configurations = ConfigurationFileLoader.getInstance();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        archivesTab = new ArchivesTab();
        archivesTab.changeLang(language);
    }
    @BeforeMethod
    public void beforeMethod() {
        archivesTab.openTab(BaseTab.Tabs.ArchiveTab);
    }


    @org.testng.annotations.Test
    public void archivesWebHelp() {
        archivesTab.checkWebHelp(ArchivesTab.CSS_HELP_ARCHIVES, webHelpPage.getLocalizedText(WebHelpPage.TEXT_CREATE_ARCHIVE));
    }

    @org.testng.annotations.Test
    public void scheduledArchiveWebHelp() {
        archivesTab.checkWebHelp(ArchivesTab.CSS_HELP_SCHEDULED_ARCHIVES,webHelpPage.getLocalizedText(WebHelpPage.TEXT_SCHEDULED_ARCHIVE));
    }

  @org.testng.annotations.Test
    public void addAttachedArchiveWebHelp() {
      archivesTab.openAttachArchiveWindow();
      archivesTab.checkWebHelp(ArchivesTab.CSS_DIALOG_WINDOW_QUESTION_MARK,webHelpPage.getLocalizedText(WebHelpPage.TEXT_ATTACH_ARCHIVE));
      archivesTab.closeDialogWindow();

  }

   @org.testng.annotations.Test
   public void checkArchiveWebHelp() {
       archivesTab.openCheckArchiveWindow();
       archivesTab.checkWebHelp(ArchivesTab.CSS_DIALOG_WINDOW_QUESTION_MARK,webHelpPage.getLocalizedText(WebHelpPage.TEXT_CHECK_ARCHIVE));
       archivesTab.closeDialogWindow();

   }
    @org.testng.annotations.Test
    public void scheduledArchiveImportWebHelp() {
        archivesTab.checkWebHelp(ArchivesTab.CSS_HELP_SCHEDULED_ARCHIVES_IMPORT,webHelpPage.getLocalizedText(WebHelpPage.TEXT_IMPORT_ARCHIVE));
    }
    @org.testng.annotations.Test
    public void attachedArchiveWebHelp() {
        archivesTab.checkWebHelp(ArchivesTab.CSS_HELP_ATTACHED_ARCHIVES,webHelpPage.getLocalizedText(WebHelpPage.TEXT_ATTACH_ARCHIVE));

    }
}
