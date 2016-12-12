package RapidRecovery.com.PageObject.wizards;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class ProtectMachineWizard extends BaseWizard {
    //FIELDS
    public static final String CSS_CONNECTION_HOSTNAME = "#hostName";
    @FindBy(css = CSS_CONNECTION_HOSTNAME)
    WebElement hostname;

    public static final String CSS_CONNECTION_USERNAME = "#userName";
    @FindBy(css = CSS_CONNECTION_USERNAME)
    WebElement username;

    public static final String CSS_CONNECTION_PASSWORD =  "#password";
    @FindBy(css = CSS_CONNECTION_PASSWORD)
    WebElement password;

    public static final String CSS_REPOSITORY_NAME = "#newRepoName";
    @FindBy(css = CSS_REPOSITORY_NAME)
    WebElement repositoryName;

    public static final String CSS_REPOSITORY_LOCATION = "#newRepoLocation";
    @FindBy(css = CSS_REPOSITORY_LOCATION)
    WebElement repositoryLocation;

    public static final String CSS_REPOSITORY_METADATA = "#newRepoMetadataLocation";
    @FindBy(css = CSS_REPOSITORY_METADATA)
    WebElement repositoryMetadata;

    //Protect multiple Wizard-> Select Machine step -> field
    public static final String  CSS_SELECT_MACHINES_MANUALLY  = "#machinesListManual";

    //header names
    public static final String TEXT_REPOSITORY_CONFIGURATION ="Repository Configuration";

    //Buttons , Dropdowns
    public static final String CSS_WIZARD_ADVANCED_R_BUTTON = "#advancedWizard";
    @FindBy(css = CSS_WIZARD_ADVANCED_R_BUTTON)
    WebElement advancedWizard;

    public static final String CSS_WIZARD_CUSTOM_PROT_BUTTON = "#customProtection";
    @FindBy(css = CSS_WIZARD_CUSTOM_PROT_BUTTON)
    WebElement customProtection;

    public static final String CSS_WIZARD_CREATE_REPO_BUTTON = "#createRepository";
    @FindBy(css = CSS_WIZARD_CREATE_REPO_BUTTON)
    WebElement createRepository;



    public static final String CSS_PRT_MLTPM_WIZARD_CONNECTION_DRPDWN = ".dropdown-multiselect-button";
    public static final String CSS_PRT_MLTPM_WIZARD_CON_DRPDWN_MANUALLY = "#dropdown-menu-sourceType > ul > li:nth-child(5)"; //"#dropdown-menu-sourceType [data-original-title = Manually] ";

    public static final String CSS_PROTECT_MACHINE = "#protectMachine";
    @FindBy(css = CSS_PROTECT_MACHINE)
    WebElement protectMachineWizard;

    public static final String CSS_PROTECT_MACHINE_DRDWN = "#protectEntity  .dellap-caret-down";
    @FindBy(css = CSS_PROTECT_MACHINE_DRDWN)
    WebElement protectWizardDropdown;

    public static final String CSS_PRT_MLTPM_MACHINES = ".dellap-bulk-protect";
    @FindBy(css = CSS_PRT_MLTPM_MACHINES)
    WebElement launchprotectMultipleMachinesWizard;
    public static final String CSS_PRT_CLUSTER = ".dellap-cluster-protect";
    @FindBy(css = CSS_PRT_CLUSTER)
    WebElement launchProtectCluster;
    public static final String CSS_DIALOG_WINDOW_QUESTION_MARK = "[aria-labelledby='ui-id-3'] .ui-icon-help-left";
    public static final String CSS_CLUSTER_HOST = "[aria-labelledby='ui-id-3']  #clusterHostName";
    @FindBy(css = CSS_CLUSTER_HOST)
    WebElement clusterHost;
    public static final String CSS_CLUSTER_USER_NAME = "[aria-labelledby='ui-id-3']  #clusterUserName";
    @FindBy(css = CSS_CLUSTER_USER_NAME)
    WebElement clusterUserName;
    public static final String CSS_CLUSTER_PASSWORD = "[aria-labelledby='ui-id-3']   #clusterPassword ";
    @FindBy(css = CSS_CLUSTER_PASSWORD)
    WebElement clusterPassword;

    //Deploy Wizard
    public static final String CSS_DEPLOY_AGENT_SOFTWARE =  ".dellap-bulk-deploy";
    @FindBy(css = CSS_DEPLOY_AGENT_SOFTWARE)
    WebElement deployAgentDropdown;

    public static final String CSS_SOURCE_DRPDWN = "#dropdown-wrapper-sourceType";
    public static final String CSS_SOURCE_MANUALLY ="#dropdown-menu-sourceType > ul > li:last-child";
    public static final String CSS_SOURCE_HYPER_V ="#dropdown-menu-sourceType > ul > li:nth-child(4)";
    public static final String CSS_HYPER_V_HOSTNAME ="#hvHostName";
    @FindBy(css = CSS_HYPER_V_HOSTNAME)
    WebElement hvHostName;
    public static final String CSS_HYPER_V_USERNAME = "#hvUserName";
    @FindBy(css = CSS_HYPER_V_USERNAME)
    WebElement hvUserName;
    public static final String CSS_HYPER_V_PASSWORD = "#hvPassword";
    @FindBy(css = CSS_HYPER_V_PASSWORD)
    WebElement hvPassword;
    public static final String CSS_CONNECT_CLUSTER_BUTTON =  "#connectClusterButton";
    @FindBy(css = CSS_CONNECT_CLUSTER_BUTTON)
    WebElement connectClusterButton;




    //lOADING
    public static final String CSS_OVERLAY =" div .ui-widget-overlay";
    public static final String CSS_LOADING = "#loadingPanel";

    public void launchProtectMachineWizard(){
        waitTillProgress(CSS_OVERLAY);
        protectMachineWizard.click();
    }

    public void selectAdvancedProtectMachinesWizard(){
        advancedWizard.click();
    }

    public void fillConnectionFields(){
        hostname.sendKeys(configurations.getInstance().getProtectHostname());
        username.sendKeys(configurations.getInstance().getProtectLogin());
        password.sendKeys(configurations.getInstance().getProtectPassword());
    }

   public void setCustomProtection(){
       customProtection.click();
   }

   public void createNewRepository(){
       createRepository.click();
       repositoryLocation.sendKeys(configurations.getInstance().getRepositoryLocation());
        new Actions(driver).moveToElement(repositoryName).click().perform();
       repositoryName.sendKeys(configurations.getInstance().getRepositoryName());
       for (int i =0 ; i<6 ; i++){
           repositoryName.sendKeys(configurations.getInstance().getRepositoryName());
           if(!(repositoryName.getText().toString().isEmpty()==true)){
            break;
           }
       }
   }
// Protect Multiple Machines Wizard
   public void launchProtectMultipleMachinesWizard(){
       protectWizardDropdown.click();
       launchprotectMultipleMachinesWizard.click();
       waitTillProgress(ProtectMachineWizard.CSS_OVERLAY);
   }


public void selectConnectionManually(){
    driver.findElement(By.cssSelector(CSS_PRT_MLTPM_WIZARD_CONNECTION_DRPDWN)).click();
    driver.findElement(By.cssSelector(CSS_PRT_MLTPM_WIZARD_CON_DRPDWN_MANUALLY)).click();
}

public void enterMachinesInformation(){
    driver.findElement(By.cssSelector(ProtectMachineWizard.CSS_SELECT_MACHINES_MANUALLY)).sendKeys(configurations.getInstance().getProtectAgentManual());
}

//Deploy Agent Software Wizard

    public void launchDeployMachineWizard(){
        protectWizardDropdown.click();
        deployAgentDropdown.click();
        waitTillProgress(ProtectMachineWizard.CSS_OVERLAY);
    }
    public void selectConnectionHyperV(){
        driver.findElement(By.cssSelector(ProtectMachineWizard.CSS_SOURCE_DRPDWN)).click();
        driver.findElement(By.cssSelector(ProtectMachineWizard.CSS_SOURCE_HYPER_V)).click();
        hvHostName.sendKeys(configurations.getInstance().getHyperVHost());
        hvUserName.sendKeys(configurations.getInstance().getHyperVLogin());
        hvPassword.sendKeys(configurations.getInstance().getHyperVPassword());
    }

    //ProtectCluster
    public void launchProtectClusterWindow(){
        protectWizardDropdown.click();
        launchProtectCluster.click();
        waitTillProgress(ProtectMachineWizard.CSS_OVERLAY);
    }

    public void fillClusterFields(){
        clusterPassword.sendKeys(configurations.getInstance().getClusterPassword());
        clusterHost.clear();
        clusterHost.sendKeys(configurations.getInstance().getClusterIP());
        clusterUserName.clear();
        clusterUserName.sendKeys(configurations.getInstance().getClusterHostName());
    }

    public void connectToCluster(){
        connectClusterButton.click();
        waitTillProgress(ProtectMachineWizard.CSS_OVERLAY,10,20);
        waitTillProgress(ProtectMachineWizard.CSS_LOADING,10,40);
    }








}
