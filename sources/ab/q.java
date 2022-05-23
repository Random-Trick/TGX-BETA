package ab;

import java.util.NoSuchElementException;
import ra.k;
import va.c;
import xa.l;

public class q extends p {
    public static final char v0(CharSequence charSequence, c cVar) {
        k.e(charSequence, "<this>");
        k.e(cVar, "random");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(cVar.d(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final String w0(String str, int i10) {
        k.e(str, "<this>");
        if (i10 >= 0) {
            String substring = str.substring(0, l.e(i10, str.length()));
            k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
