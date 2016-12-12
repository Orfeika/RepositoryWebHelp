package RapidRecovery.com;

import RapidRecovery.com.PageObject.enums.LocalizedLanguages;
import RapidRecovery.com.tabs.AgentTabsTest;
import org.testng.annotations.Factory;

public class LanguageFactory {

    @Factory
    public Object [] createInstances() {
        return new Object[]{
               new AgentTabsTest(LocalizedLanguages.Portuguese), new AgentTabsTest(LocalizedLanguages.China ),
                new AgentTabsTest(LocalizedLanguages.French), new AgentTabsTest(LocalizedLanguages.German ),
               new AgentTabsTest(LocalizedLanguages.English), new AgentTabsTest(LocalizedLanguages.Spanish ),
               new AgentTabsTest(LocalizedLanguages.Korean), new AgentTabsTest(LocalizedLanguages.Japan ),
        };
    }




}
