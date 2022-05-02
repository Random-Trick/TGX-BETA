package za;

import java.util.Locale;
import qa.C8298k;

public final class C11458r {
    public static final String m564a(char c) {
        String valueOf = String.valueOf(c);
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        C8298k.m12935d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        String substring = upperCase.substring(1);
        C8298k.m12935d(substring, "this as java.lang.String).substring(startIndex)");
        String lowerCase = substring.toLowerCase(locale);
        C8298k.m12935d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return charAt + lowerCase;
    }
}
