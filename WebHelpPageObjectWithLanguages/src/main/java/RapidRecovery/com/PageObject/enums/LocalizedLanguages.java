package RapidRecovery.com.PageObject.enums;

public enum LocalizedLanguages {

    Portuguese("Pt-Br", "li:nth-child(12)"),
    China("Zn-CN", "li:nth-child(1)"),
    French("fr","li:nth-child(7)"),
    German("de","li:nth-child(8)"),
    English("en-us","li:nth-child(3)"),
    Spanish("es","li:nth-child(13)"),
    Korean("ko","li:nth-child(11)"),
    Japan("ja","li:nth-child(10)"),
    ;


    private String languageCss;
    private String LanguageKey;

    LocalizedLanguages(String LanguageKey, String languageCss) {
        this.LanguageKey = LanguageKey;
        this.languageCss = languageCss;
    }

    public String getLanguageCss() {
        return languageCss;
    }

    public String getLanguageKey() {
        return LanguageKey;
    }

    public static LocalizedLanguages getLanguageByKey(String languageKey) {
        for (LocalizedLanguages lang : LocalizedLanguages.values()) {
            if (lang.getLanguageKey().equalsIgnoreCase(languageKey)) {
                return lang;
            }
        }

        throw new EnumConstantNotPresentException(Enum.class, languageKey);
    }
}