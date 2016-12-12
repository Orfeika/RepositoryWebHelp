package RapidRecovery.com.wizards;

import RapidRecovery.com.PageObject.wizards.RestoreWizard;
import RapidRecovery.com.WebHelpPage;
import org.testng.annotations.BeforeMethod;

public class MountWizardTest extends BaseTestWizards {

    @BeforeMethod
    public void beforeMethod() {
        restoreWizard = new RestoreWizard();
    }


    @org.testng.annotations.Test
    public void machinesStep() {
        restoreWizard.launchMountWizard();
        restoreWizard.checkWebHelpWizard(RestoreWizard.CSS_WIZARD_QUESTION_MARK,
                WebHelpPage.TEXT_MOUNT_RP,WebHelpPage.TEXT_MACHINES);
    }


   @org.testng.annotations.Test
   public void recoveryPointsStep() {
       restoreWizard.launchMountWizard();
       restoreWizard.selectMachinesToMount();
       restoreWizard.proceedToNextStep();
       restoreWizard.checkWebHelpWizard(RestoreWizard.CSS_WIZARD_QUESTION_MARK,
               WebHelpPage.TEXT_MOUNT_RP,WebHelpPage.TEXT_RECOVERY_POINTS);
   }

    @org.testng.annotations.Test
    public void volumesStep() {
        restoreWizard.launchMountWizard();
        restoreWizard.selectMachinesToMount();
        restoreWizard.proceedToNextStep();
        restoreWizard.selectRPToMount();
        restoreWizard.proceedToNextStep();
        restoreWizard. checkWebHelpWizard(RestoreWizard.CSS_WIZARD_QUESTION_MARK,
                WebHelpPage.TEXT_MOUNT_RP,WebHelpPage.TEXT_VOLUMES);


    }
    @org.testng.annotations.Test
   public void mountOptionsStep() {
        restoreWizard.launchMountWizard();
        restoreWizard.selectMachinesToMount();
        restoreWizard.proceedToNextStep();
        restoreWizard.selectRPToMount();
        restoreWizard.proceedToNextStep();
        restoreWizard.proceedToNextStep();
        restoreWizard.checkWebHelpWizard(RestoreWizard.CSS_WIZARD_QUESTION_MARK,
                WebHelpPage.TEXT_MOUNT_RP,WebHelpPage.TEXT_MOUNT_OPTIONS);
    }

}