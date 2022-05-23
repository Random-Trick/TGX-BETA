package ab;

import java.io.Serializable;
import java.util.regex.Pattern;
import ra.g;
import ra.k;

public final class e implements Serializable {
    public static final a f708b = new a(null);
    public final Pattern f709a;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }
    }

    public e(Pattern pattern) {
        k.e(pattern, "nativePattern");
        this.f709a = pattern;
    }

    public final boolean a(CharSequence charSequence) {
        k.e(charSequence, "input");
        return this.f709a.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence, String str) {
        k.e(charSequence, "input");
        k.e(str, "replacement");
        String replaceAll = this.f709a.matcher(charSequence).replaceAll(str);
        k.d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public String toString() {
        String pattern = this.f709a.toString();
        k.d(pattern, "nativePattern.toString()");
        return pattern;
    }

    public e(java.lang.String r2) {
        throw new UnsupportedOperationException("Method not decompiled: ab.e.<init>(java.lang.String):void");
    }
}
