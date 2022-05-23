package ab;

import java.util.Locale;
import ra.k;
import xa.g;

public class a {
    public static final int a(int i10) {
        boolean z10 = false;
        if (2 <= i10 && i10 < 37) {
            z10 = true;
        }
        if (z10) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new g(2, 36));
    }

    public static final int b(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    public static final boolean c(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static final String d(char c10, Locale locale) {
        k.e(locale, "locale");
        String e10 = e(c10, locale);
        if (e10.length() <= 1) {
            String upperCase = String.valueOf(c10).toUpperCase(Locale.ROOT);
            k.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return !k.b(e10, upperCase) ? e10 : String.valueOf(Character.toTitleCase(c10));
        } else if (c10 == 329) {
            return e10;
        } else {
            char charAt = e10.charAt(0);
            String substring = e10.substring(1);
            k.d(substring, "this as java.lang.String).substring(startIndex)");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            k.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return charAt + lowerCase;
        }
    }

    public static final String e(char c10, Locale locale) {
        k.e(locale, "locale");
        String upperCase = String.valueOf(c10).toUpperCase(locale);
        k.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
