package p311w4;

import android.text.TextUtils;
import java.util.regex.Pattern;
import p343y6.C10422b;
import p358z6.AbstractC11404s;

public final class C9969b {
    public static final Pattern f32390d = Pattern.compile("\\s+");
    public static final AbstractC11404s<String> f32391e = AbstractC11404s.m729D("auto", "none");
    public static final AbstractC11404s<String> f32392f = AbstractC11404s.m728E("dot", "sesame", "circle");
    public static final AbstractC11404s<String> f32393g = AbstractC11404s.m729D("filled", "open");
    public static final AbstractC11404s<String> f32394h = AbstractC11404s.m728E("after", "before", "outside");
    public final int f32395a;
    public final int f32396b;
    public final int f32397c;

    public C9969b(int i, int i2, int i3) {
        this.f32395a = i;
        this.f32396b = i2;
        this.f32397c = i3;
    }

    public static C9969b m6388a(String str) {
        if (str == null) {
            return null;
        }
        String c = C10422b.m5149c(str.trim());
        if (c.isEmpty()) {
            return null;
        }
        return m6387b(AbstractC11404s.m721y(TextUtils.split(c, f32390d)));
    }

    public static p311w4.C9969b m6387b(p358z6.AbstractC11404s<java.lang.String> r9) {
        throw new UnsupportedOperationException("Method not decompiled: p311w4.C9969b.m6387b(z6.s):w4.b");
    }
}
