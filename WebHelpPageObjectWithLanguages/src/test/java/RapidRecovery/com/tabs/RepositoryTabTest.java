package RapidRecovery.com.tabs;


import RapidRecovery.com.PageObject.tabs.BaseTab;
import RapidRecovery.com.PageObject.tabs.RepositoryTab;
import RapidRecovery.com.WebHelpPage;
import org.testng.annotations.BeforeMethod;


public class RepositoryTabTest extends BaseTabTest {

    @BeforeMethod
    public void beforeMethod() {
        repositoryTab = new RepositoryTab();
        repositoryTab.openTab(BaseTab.Tabs.RepositoryTab);
    }
 
    @org.testng.annotations.Test
    public void repositoryTabWebHelp(){
        repositoryTab.checkWebHelp(RepositoryTab.CSS_REPOSITORY_HELP, WebHelpPage.TEXT_REPOSITORY_SUMMARY);
    }

    @org.testng.annotations.Test
    public void repositoryDVMWebHelp(){
        repositoryTab.checkWebHelp(RepositoryTab.CSS_DVM_REPOSITORY,WebHelpPage.TEXT_REPOSITORY_DVM);

    }

    @org.testng.annotations.Test
    public void openExistingDVMWebHelp(){
        repositoryTab.openExistingDVMRepo();
        repositoryTab.checkWebHelp(RepositoryTab.CSS_OPEN_EXISTING_DVM_QUESTION_MARK,WebHelpPage.TEXT_OPEN_EXISTING_REPOSITORY);
        repositoryTab.closeDialogWindow();
    }




    @org.testng.annotations.Test
    public void addNewRepositoryWebHelp(){
        repositoryTab.openAddNewRepositoryWindow();
        repositoryTab.checkWebHelp(RepositoryTab.CSS_NEW_REPO_HELP_QUESTION_MARK,WebHelpPage.TEXT_CREATE_REPOSITORY);
        repositoryTab.closeDialogWindow();

    }

    @org.testng.annotations.Test
    public void addStorageLocationWebHelp(){
        repositoryTab.openAddNewRepositoryWindow();
        repositoryTab.openAddStorageLocationWindow();
        repositoryTab.checkWebHelp(RepositoryTab.CSS_ADD_STORAGE_LOCATION_QUESTION_MARK,WebHelpPage.TEXT_CREATE_REPOSITORY);
        repositoryTab.closeDialogWindow(RepositoryTab.CSS_CLOSE_DIALOG_ADD_STORAGE_LOCATION);
        repositoryTab.closeDialogWindow(RepositoryTab.CSS_CLOSE_DIALOG_ADD_NEW_REPO);



    }
}
