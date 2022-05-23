package rc;

import java.util.ArrayList;
import java.util.Locale;

public class e {
    public static final String[] f21833f = {"", "K", "M", "G", "T", "P"};
    public int[] f21834a;
    public String[] f21835b;
    public String[] f21836c;
    public int f21837d;
    public int f21838e;

    public e(int i10, int i11, boolean z10) {
        this(i10, i11, z10, 0.0f);
    }

    public static String a(int i10) {
        if (i10 < 1000) {
            return Integer.toString(i10);
        }
        ArrayList arrayList = new ArrayList();
        while (i10 != 0) {
            int i11 = i10 % 1000;
            i10 /= 1000;
            if (i10 > 0) {
                arrayList.add(String.format(Locale.ENGLISH, "%03d", Integer.valueOf(i11)));
            } else {
                arrayList.add(Integer.toString(i11));
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

    public static String b(int i10, int i11) {
        if (i10 == 0) {
            return "0";
        }
        float f10 = i10;
        if (i11 == 0) {
            i11 = i10;
        }
        if (i11 < 1000) {
            return a(i10);
        }
        int i12 = 0;
        while (i11 >= 1000 && i12 < f21833f.length - 1) {
            i11 /= 1000;
            f10 /= 1000.0f;
            i12++;
        }
        if (f10 < 0.1d) {
            return "0";
        }
        int i13 = (int) f10;
        return f10 == ((float) i13) ? String.format(Locale.ENGLISH, "%s%s", a(i13), f21833f[i12]) : String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f10), f21833f[i12]);
    }

    public static int c(int i10) {
        if (i10 > 100) {
            i10 = d(i10);
        }
        return ((int) Math.ceil(i10 / 5.0f)) * 5;
    }

    public static int d(int i10) {
        return ((float) (i10 / 5)) % 10.0f == 0.0f ? i10 : ((i10 / 10) + 1) * 10;
    }

    public e(int r8, int r9, boolean r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: rc.e.<init>(int, int, boolean, float):void");
    }
}
