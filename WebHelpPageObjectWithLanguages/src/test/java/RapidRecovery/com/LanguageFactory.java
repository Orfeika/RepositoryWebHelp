package RapidRecovery.com;

import RapidRecovery.com.PageObject.enums.LocalizedLanguages;
import RapidRecovery.com.tabs.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class LanguageFactory {

    @Factory(dataProvider ="languages")
    public Object [] createInstances(LocalizedLanguages language) {
        return new Object[]{
              // new AgentTabsTest(language),
         //       new ArchivesTabTest(language),
              //  new BootCDTabTest(language),
                //new CoreHomeTabTest(language),
                //new CoreLogsTest(language),
                new EncryptionKeysTabTestTab(language),
                new EventsTabTest(language),
                new FileSearchTabTest(language),
                new MountsTabTest(language),
                new NotificationTabTest(language),
                new ReplicationTabTest(language),
                new ReportsTabTest(language),
                new RepositoryTabTest(language),
                new RetentionPolicyTabTest(language),
                new SettingsTabTest(language),
                new SystemInfoTest(language),
                new VirtualStandbyTabTest(language)

        };
    }
    @DataProvider(name="languages")
    public static Object[][] dataProvider() {
       return new  Object[][]  {
               {LocalizedLanguages.English},
               {LocalizedLanguages.French},
               {LocalizedLanguages.German},
               {LocalizedLanguages.Portuguese},
               {LocalizedLanguages.China},
               {LocalizedLanguages.Korean},
               {LocalizedLanguages.Japan},
       };

    }



}
