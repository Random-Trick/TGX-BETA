package za;

import pa.AbstractC8088l;
import qa.C8298k;

public class C11441f {
    public static final <T> void m646a(Appendable appendable, T t, AbstractC8088l<? super T, ? extends CharSequence> lVar) {
        C8298k.m12933e(appendable, "<this>");
        if (lVar != null) {
            appendable.append(lVar.mo568a(t));
            return;
        }
        if (t == null ? true : t instanceof CharSequence) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
