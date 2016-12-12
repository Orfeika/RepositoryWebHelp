package RapidRecovery.com.PageObject.tabs;

import RapidRecovery.com.PageObject.PageObject;
import RapidRecovery.com.util.ConfigurationFileLoader;
import org.openqa.selenium.By;


public class BaseTab extends PageObject {
    ConfigurationFileLoader configurations;
    public static final String CSS_DIALOG_WINDOW_CLOSE= ".ui-icon-closeright";
    public static final String CSS_SUMMARY_HELP = ".header-help-link [role=button]";
    public enum Tabs {
        ArchiveTab("Archives"),
        BootCDTab("BootCD"),
        CloudsTab("Cloud"),
        CoreLogs("Diagnostics/ViewCoreLog"),
        EncryptionKeyTab("Encryption"),
        EventsTab("Events"),
        MountsTab("Mounts"),
        NotificationsTab("Core/Events/EventsConfiguration"),
        ReportsTab("Reports"),
        VirtualStandbyTab("Core/VirtualStandby"),
        SystemInfoTab("Core/SystemInfo"),
        SettingsTab("Core/Settings"),
        RepositoryTab("Repository"),
        RetentionPolicyTab("Core/Rollup/CoreRetentionPolicy"),
        ReplicationTab("Core/Replication"),
        FileSearchTab("/FileSearch"),
        ;

        private final String tab;
        /**
         * @param tab
         */
        private Tabs(final String tab) {
            this.tab = tab;
        }
        @Override
        public String toString() {
            return tab;
        }
    }
        public void openTab(Tabs tab){
            driver.get(generateURL(configurations,tab.toString()));
        }


        public void closeDialogWindow(){
            driver.findElement(By.cssSelector(CSS_DIALOG_WINDOW_CLOSE)).click();
        }

    public void closeDialogWindow(String cssCloseButton){
        driver.findElement(By.cssSelector(cssCloseButton)).click();
    }



}
