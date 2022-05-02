package p032c5;

import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import p020b5.C1189b0;

public final class C1610e {
    public final int f5930a;
    public final int f5931b;
    public final String f5932c;

    public C1610e(int i, int i2, String str) {
        this.f5930a = i;
        this.f5931b = i2;
        this.f5932c = str;
    }

    public static C1610e m36253a(C1189b0 b0Var) {
        String str;
        b0Var.m38146Q(2);
        int D = b0Var.m38159D();
        int i = D >> 1;
        int D2 = ((b0Var.m38159D() >> 3) & 31) | ((D & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = VisualSampleEntry.TYPE7;
        } else if (i != 9) {
            return null;
        } else {
            str = VisualSampleEntry.TYPE4;
        }
        String str2 = D2 < 10 ? ".0" : ".";
        StringBuilder sb2 = new StringBuilder(str.length() + 24 + str2.length());
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i);
        sb2.append(str2);
        sb2.append(D2);
        return new C1610e(i, D2, sb2.toString());
    }
}
