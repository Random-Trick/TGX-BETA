package ab;

import java.util.Locale;
import ra.k;

public final class r {
    public static final String a(char c10) {
        String valueOf = String.valueOf(c10);
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        k.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c10));
        }
        if (c10 == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        String substring = upperCase.substring(1);
        k.d(substring, "this as java.lang.String).substring(startIndex)");
        String lowerCase = substring.toLowerCase(locale);
        k.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return charAt + lowerCase;
    }
}
