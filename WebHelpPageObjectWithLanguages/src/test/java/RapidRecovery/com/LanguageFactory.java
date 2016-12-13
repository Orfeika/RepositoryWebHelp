package RapidRecovery.com;

import RapidRecovery.com.PageObject.enums.LocalizedLanguages;
import RapidRecovery.com.tabs.AgentTabsTest;
import RapidRecovery.com.tabs.ArchivesTabTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class LanguageFactory {

    @Factory(dataProvider ="languages")
    public Object [] createInstances(LocalizedLanguages language) {
        return new Object[]{
               new AgentTabsTest(language),
                new ArchivesTabTest(language)

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
