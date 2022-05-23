package m3;

import android.os.Bundle;
import m3.h;

public abstract class z2 implements h {
    public static final h.a<z2> f17117a = y2.f17113a;

    public static z2 b(Bundle bundle) {
        int i10 = bundle.getInt(c(0), -1);
        if (i10 == 0) {
            return t1.M.a(bundle);
        }
        if (i10 == 1) {
            return m2.f16840c.a(bundle);
        }
        if (i10 == 2) {
            return i3.M.a(bundle);
        }
        if (i10 == 3) {
            return m3.M.a(bundle);
        }
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("Unknown RatingType: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static String c(int i10) {
        return Integer.toString(i10, 36);
    }
}
