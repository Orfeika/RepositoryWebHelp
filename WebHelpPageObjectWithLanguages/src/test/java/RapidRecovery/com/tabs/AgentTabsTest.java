package RapidRecovery.com.tabs;

import RapidRecovery.com.PageObject.tabs.AgentTabs;
import RapidRecovery.com.WebHelpPage;
import org.testng.annotations.BeforeMethod;


/**
 * Created by 1 on 11/17/2016.
 */
public class AgentTabsTest extends BaseTabTest {



   @BeforeMethod
   public void beforeMethod(){
       agentTabs = new AgentTabs();
       agentTabs.selectTheAgent();
   }

    @org.testng.annotations.Test
    public void agentSummaryTabTest() {
        agentTabs.openAgentTab(AgentTabs.CSS_AGENT_SUMMARY_TAB);
        agentTabs.checkWebHelp(AgentTabs.CSS_AGENT_SUMMARY_HELP, WebHelpPage.TEXT_SUMMARY_TAB);
    }

    @org.testng.annotations.Test
    public void agentRecoveryPointsTabTest() {
        agentTabs.openAgentTab(AgentTabs.CSS_AGENT_RP_TAB);
        agentTabs.checkWebHelp(AgentTabs.CSS_AGENT_HELP,WebHelpPage.TEXT_AGENT_RECOVERY_POINTS);
    }

    @org.testng.annotations.Test
    public void agentEventsTabTest() {
        agentTabs.openAgentTab(AgentTabs.CSS_AGENT_EVENTS_TAB);
        agentTabs.checkWebHelp(AgentTabs.CSS_AGENT_EVENTS_HELP,WebHelpPage.TEXT_EVENTS);
    }
    @org.testng.annotations.Test
    public void agentSettingsTabTest() {
        agentTabs.openAgentTab(AgentTabs.CSS_AGENT_SETTINGS_TAB);
        agentTabs.checkWebHelp(AgentTabs.CSS_AGENT_HELP,WebHelpPage.TEXT_AGENT_SETTINGS);
    }

    @org.testng.annotations.Test
    public void agentSettingsGeneralTest() {
        agentTabs.openAgentTab(AgentTabs.CSS_AGENT_SETTINGS_TAB);
        agentTabs.checkWebHelp(AgentTabs.CSS_AGENT_GENERAL_SETTINGS,WebHelpPage.TEXT_AGENT_SETTINGS_GENERAL);
    }

    @org.testng.annotations.Test
    public void agentSettingsNightlyJobsTest() {
        agentTabs.openAgentTab(AgentTabs.CSS_AGENT_SETTINGS_TAB);
        agentTabs.checkWebHelp(AgentTabs.CSS_AGENT_NIGHTLY_JOB_SETTINGS,WebHelpPage.TEXT_AGENT_SETTINGS_NIGHTLY_JOBS);
    }

    @org.testng.annotations.Test
    public void agentSettingsLicensingTest() {
        agentTabs.openAgentTab(AgentTabs.CSS_AGENT_SETTINGS_TAB);
        agentTabs.checkWebHelp(AgentTabs.CSS_AGENT_LICENSING_SETTINGS,WebHelpPage.TEXT_AGENT_LICENSE_DETAILS);
    }

    @org.testng.annotations.Test
   public void agentJobReportsTest() {
        agentTabs.openAgentTab(AgentTabs.CSS_AGENT_REPORTS_DRPDWN,AgentTabs.CSS_AGENT_JOB_REPORT);
        agentTabs.checkWebHelp(AgentTabs.CSS_AGENT_REPORT_HELP,WebHelpPage.TEXT_JOB_REPORT);

    }



    @org.testng.annotations.Test
    public void agentFailureReportsTest() {
        agentTabs.openAgentTab(AgentTabs.CSS_AGENT_REPORTS_DRPDWN,AgentTabs.CSS_AGENT_FAILURE_REPORT);
        agentTabs.checkWebHelp(AgentTabs.CSS_AGENT_REPORT_HELP,WebHelpPage.TEXT_FAILURE_REPORT);
    }


    @org.testng.annotations.Test
    public void agentSystemInfoTest() {
        agentTabs.openAgentTab(AgentTabs.CSS_AGENT_MORE_DRPDWN,AgentTabs.CSS_AGENT_SYSTEM_INFO);
        agentTabs.checkWebHelp(AgentTabs.CSS_AGENT_HELP,WebHelpPage.TEXT_SYSTEM_INFO);
    }

   @org.testng.annotations.Test
   public void agentMountsTest() {
       agentTabs.openAgentTab(AgentTabs.CSS_AGENT_MORE_DRPDWN,AgentTabs.CSS_AGENT_MOUNTS);
       agentTabs.checkWebHelp(AgentTabs.CSS_AGENT_HELP,WebHelpPage.TEXT_MOUNT_RP);
   }

   @org.testng.annotations.Test
    public void agentLocalMountsTest() {
       agentTabs.openAgentTab(AgentTabs.CSS_AGENT_MORE_DRPDWN,AgentTabs.CSS_AGENT_MOUNTS);
       agentTabs.checkWebHelp(AgentTabs.CSS_AGENT_LOCAL_MOUNTS_HELP,WebHelpPage.TEXT_MOUNT_RP);

   }

   @org.testng.annotations.Test
    public void agentRemoteMountsTest() {
       agentTabs.openAgentTab(AgentTabs.CSS_AGENT_MORE_DRPDWN,AgentTabs.CSS_AGENT_MOUNTS);
       agentTabs.checkWebHelp(AgentTabs.CSS_AGENT_REMOTE_MOUNTS_HELP,WebHelpPage.TEXT_DISMOUNTING_RP);

   }

   @org.testng.annotations.Test
   public void agentRetentionPolicyTest() {
       agentTabs.openAgentTab(AgentTabs.CSS_AGENT_MORE_DRPDWN,AgentTabs.CSS_AGENT_RETENTION_POLICY);
       agentTabs.checkWebHelp(AgentTabs.CSS_AGENT_RETENTION_POLICY_HELP,WebHelpPage.TEXT_RETENTION_POLICY);
   }

  @org.testng.annotations.Test
    public void agentNotificationsTest() {
      agentTabs.openAgentTab(AgentTabs.CSS_AGENT_MORE_DRPDWN,AgentTabs.CSS_AGENT_NOTIFICATIONS);
      agentTabs.checkWebHelp(AgentTabs.CSS_AGENT_NOTIFICATIONS_HELP,WebHelpPage.TEXT_NOTIFICATIONS);
  }


   @org.testng.annotations.Test
   public void agentLogsTest() {
       agentTabs.openAgentTab(AgentTabs.CSS_AGENT_MORE_DRPDWN,AgentTabs.CSS_AGENT_LOGS);
       agentTabs.checkWebHelp(AgentTabs.CSS_AGENT_LOGS_HELP,WebHelpPage.TEXT_AGENT_LOGS);
   }


}
