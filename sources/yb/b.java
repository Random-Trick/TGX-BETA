package yb;

import java.util.Arrays;
import java.util.logging.Logger;
import ra.k;
import ra.v;

public final class b {
    public static final void a(a aVar, d dVar, String str) {
        c(aVar, dVar, str);
    }

    public static final String b(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - 500000000) / 1000000000) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - 500000) / 1000000) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - 500) / 1000) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + 500) / 1000) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + 500000) / 1000000) + " ms";
        } else {
            str = ((j10 + 500000000) / 1000000000) + " s ";
        }
        v vVar = v.f21821a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        k.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final void c(a aVar, d dVar, String str) {
        Logger a10 = e.f26693j.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dVar.f());
        sb2.append(' ');
        v vVar = v.f21821a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        k.d(format, "java.lang.String.format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(aVar.b());
        a10.fine(sb2.toString());
    }
}
