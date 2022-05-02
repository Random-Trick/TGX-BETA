package p333xb;

import java.util.Arrays;
import java.util.logging.Logger;
import qa.C8298k;
import qa.C8309v;

public final class C10177b {
    public static final void m5843a(AbstractC10176a aVar, C10179d dVar, String str) {
        m5841c(aVar, dVar, str);
    }

    public static final String m5842b(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        C8309v vVar = C8309v.f26794a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        C8298k.m12934d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final void m5841c(AbstractC10176a aVar, C10179d dVar, String str) {
        Logger a = C10180e.f32912j.m5816a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dVar.m5835f());
        sb2.append(' ');
        C8309v vVar = C8309v.f26794a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C8298k.m12934d(format, "java.lang.String.format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(aVar.m5848b());
        a.fine(sb2.toString());
    }
}
