package RapidRecovery.com.tabs;

import RapidRecovery.com.PageObject.PageObject;
import RapidRecovery.com.PageObject.tabs.*;
import RapidRecovery.com.WebHelpPage;
import RapidRecovery.com.util.ConfigurationFileLoader;
import RapidRecovery.com.util.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;


public class BaseTabTest {
    protected WebHelpPage webHelpPage;
    WebDriver driver;
    ConfigurationFileLoader configurations;
    PageObject pageObject;
    ArchivesTab archivesTab;
    CloudAccountsTab cloudTab;
    BootCDTab bootCDTab;
    CoreHomeTab coreHomeTab;
    BaseTab tab;
    CoreLogsTab coreLogsTab;
    EncryptionKeyTab encryptionKeyTab;
    MountsTab mountsTab;
    NotificationsTab notificationsTab;
    ReplicationTab replicationTab;
    ReportsTab reportsTab;
    RepositoryTab repositoryTab;
    RetentionPolicyTab retentionPolicyTabTab;
    SettingsTab settingsTab;
    AgentTabs agentTabs;
    FileSearchTab fileSearchTab;





    @BeforeClass
    public void beforeClass() {

        driver = DriverManager.getInstance().createDriver();
        configurations = ConfigurationFileLoader.getInstance();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pageObject = new PageObject();

    }


    @AfterMethod
    public void afterMethod() {
        driver.navigate().refresh();
        driver.manage().deleteAllCookies();
    }


    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}


