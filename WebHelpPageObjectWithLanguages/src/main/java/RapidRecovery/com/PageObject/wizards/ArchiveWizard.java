package RapidRecovery.com.PageObject.wizards;

import RapidRecovery.com.util.ConfigurationFileLoader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ArchiveWizard extends BaseWizard {


    public static final String CSS_ARCHIVE_DROPDOWN =  "#archiveMachine .dellap-caret-down";
    @FindBy(css =CSS_ARCHIVE_DROPDOWN)
    WebElement archiveDropdown ;

    public static final String CSS_IMPORT_ARCHIVE_WIZARD  =  ".dellap-import";
    @FindBy(css =CSS_IMPORT_ARCHIVE_WIZARD)
    WebElement importArchiveWizard ;


    public static final String CSS_ATTACH_ARCHIVE_WINDOW =  " #archiveMachine .dellap-mount";
    @FindBy(css =CSS_ATTACH_ARCHIVE_WINDOW)
    WebElement attachArchiveWindow ;



    public static final String CSS_OPEN_ARCHIVE_WIZARD =  "#archiveMachine";
    @FindBy(css =CSS_OPEN_ARCHIVE_WIZARD)
    WebElement archiveWizard ;

    public static final String CSS_ARCHIVE_WIZARD_SELECT_ALL_MACHINES = "#machinesGrid_selectAll_triSpan";
    @FindBy(css =CSS_ARCHIVE_WIZARD_SELECT_ALL_MACHINES)
    WebElement archiveWizardSelectAllMachines ;


    public static final String CSS_ARCHIVE_LOCATION = "#localPath";
    @FindBy(css =CSS_ARCHIVE_LOCATION)
    WebElement archiveLocation ;

    public static final String CSS_IMPORT_ALL_ARCHIVES_CHECKBOX = " #isAllAgents";
    @FindBy(css =CSS_IMPORT_ALL_ARCHIVES_CHECKBOX)
    WebElement importAllMachinesInArchive ;


    public static final String CSS_ATTACH_ARCHIVE_QUESTION_MARK=  " #ui-dialog-titlebar-hlp1 .ui-icon-help-left";
    @FindBy(css =CSS_ATTACH_ARCHIVE_QUESTION_MARK)
    WebElement questionMarkAttachArchive ;


//Archive Wizard

    public void launchArchiveWizard(){
        waitTillProgress(CSS_OVERLAY);
        archiveWizard.click();
    }


    public void fillArchiveLocationField(){
        archiveLocation.sendKeys(configurations.getInstance().getArchiveLocation());
    }

    public  void selectAllMachines(){
        archiveWizardSelectAllMachines.click();
    }

// Import Archive Wizard

    public void launchImportArchiveWizard(){
        launchWizard(CSS_ARCHIVE_DROPDOWN,CSS_IMPORT_ARCHIVE_WIZARD );
        waitTillProgress(CSS_OVERLAY);
    }

    public void fillImportArchiveLocationField(){
        archiveLocation.sendKeys(configurations.getInstance().getPathToArchiveForImport());
    }

    public void deselectImportAllMachines(){
        importAllMachinesInArchive.click();
        waitTillProgress(CSS_OVERLAY);
    }






    public static final String TEXT_LOCATION_STEP = "Location";
    public static final String TEXT_ARCHIVE_TYPE_STEP= "Archive Type";
    public static final String TEXT_MACHINES_STEP = "Machines";
    public static final String TEXT_OPTIONS_STEP = "Options";
    public static final String TEXT_DATE_RANGE_STEP = "Date Range";
    public static final String TEXT_IMPORT_TYPE_STEP = "Import Type";
    public static final String TEXT_ARCHIVE_INFORMATION_STEP = "Archive Information";







}
