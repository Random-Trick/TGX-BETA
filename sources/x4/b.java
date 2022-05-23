package x4;

import a7.s;
import android.text.TextUtils;
import java.util.regex.Pattern;

public final class b {
    public static final Pattern f25985d = Pattern.compile("\\s+");
    public static final s<String> f25986e = s.D("auto", "none");
    public static final s<String> f25987f = s.E("dot", "sesame", "circle");
    public static final s<String> f25988g = s.D("filled", "open");
    public static final s<String> f25989h = s.E("after", "before", "outside");
    public final int f25990a;
    public final int f25991b;
    public final int f25992c;

    public b(int i10, int i11, int i12) {
        this.f25990a = i10;
        this.f25991b = i11;
        this.f25992c = i12;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String c10 = z6.b.c(str.trim());
        if (c10.isEmpty()) {
            return null;
        }
        return b(s.y(TextUtils.split(c10, f25985d)));
    }

    public static x4.b b(a7.s<java.lang.String> r9) {
        throw new UnsupportedOperationException("Method not decompiled: x4.b.b(a7.s):x4.b");
    }
}
