package RapidRecovery.com.tabs;


import RapidRecovery.com.PageObject.tabs.BaseTab;
import RapidRecovery.com.PageObject.tabs.NotificationsTab;
import RapidRecovery.com.WebHelpPage;
import org.testng.annotations.BeforeMethod;

public class NotificationTabTest extends BaseTabTest {

    @BeforeMethod
    public void beforeMethod() {
        notificationsTab = new NotificationsTab();
        notificationsTab.openTab(BaseTab.Tabs.NotificationsTab);
    }

    @org.testng.annotations.Test
    public void notificationsWebHelp() {
        notificationsTab.openAddNotificationGroupWindow();
        notificationsTab.checkWebHelp(NotificationsTab.CSS_DIALOG_WINDOW_QUESTION_MARK, WebHelpPage.TEXT_NOTIFICATIONS);
        notificationsTab.closeDialogWindow();
    }


    @org.testng.annotations.Test
    public void editNotificationGroupWebHelp() {
        notificationsTab.openEditNotificationGropWindow();
        notificationsTab.checkWebHelp(NotificationsTab.CSS_DIALOG_WINDOW_QUESTION_MARK,WebHelpPage.TEXT_NOTIFICATIONS);
        notificationsTab.closeDialogWindow();
    }

    @org.testng.annotations.Test
    public void configureEmailTemlateWebHelp() {
        notificationsTab.openEditEmailNotificationsConfigWindow();
        notificationsTab.checkWebHelp(NotificationsTab.CSS_DIALOG_WINDOW_QUESTION_MARK,WebHelpPage.TEXT_CONFIGURE_EMAIL_TEMPLATE);
        notificationsTab.closeDialogWindow();
    }




}