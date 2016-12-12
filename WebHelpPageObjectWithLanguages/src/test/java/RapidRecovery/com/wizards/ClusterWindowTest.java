package RapidRecovery.com.wizards;

import RapidRecovery.com.PageObject.wizards.ProtectMachineWizard;
import RapidRecovery.com.WebHelpPage;
import org.testng.annotations.BeforeMethod;

public class ClusterWindowTest extends BaseTestWizards {
    @BeforeMethod
    public void beforeMethod() {
        protectMachineWizard = new ProtectMachineWizard();
    }

    @org.testng.annotations.Test
    public void connectToClusterWindow() {
        protectMachineWizard.launchProtectClusterWindow();
        protectMachineWizard.checkWebHelp(ProtectMachineWizard.CSS_DIALOG_WINDOW_QUESTION_MARK
                , WebHelpPage.TEXT_PRT_CLUSTER);

    }

    @org.testng.annotations.Test
    public void protectClusterWindow() {
        protectMachineWizard.launchProtectClusterWindow();
        protectMachineWizard.fillClusterFields();
        protectMachineWizard.connectToCluster();
        protectMachineWizard.checkWebHelp(ProtectMachineWizard.CSS_DIALOG_WINDOW_QUESTION_MARK
                , WebHelpPage.TEXT_PRT_CLUSTER);

    }
}