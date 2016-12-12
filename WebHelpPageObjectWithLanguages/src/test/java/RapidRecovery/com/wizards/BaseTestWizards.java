package RapidRecovery.com.wizards;

import RapidRecovery.com.PageObject.PageObject;
import RapidRecovery.com.PageObject.wizards.ArchiveWizard;
import RapidRecovery.com.PageObject.wizards.ProtectMachineWizard;
import RapidRecovery.com.PageObject.wizards.ReplicationWizard;
import RapidRecovery.com.PageObject.wizards.RestoreWizard;
import RapidRecovery.com.util.ConfigurationFileLoader;
import RapidRecovery.com.util.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


import java.util.concurrent.TimeUnit;


public class BaseTestWizards {
    WebDriver driver;
    ConfigurationFileLoader configurations;
    PageObject pageObject;
    ArchiveWizard archiveWizard;
    ProtectMachineWizard protectMachineWizard;
    RestoreWizard restoreWizard;
    ReplicationWizard replicationWizard;




    @BeforeClass
    public void beforeClass() {
        driver = DriverManager.getInstance().createDriver();
        configurations = ConfigurationFileLoader.getInstance();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pageObject = new PageObject();
        driver.get(pageObject.generateURL(configurations));

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
