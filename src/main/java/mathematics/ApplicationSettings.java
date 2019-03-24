package mathematics;

import mathematics.data.Locale;

/** Class which stores application setting. */
public class ApplicationSettings {

    private static Locale locale = Locale.ENGLISH;

    public static void setLocale(Locale locale) {
        ApplicationSettings.locale = locale;
    }

    public static Locale getLocale() {
        return ApplicationSettings.locale;
    }
}
