package p037cb;

import android.os.Build;
import java.util.Locale;

public final class C2060d {
    public static String m35728a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 21) {
            return locale.toLanguageTag();
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        String str = "";
        if (language.equals("no") && country.equals("NO") && variant.equals("NY")) {
            language = "nn";
            country = "NO";
            variant = str;
        }
        if (language.isEmpty() || !language.matches("\\p{Alpha}{2,8}")) {
            language = "und";
        } else if (language.equals("iw")) {
            language = "he";
        } else if (language.equals("in")) {
            language = "id";
        } else if (language.equals("ji")) {
            language = "yi";
        }
        if (!country.matches("\\p{Alpha}{2}|\\p{Digit}{3}")) {
            country = str;
        }
        if (variant.matches("\\p{Alnum}{5,8}|\\p{Digit}\\p{Alnum}{3}")) {
            str = variant;
        }
        StringBuilder sb2 = new StringBuilder(language);
        if (!country.isEmpty()) {
            sb2.append('-');
            sb2.append(country);
        }
        if (!str.isEmpty()) {
            sb2.append('-');
            sb2.append(str);
        }
        return sb2.toString();
    }
}
