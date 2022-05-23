package v4;

import android.text.TextUtils;
import c5.a;

public final class b {
    public final int f24705a;
    public final int f24706b;
    public final int f24707c;
    public final int f24708d;
    public final int f24709e;

    public b(int i10, int i11, int i12, int i13, int i14) {
        this.f24705a = i10;
        this.f24706b = i11;
        this.f24707c = i12;
        this.f24708d = i13;
        this.f24709e = i14;
    }

    public static b a(String str) {
        char c10;
        a.a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < split.length; i14++) {
            String c11 = z6.b.c(split[i14].trim());
            c11.hashCode();
            switch (c11.hashCode()) {
                case 100571:
                    if (c11.equals("end")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3556653:
                    if (c11.equals("text")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109757538:
                    if (c11.equals("start")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (c11.equals("style")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    i11 = i14;
                    break;
                case 1:
                    i13 = i14;
                    break;
                case 2:
                    i10 = i14;
                    break;
                case 3:
                    i12 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i13 == -1) {
            return null;
        }
        return new b(i10, i11, i12, i13, split.length);
    }
}
