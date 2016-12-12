package RapidRecovery.com.tabs;

import RapidRecovery.com.PageObject.tabs.BaseTab;
import RapidRecovery.com.PageObject.tabs.ReplicationTab;
import RapidRecovery.com.WebHelpPage;
import RapidRecovery.com.util.IncomingReplicationException;
import org.testng.annotations.BeforeMethod;

public class ReplicationTabTest extends BaseTabTest {

    @BeforeMethod
    public void beforeMethod()
    {    replicationTab = new ReplicationTab();
        replicationTab.openTab(BaseTab.Tabs.ReplicationTab);

    }

    @org.testng.annotations.Test
    public void replicationSummaryWebHelp() {
        replicationTab.checkWebHelp(ReplicationTab.CSS_REPLICATION_SUMMARY_HELP, WebHelpPage.TEXT_REPL_TAB);
    }

    @org.testng.annotations.Test
    public void outgoingReplicationSettings() {
        replicationTab.openOutgoingReplicationSettings();
        replicationTab.checkWebHelp(ReplicationTab.CSS_DIALOG_WINDOW_QUESTION_MARK, WebHelpPage.TEXT_OUT_REPL_SETTINGS);
        replicationTab.closeDialogWindow();

    }

    @org.testng.annotations.Test
    public void outgoingReplicationSchedule() {
        replicationTab.openReplicationScheduleWindow();
        replicationTab.checkWebHelp(ReplicationTab.CSS_DIALOG_WINDOW_QUESTION_MARK, WebHelpPage.TEXT_OUT_REPL_SCHEDULE);
        replicationTab.closeDialogWindow();

    }

    @org.testng.annotations.Test
    public void incomingReplicationConsume() throws IncomingReplicationException {
        replicationTab.consumeSeedDriveforIncomingReplication();
        replicationTab.checkWebHelp(ReplicationTab.CSS_DIALOG_WINDOW_QUESTION_MARK, WebHelpPage.TEXT_CONSUME_SEED_DRIVE);
        replicationTab.closeDialogWindow();
    }


}
