package za;

import java.io.Serializable;
import java.util.regex.Pattern;
import qa.C8294g;
import qa.C8298k;

public final class C11439e implements Serializable {
    public static final C11440a f36412b = new C11440a(null);
    public final Pattern f36413a;

    public static final class C11440a {
        public C11440a() {
        }

        public C11440a(C8294g gVar) {
            this();
        }
    }

    public C11439e(Pattern pattern) {
        C8298k.m12934e(pattern, "nativePattern");
        this.f36413a = pattern;
    }

    public final boolean m648a(CharSequence charSequence) {
        C8298k.m12934e(charSequence, "input");
        return this.f36413a.matcher(charSequence).matches();
    }

    public final String m647b(CharSequence charSequence, String str) {
        C8298k.m12934e(charSequence, "input");
        C8298k.m12934e(str, "replacement");
        String replaceAll = this.f36413a.matcher(charSequence).replaceAll(str);
        C8298k.m12935d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public String toString() {
        String pattern = this.f36413a.toString();
        C8298k.m12935d(pattern, "nativePattern.toString()");
        return pattern;
    }

    public C11439e(java.lang.String r2) {
        throw new UnsupportedOperationException("Method not decompiled: za.C11439e.<init>(java.lang.String):void");
    }
}