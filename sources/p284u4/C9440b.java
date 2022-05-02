package p284u4;

import android.text.TextUtils;
import p020b5.C1186a;
import p343y6.C10422b;

public final class C9440b {
    public final int f30596a;
    public final int f30597b;
    public final int f30598c;
    public final int f30599d;
    public final int f30600e;

    public C9440b(int i, int i2, int i3, int i4, int i5) {
        this.f30596a = i;
        this.f30597b = i2;
        this.f30598c = i3;
        this.f30599d = i4;
        this.f30600e = i5;
    }

    public static C9440b m8641a(String str) {
        char c;
        C1186a.m38189a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < split.length; i5++) {
            String c2 = C10422b.m5149c(split[i5].trim());
            c2.hashCode();
            switch (c2.hashCode()) {
                case 100571:
                    if (c2.equals("end")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (c2.equals("text")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (c2.equals("start")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (c2.equals("style")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    i2 = i5;
                    break;
                case 1:
                    i4 = i5;
                    break;
                case 2:
                    i = i5;
                    break;
                case 3:
                    i3 = i5;
                    break;
            }
        }
        if (i == -1 || i2 == -1 || i4 == -1) {
            return null;
        }
        return new C9440b(i, i2, i3, i4, split.length);
    }
}
