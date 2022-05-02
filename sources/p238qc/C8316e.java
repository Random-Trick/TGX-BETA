package p238qc;

import java.util.ArrayList;
import java.util.Locale;

public class C8316e {
    public static final String[] f26811f = {"", "K", "M", "G", "T", "P"};
    public int[] f26812a;
    public String[] f26813b;
    public String[] f26814c;
    public int f26815d;
    public int f26816e;

    public C8316e(int i, int i2, boolean z) {
        this(i, i2, z, 0.0f);
    }

    public static String m12894a(int i) {
        if (i < 1000) {
            return Integer.toString(i);
        }
        ArrayList arrayList = new ArrayList();
        while (i != 0) {
            int i2 = i % 1000;
            i /= 1000;
            if (i > 0) {
                arrayList.add(String.format(Locale.ENGLISH, "%03d", Integer.valueOf(i2)));
            } else {
                arrayList.add(Integer.toString(i2));
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            sb2.append((String) arrayList.get(size));
            if (size != 0) {
                sb2.append(",");
            }
        }
        return sb2.toString();
    }

    public static String m12893b(int i, int i2) {
        if (i == 0) {
            return "0";
        }
        float f = i;
        if (i2 == 0) {
            i2 = i;
        }
        if (i2 < 1000) {
            return m12894a(i);
        }
        int i3 = 0;
        while (i2 >= 1000 && i3 < f26811f.length - 1) {
            i2 /= 1000;
            f /= 1000.0f;
            i3++;
        }
        if (f < 0.1d) {
            return "0";
        }
        int i4 = (int) f;
        return f == ((float) i4) ? String.format(Locale.ENGLISH, "%s%s", m12894a(i4), f26811f[i3]) : String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f), f26811f[i3]);
    }

    public static int m12892c(int i) {
        if (i > 100) {
            i = m12891d(i);
        }
        return ((int) Math.ceil(i / 5.0f)) * 5;
    }

    public static int m12891d(int i) {
        return ((float) (i / 5)) % 10.0f == 0.0f ? i : ((i / 10) + 1) * 10;
    }

    public C8316e(int r8, int r9, boolean r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: p238qc.C8316e.<init>(int, int, boolean, float):void");
    }
}
