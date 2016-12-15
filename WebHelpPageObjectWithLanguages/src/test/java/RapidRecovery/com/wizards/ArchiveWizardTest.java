package RapidRecovery.com.wizards;

import RapidRecovery.com.PageObject.enums.LocalizedLanguages;
import RapidRecovery.com.PageObject.wizards.ArchiveWizard;
import RapidRecovery.com.PageObject.wizards.ProtectMachineWizard;
import RapidRecovery.com.WebHelpPage;
import org.testng.annotations.BeforeMethod;
import static RapidRecovery.com.PageObject.PageObject.CSS_LOADING;
import static RapidRecovery.com.PageObject.wizards.BaseWizard.CSS_WIZARD_QUESTION_MARK;

public class ArchiveWizardTest extends BaseTestWizards {


    public ArchiveWizardTest(LocalizedLanguages language) {
        this.language = language;
    }

    @BeforeMethod
    public void beforeMethod() {
        archiveWizard = new ArchiveWizard();
        language.printLanguageByKey();

    }

    @org.testng.annotations.Test
    public void archiveTypeStep() {
        archiveWizard.launchArchiveWizard();
        archiveWizard.checkWebHelpWizard(CSS_WIZARD_QUESTION_MARK,WebHelpPage.TEXT_CREATE_ARCHIVE,
                WebHelpPage.TEXT_ARCHIVE_TYPE);

    }

    @org.testng.annotations.Test
    public void archiveLocationStep() {
        archiveWizard.launchArchiveWizard();
        archiveWizard.proceedToNextStep();
        archiveWizard.checkWebHelpWizard(ProtectMachineWizard.CSS_WIZARD_QUESTION_MARK,
                WebHelpPage.TEXT_CREATE_ARCHIVE, WebHelpPage.TEXT_LOCATION);
    }

    @org.testng.annotations.Test
    public void archiveMachinesStep() {
        archiveWizard.launchArchiveWizard();
        archiveWizard.proceedToNextStep();
        archiveWizard.fillArchiveLocationField();
        archiveWizard.proceedToNextStep();
        archiveWizard.waitTillProgress(CSS_LOADING,10,20);
        archiveWizard.checkWebHelpWizard(ProtectMachineWizard.CSS_WIZARD_QUESTION_MARK,
                WebHelpPage.TEXT_CREATE_ARCHIVE, WebHelpPage.TEXT_MACHINES);
    }
    @org.testng.annotations.Test
    public void archiveOptionsStep() {
        archiveWizard.launchArchiveWizard();
        archiveWizard.proceedToNextStep();
        archiveWizard.fillArchiveLocationField();
        archiveWizard.proceedToNextStep();
        archiveWizard.selectAllMachines();
        archiveWizard.proceedToNextStep();
        archiveWizard.waitTillProgress(CSS_LOADING,10,20);
        archiveWizard.checkWebHelpWizard(ProtectMachineWizard.CSS_WIZARD_QUESTION_MARK,
                WebHelpPage.TEXT_CREATE_ARCHIVE, WebHelpPage.TEXT_OPTIONS);
    }

    @org.testng.annotations.Test
    public void dateRangeStep() {
        archiveWizard.launchArchiveWizard();
        archiveWizard.proceedToNextStep();
        archiveWizard.fillArchiveLocationField();
        archiveWizard.proceedToNextStep();
        archiveWizard.selectAllMachines();
        archiveWizard.proceedToNextStep();
        archiveWizard.waitTillProgress(CSS_LOADING,10,20);
        archiveWizard.proceedToNextStep();
        archiveWizard.waitTillProgress(CSS_LOADING,10,20);
        archiveWizard.checkWebHelpWizard(ProtectMachineWizard.CSS_WIZARD_QUESTION_MARK,
                WebHelpPage.TEXT_CREATE_ARCHIVE, WebHelpPage.TEXT_DATE_RANGE);
    }
}
