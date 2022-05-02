package za;

import java.util.Locale;
import p317wa.C10022g;
import qa.C8298k;

public class C11434a {
    public static final int m661a(int i) {
        boolean z = false;
        if (2 <= i && i < 37) {
            z = true;
        }
        if (z) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C10022g(2, 36));
    }

    public static final int m660b(char c, int i) {
        return Character.digit((int) c, i);
    }

    public static final boolean m659c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final String m658d(char c, Locale locale) {
        C8298k.m12934e(locale, "locale");
        String e = m657e(c, locale);
        if (e.length() <= 1) {
            String upperCase = String.valueOf(c).toUpperCase(Locale.ROOT);
            C8298k.m12935d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return !C8298k.m12937b(e, upperCase) ? e : String.valueOf(Character.toTitleCase(c));
        } else if (c == 329) {
            return e;
        } else {
            char charAt = e.charAt(0);
            String substring = e.substring(1);
            C8298k.m12935d(substring, "this as java.lang.String).substring(startIndex)");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            C8298k.m12935d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return charAt + lowerCase;
        }
    }

    public static final String m657e(char c, Locale locale) {
        C8298k.m12934e(locale, "locale");
        String upperCase = String.valueOf(c).toUpperCase(locale);
        C8298k.m12935d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
