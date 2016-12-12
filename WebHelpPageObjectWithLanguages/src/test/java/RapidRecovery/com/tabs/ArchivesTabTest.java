package RapidRecovery.com.tabs;

import RapidRecovery.com.PageObject.tabs.ArchivesTab;
import RapidRecovery.com.PageObject.tabs.BaseTab;
import RapidRecovery.com.WebHelpPage;
import org.testng.annotations.BeforeMethod;


public class ArchivesTabTest extends BaseTabTest {



    @BeforeMethod
    public void beforeMethod() {
        archivesTab = new ArchivesTab();
        archivesTab.openTab(BaseTab.Tabs.ArchiveTab);
    }


    @org.testng.annotations.Test
    public void archivesWebHelp() {
        archivesTab.checkWebHelp(ArchivesTab.CSS_HELP_ARCHIVES, WebHelpPage.TEXT_CREATE_ARCHIVE);
    }

    @org.testng.annotations.Test
    public void scheduledArchiveWebHelp() {
        archivesTab.checkWebHelp(ArchivesTab.CSS_HELP_SCHEDULED_ARCHIVES,WebHelpPage.TEXT_SCHEDULED_ARCHIVE);
    }

  @org.testng.annotations.Test
    public void addAttachedArchiveWebHelp() {
      archivesTab.openAttachArchiveWindow();
      archivesTab.checkWebHelp(ArchivesTab.CSS_DIALOG_WINDOW_QUESTION_MARK,WebHelpPage.TEXT_ATTACH_ARCHIVE);
      archivesTab.closeDialogWindow();

  }

   @org.testng.annotations.Test
   public void checkArchiveWebHelp() {
       archivesTab.openCheckArchiveWindow();
       archivesTab.checkWebHelp(ArchivesTab.CSS_DIALOG_WINDOW_QUESTION_MARK,WebHelpPage.TEXT_CHECK_ARCHIVE);
       archivesTab.closeDialogWindow();

   }
    @org.testng.annotations.Test
    public void scheduledArchiveImportWebHelp() {
        archivesTab.checkWebHelp(ArchivesTab.CSS_HELP_SCHEDULED_ARCHIVES_IMPORT,WebHelpPage.TEXT_IMPORT_ARCHIVE);
    }
    @org.testng.annotations.Test
    public void attachedArchiveWebHelp() {
        archivesTab.checkWebHelp(ArchivesTab.CSS_HELP_ATTACHED_ARCHIVES,WebHelpPage.TEXT_ATTACH_ARCHIVE);

    }
}