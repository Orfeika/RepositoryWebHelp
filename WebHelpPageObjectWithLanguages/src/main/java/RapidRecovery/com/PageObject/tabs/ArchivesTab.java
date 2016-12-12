package RapidRecovery.com.PageObject.tabs;

import RapidRecovery.com.WebHelpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ArchivesTab extends BaseTab {
    public static final String CSS_MORE_DROPDOWN = "#coreNavigationMore";
    public static final String CSS_MORE_ARCHIVES =  "#coreNavigationMoreMenu [href*='Archives']";
    public static final String CSS_HELP_ARCHIVES =   ".page-header  [data-onclick *= 'Help']";
    public static final String CSS_HELP_SCHEDULED_ARCHIVES =   ".blockInnerContainer:first-child [data-onclick *= 'Help']";
    public static final String CSS_HELP_SCHEDULED_ARCHIVES_IMPORT =".blockInnerContainer:nth-child(2)  [data-onclick *= 'Help'] ";
    public static final String CSS_HELP_ATTACHED_ARCHIVES =".blockInnerContainer:nth-child(3)  [data-onclick *= 'Help'] ";
    public static final String CSS_HELP_CHECK_ARCHIVE =   "[data-onclick*='CheckArchive']";
    public static final String CSS_DIALOG_WINDOW_QUESTION_MARK = " .ui-dialog .ui-icon-help-left";
    public static final String CSS_DIALOG_WINDOW_CLOSE= ".ui-icon-closeright";
    public static final String CSS_ADD_ATTACHED_ARCHIVE =   "#AttachedArchives [data-onclick*='AttachArchiveDialog']";

    public void openAttachArchiveWindow(){
        WebElement addButton = driver.findElement(By.cssSelector(ArchivesTab.CSS_ADD_ATTACHED_ARCHIVE));
        wait.until(ExpectedConditions.visibilityOf(addButton));
        addButton.click();
    }
    public void openCheckArchiveWindow(){
        driver.findElement(By.cssSelector(CSS_HELP_CHECK_ARCHIVE)).click();
    }

}
