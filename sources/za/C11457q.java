package za;

import java.util.NoSuchElementException;
import p317wa.C10030l;
import qa.C8298k;
import ua.AbstractC9486c;

public class C11457q extends C11456p {
    public static final char m566v0(CharSequence charSequence, AbstractC9486c cVar) {
        C8298k.m12933e(charSequence, "<this>");
        C8298k.m12933e(cVar, "random");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(cVar.mo8550d(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final String m565w0(String str, int i) {
        C8298k.m12933e(str, "<this>");
        if (i >= 0) {
            String substring = str.substring(0, C10030l.m6192e(i, str.length()));
            C8298k.m12934d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
